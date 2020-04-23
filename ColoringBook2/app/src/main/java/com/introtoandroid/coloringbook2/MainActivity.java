package com.introtoandroid.coloringbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sportsBTN;
    Button foodBTN;
    Button archBTN;
    Button landBTN;
    Button animalBTN;
    Button plantsBTN;

    private int RESPONSE_CODE = 1;
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
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == REQUEST_CODE){
            if (resultCode == RESPONSE_CODE){
                int imgId = data.getExtras().getInt("imgId");
            }
        }
    }
}
