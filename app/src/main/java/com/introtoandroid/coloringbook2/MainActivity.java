package com.introtoandroid.coloringbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button brushBTN;
    Button sportsBTN;
    Button foodBTN;
    Button archBTN;
    Button landBTN;
    Button animalBTN;
    Button plantsBTN;
    ImageButton brownBTN, redBTN, orangeBTN, yellowBTN, greenBTN, lblueBTN;
    ImageButton rblueBTN, purpleBTN, pinkBTN, whiteBTN, grayBTN, blackBTN;
    ImageButton newBTN, drawBTN, saveBTN, eraseBTN;
    PaintView paintCanvas;
    Path drawPath;
    EditText brushSize;

    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paintCanvas = findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintCanvas.init(metrics);


        brushSize = findViewById(R.id.brushSize);
        brushBTN = findViewById(R.id.setBrushBtn);
        sportsBTN = findViewById(R.id.sportsButton);
        foodBTN = findViewById(R.id.foodButton);
        archBTN = findViewById(R.id.architectureButton);
        animalBTN = findViewById(R.id.animalsButton);
        plantsBTN = findViewById(R.id.plantsButton);
        landBTN = findViewById(R.id.landscapeButton);

        drawPath = new Path();
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

        final Intent s = new Intent(this, SportsImageSelect.class);
        final Intent p = new Intent(this, NatureImageSelect.class);
        final Intent f = new Intent(this, FoodImageSelect.class);
        final Intent l = new Intent(this, LandscapeImageSelect.class);
        final Intent a = new Intent(this, AnimalsImageSelect.class);
        final Intent ar = new Intent(this, ArchitectureImageSelect.class);


        sportsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(s, REQUEST_CODE);
            }
        });

        plantsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(p, REQUEST_CODE);
            }
        });

        foodBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(f, REQUEST_CODE);
            }
        });

        landBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(l, REQUEST_CODE);
            }
        });

        animalBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(a, REQUEST_CODE);
            }
        });

        archBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(ar, REQUEST_CODE);
            }
        });

        brushBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = Integer.parseInt(brushSize.getText().toString());
                paintCanvas.setBrush(size);
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

}
