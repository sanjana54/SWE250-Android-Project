package com.hafiz.reach_main_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GardenerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardener);


        Button b = findViewById(R.id.back3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(GardenerActivity.this, homepage_activity.class);
                startActivity(in);
            }
        });
        Button b1 = findViewById(R.id.Confirm);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GardenerActivity.this,GardenerConfirmActivity.class));
            }
        });
        //MenuBar

        ImageView home = findViewById(R.id.Home_home);
        ImageView prof = findViewById(R.id.Home_prof);
        ImageView cart = findViewById(R.id.home_cart);
        ImageView supp = findViewById(R.id.Home_Supp);
        ImageView sett = findViewById(R.id.Home_sett);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GardenerActivity.this,homepage_activity.class));

            }
        });
        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GardenerActivity.this,profile_activity.class));
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GardenerActivity.this,CartListActivity.class));
            }
        });
        supp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GardenerActivity.this,Support_activity.class));
            }
        });
        sett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GardenerActivity.this,Settings_activity.class));
            }
        });
    }
}