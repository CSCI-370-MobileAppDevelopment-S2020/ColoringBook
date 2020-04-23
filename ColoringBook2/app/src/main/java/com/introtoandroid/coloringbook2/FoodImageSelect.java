package com.introtoandroid.coloringbook2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodImageSelect extends AppCompatActivity {

    ImageView pizza;
    ImageView iceCream;

    private int imgId;

    private int RESPONSE_CODE = 1;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_image_select);

        final Intent intent = new Intent();
        final Intent i = new Intent(this, SecondActivityMain.class);

        pizza = findViewById(R.id.pizza);
        iceCream = findViewById(R.id.icecream);

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.pizza;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
                startActivityForResult(i, REQUEST_CODE);
            }
        });

        iceCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.icecream;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }
}
