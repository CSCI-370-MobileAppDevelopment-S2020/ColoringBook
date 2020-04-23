package com.introtoandroid.coloringbook2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button sportsBTN;
    Button foodBTN;
    Button archBTN;
    Button landBTN;
    Button animalBTN;
    Button plantsBTN;
    ImageButton brownBTN, redBTN, orangeBTN, yellowBTN, greenBTN, lblueBTN;
    ImageButton rblueBTN, purpleBTN, pinkBTN, whiteBTN, grayBTN, blackBTN;
    ImageButton newBTN, drawBTN, saveBTN, eraseBTN;
    DrawerLayout pad;
    Canvas canvas;
    Paint myPaint;
    Path drawPath;

    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sportsBTN = findViewById(R.id.sportsButton);
        foodBTN = findViewById(R.id.foodButton);
        archBTN = findViewById(R.id.architectureButton);
        animalBTN = findViewById(R.id.animalsButton);
        plantsBTN = findViewById(R.id.plantsButton);
        landBTN = findViewById(R.id.landscapeButton);
        myPaint = new Paint(R.color.selectedColor);
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

        blackBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPaint.setColor(Integer.parseInt("#FFFFFF"));
                Toast.makeText(MainActivity.this, "Black", Toast.LENGTH_LONG).show();
            }
        });

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
    }
}
