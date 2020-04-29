package com.introtoandroid.coloringbook2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Path;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivityMain extends AppCompatActivity {

    Button brushBTN;
    ImageButton brownBTN, redBTN, orangeBTN, yellowBTN, greenBTN, lblueBTN;
    ImageButton rblueBTN, purpleBTN, pinkBTN, whiteBTN, grayBTN, blackBTN;
    ImageButton newBTN, drawBTN, saveBTN, eraseBTN;
    Path drawPath;
    EditText brushSize;
    ImageView selectedPic;
    PaintView paintCanvas;
    private int RESPONSE_CODE = 1;
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);

        brownBTN = findViewById(R.id.brownButton);
        redBTN = findViewById(R.id.redButton);
        orangeBTN = findViewById(R.id.orangeButton);
        yellowBTN = findViewById(R.id.yellowButton);
        greenBTN = findViewById(R.id.greenButton);
        lblueBTN = findViewById(R.id.lightBlueButton);
        rblueBTN = findViewById(R.id.royalBlueButton);
        purpleBTN = findViewById(R.id.purpleButton);
        pinkBTN = findViewById(R.id.pinkButton);
        whiteBTN = findViewById(R.id.whiteButton);
        grayBTN = findViewById(R.id.grayButton);
        blackBTN = findViewById(R.id.blackButton);
        newBTN = findViewById(R.id.new_btn);
        drawBTN = findViewById(R.id.draw_btn);
        saveBTN = findViewById(R.id.save_btn);
        eraseBTN = findViewById(R.id.erase_btn);

        brushSize = findViewById(R.id.brushSize);
        brushBTN = findViewById(R.id.setBrushBtn);

        paintCanvas = findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintCanvas.init(metrics);

        selectedPic = findViewById(R.id.clickedImage);

        brushBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = Integer.parseInt(brushSize.getText().toString());
                paintCanvas.setBrush(size);
            }
        });

        eraseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(Color.WHITE);
            }
        });

        blackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(Color.BLACK);
            }
        });

        grayBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(Color.GRAY);
            }
        });

        whiteBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(Color.WHITE);
            }
        });

        pinkBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(0xFFFF6666);
            }
        });

        purpleBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(0xFF990099);
            }
        });

        rblueBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                paintCanvas.setColor(0xFF0000FF);
            }
        });

        lblueBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(0xFF009999);
            }
        });

        greenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(0xFF009900);
            }
        });

        yellowBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(0xFFFFCC00);
            }
        });

        orangeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(0xFFFF6600);
            }
        });

        redBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(Color.RED);
            }
        });

        brownBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintCanvas.setColor(0xFF660000);
            }
        });
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