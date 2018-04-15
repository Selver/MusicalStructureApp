package com.example.machomefolder.musicalstructureapp;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {
    //EXTRA_DATA are the container of the values.
    public static final String EXTRA_COLOR_NAME = "color";
    public static final String EXTRA_PLAYLIST_NAME = "playListName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find the view and set a click listener on it.
        final TextView happyHits = (TextView) findViewById(R.id.happy_hits);

        happyHits.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity is clicked on.
            @Override
            public void onClick(View view) {
                Intent happyHitsIntent = new Intent(HomeActivity.this, ListOfSongsActivity.class);
                if (happyHits.getBackground() instanceof ColorDrawable) {
                    ColorDrawable cd = (ColorDrawable) happyHits.getBackground();
                    happyHitsIntent.putExtra(EXTRA_COLOR_NAME, cd.getColor());
                    happyHitsIntent.putExtra(EXTRA_PLAYLIST_NAME, getString(R.string.happy_hits));
                }
                startActivity(happyHitsIntent);
            }
        });

        // Find the view and set a click listener on it.
        final TextView feelGoodHouse = (TextView) findViewById(R.id.feel_good_house);
        feelGoodHouse.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity is clicked on.
            @Override
            public void onClick(View view) {
                Intent feelGoodHouseIntent = new Intent(HomeActivity.this, ListOfSongsActivity.class);
                if (feelGoodHouse.getBackground() instanceof ColorDrawable) {
                    ColorDrawable cd = (ColorDrawable) feelGoodHouse.getBackground();
                    feelGoodHouseIntent.putExtra(EXTRA_COLOR_NAME, cd.getColor());
                    feelGoodHouseIntent.putExtra(EXTRA_PLAYLIST_NAME, getString(R.string.feel_good_house));
                }
                startActivity(feelGoodHouseIntent);
            }
        });

        // Find the view and set a click listener on it.
        final TextView jazzVibes = (TextView) findViewById(R.id.jazz_vibes);
        jazzVibes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity is clicked on.
            @Override
            public void onClick(View view) {
                Intent jazzVibesIntent = new Intent(HomeActivity.this, ListOfSongsActivity.class);
                if (jazzVibes.getBackground() instanceof ColorDrawable) {
                    ColorDrawable cd = (ColorDrawable) jazzVibes.getBackground();
                    jazzVibesIntent.putExtra(EXTRA_COLOR_NAME, cd.getColor());
                    jazzVibesIntent.putExtra(EXTRA_PLAYLIST_NAME, getString(R.string.jazz_vibes));
                }
                startActivity(jazzVibesIntent);
            }
        });

        // Find the view and set a click listener on it.
        final TextView musicForStudying = (TextView) findViewById(R.id.music_for_studying);
        musicForStudying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity is clicked on.
            @Override
            public void onClick(View view) {
                Intent musicForConcentrationIntent = new Intent(HomeActivity.this, ListOfSongsActivity.class);
                if (musicForStudying.getBackground() instanceof ColorDrawable) {
                    ColorDrawable cd = (ColorDrawable) musicForStudying.getBackground();
                    musicForConcentrationIntent.putExtra(EXTRA_COLOR_NAME, cd.getColor());
                    musicForConcentrationIntent.putExtra(EXTRA_PLAYLIST_NAME, getString(R.string.music_for_studying));
                }
                startActivity(musicForConcentrationIntent);
            }
        });

        // Find the view and set a click listener on it.
        final TextView peacefulGuitar = (TextView) findViewById(R.id.peaceful_guitar);
        peacefulGuitar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity is clicked on.
            @Override
            public void onClick(View view) {
                Intent peacefulGuitarIntent = new Intent(HomeActivity.this, ListOfSongsActivity.class);
                if (peacefulGuitar.getBackground() instanceof ColorDrawable) {
                    ColorDrawable cd = (ColorDrawable) peacefulGuitar.getBackground();
                    peacefulGuitarIntent.putExtra(EXTRA_COLOR_NAME, cd.getColor());
                    peacefulGuitarIntent.putExtra(EXTRA_PLAYLIST_NAME, getString(R.string.peaceful_guitar));
                }
                startActivity(peacefulGuitarIntent);
            }
        });

        // Find the view and set a click listener on it.
        final TextView rockClassics = (TextView) findViewById(R.id.rock_classics);
        rockClassics.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity is clicked on.
            @Override
            public void onClick(View view) {
                Intent rockClassicsIntent = new Intent(HomeActivity.this, ListOfSongsActivity.class);
                if (rockClassics.getBackground() instanceof ColorDrawable) {
                    ColorDrawable cd = (ColorDrawable) rockClassics.getBackground();
                    rockClassicsIntent.putExtra(EXTRA_COLOR_NAME, cd.getColor());
                    rockClassicsIntent.putExtra(EXTRA_PLAYLIST_NAME, getString(R.string.rock_classics));
                }
                startActivity(rockClassicsIntent);
            }
        });
    }
}


