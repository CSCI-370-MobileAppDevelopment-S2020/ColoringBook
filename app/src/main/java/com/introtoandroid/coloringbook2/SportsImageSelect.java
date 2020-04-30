package com.introtoandroid.coloringbook2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SportsImageSelect extends AppCompatActivity {

    ImageView logo;
    ImageView mascot;

    private int imgId;

    private int RESPONSE_CODE = 1;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_image_select);

        final Intent intent = new Intent();
        final Intent i = new Intent(this, SecondActivityMain.class);

        logo = findViewById(R.id.cofcLogo);
        mascot = findViewById(R.id.cofcMascot);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.cofclogo;

                i.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, i);
                //finish();
                startActivityForResult(i, REQUEST_CODE);
            }
        });

        mascot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(i, REQUEST_CODE);
            }
        });

    }

}
