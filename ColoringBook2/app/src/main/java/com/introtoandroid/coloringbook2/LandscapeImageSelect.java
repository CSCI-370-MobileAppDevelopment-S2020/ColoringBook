package com.introtoandroid.coloringbook2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LandscapeImageSelect extends AppCompatActivity {

    ImageView volcano;
    ImageView beach;

    private int imgId;

    private int RESPONSE_CODE = 1;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landscape_image_select);

        final Intent intent = new Intent();
        final Intent i = new Intent(this, SecondActivityMain.class);

        volcano = findViewById(R.id.volcano);
        beach = findViewById(R.id.beach);

        volcano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.volcano;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
                startActivityForResult(i, REQUEST_CODE);
            }
        });

        beach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.beach;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }
}
