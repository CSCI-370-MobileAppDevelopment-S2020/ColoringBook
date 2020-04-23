package com.introtoandroid.coloringbook2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NatureImageSelect extends AppCompatActivity {

    ImageView flower;
    ImageView tree;

    private int imgId;

    private int RESPONSE_CODE = 1;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nature_image_select);

        final Intent intent = new Intent();
        final Intent i = new Intent(this, SecondActivityMain.class);

        flower = findViewById(R.id.flower);
        tree = findViewById(R.id.angelOakTree);

        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.flower;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
                startActivityForResult(i, REQUEST_CODE);
            }
        });

        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.angeloaktree;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }
}
