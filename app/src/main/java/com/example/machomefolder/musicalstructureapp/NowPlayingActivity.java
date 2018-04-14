package com.example.machomefolder.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.media.MediaPlayer;

public class NowPlayingActivity extends AppCompatActivity {

    TextView songNameText;
    TextView artistNameText;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Intent incoming = getIntent();
        if (incoming == null)
            return;

        songNameText = findViewById(R.id.song_text_view2);
        artistNameText = findViewById(R.id.artist_text_view2);
        linearLayout = findViewById(R.id.linear_layout);

        songNameText.setText(incoming.getStringExtra(HappyHitsActivity.EXTRA_SONG_NAME));
        artistNameText.setText(incoming.getStringExtra(HappyHitsActivity.EXTRA_ARTIST_NAME));
        linearLayout.setBackgroundColor(incoming.getIntExtra(HappyHitsActivity.EXTRA_COLOR_NAME, 0));
    }
}
