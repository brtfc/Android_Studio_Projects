package com.princeadom.segwatrentalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //variable declarations
    private Button rent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rent = findViewById(R.id.rentButton_ID);
        rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayTourPage();
            }
        });
    }

    //create an intent within the displayTourPage method to fetch the tour page screen
    public void displayTourPage(){
        Intent fetchPage = new Intent(this, TourPage.class);
        startActivity(fetchPage);
    }
}
