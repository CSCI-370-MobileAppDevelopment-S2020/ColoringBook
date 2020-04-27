package com.introtoandroid.coloringbook2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AnimalsImageSelect extends AppCompatActivity {

    ImageView jFish;
    ImageView giraffe;

    private int imgId;

    private int RESPONSE_CODE = 1;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animals_image_select);

        final Intent intent = new Intent();
        final Intent i = new Intent(this, SecondActivityMain.class);

        jFish = findViewById(R.id.jelly);
        giraffe = findViewById(R.id.giraffe);

        jFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.jellyfish;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
                startActivityForResult(i, REQUEST_CODE);
            }
        });

        giraffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.giraffe;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }
}
