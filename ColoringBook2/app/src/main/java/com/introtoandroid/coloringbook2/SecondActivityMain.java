package com.introtoandroid.coloringbook2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivityMain extends AppCompatActivity {

    TextView title;
    ImageView selectedPic;

    private int RESPONSE_CODE = 1;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);

        title = findViewById(R.id.clickedImageTxt);
        selectedPic = findViewById(R.id.clickedImage);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == REQUEST_CODE){
            if (resultCode == RESPONSE_CODE){
                int imgId = data.getExtras().getInt("imgId");
                selectedPic.setImageDrawable(getDrawable(imgId));
            }
        }
    }
}