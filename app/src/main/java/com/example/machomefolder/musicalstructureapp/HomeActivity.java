package com.example.machomefolder.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find the view and set a click listener on it.
        TextView happyHits = (TextView) findViewById(R.id.happy_hits);
        happyHits.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the home View is clicked on.
            @Override
            public void onClick(View view) {
                Intent happyHitsIntent = new Intent(HomeActivity.this, HappyHitsActivity.class);
                startActivity(happyHitsIntent);
            }
        });

        // Find the view and set a click listener on it.
        TextView feelGoodHouse = (TextView) findViewById(R.id.feel_good_house);
        feelGoodHouse.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the home View is clicked on.
            @Override
            public void onClick(View view) {
                Intent feelGoodHouseIntent = new Intent(HomeActivity.this, FeelGoodHouseActivity.class);
                startActivity(feelGoodHouseIntent);
            }
        });

// Find the view and set a click listener on it.
        TextView jazzVibes = (TextView) findViewById(R.id.jazz_vibes);
        jazzVibes.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the home View is clicked on.
            @Override
            public void onClick(View view) {
                Intent jazzVibesIntent = new Intent(HomeActivity.this, JazzVibesActivity.class);
                startActivity(jazzVibesIntent);
            }
        });

        // Find the view and set a click listener on it.
        TextView musicForConcentration = (TextView) findViewById(R.id.music_for_concentration);
        musicForConcentration.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the home View is clicked on.
            @Override
            public void onClick(View view) {
                Intent musicForConcentrationIntent = new Intent(HomeActivity.this, MusicForStudyingActivity.class);
                startActivity(musicForConcentrationIntent);
            }
        });

        // Find the view and set a click listener on it.
        TextView peacefulGuitar = (TextView) findViewById(R.id.peaceful_guitar);
        peacefulGuitar.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the home View is clicked on.
            @Override
            public void onClick(View view) {
                Intent peacefulGuitarIntent = new Intent(HomeActivity.this, PeacefulGuitarActivity.class);
                startActivity(peacefulGuitarIntent);
            }
        });

        // Find the view and set a click listener on it.
        TextView rockClassics = (TextView) findViewById(R.id.rock_classics);
        rockClassics.setOnClickListener(new View.OnClickListener()
        {
            // The code in this method will be executed when the home View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rockClassicsIntent = new Intent(HomeActivity.this, RockClassicsActivity.class);
                startActivity(rockClassicsIntent);
            }
        });

    }


    }


