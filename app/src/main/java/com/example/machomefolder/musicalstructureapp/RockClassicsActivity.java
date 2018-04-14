package com.example.machomefolder.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.machomefolder.musicalstructureapp.HappyHitsActivity.EXTRA_ARTIST_NAME;
import static com.example.machomefolder.musicalstructureapp.HappyHitsActivity.EXTRA_COLOR_NAME;
import static com.example.machomefolder.musicalstructureapp.HappyHitsActivity.EXTRA_SONG_NAME;

public class RockClassicsActivity extends AppCompatActivity {

    int colorCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("How You Remind Me", "Nickelback"));
        songs.add(new Song("Semi - Charmed Life", "Third Eye Blind"));
        songs.add(new Song("Ironic", "Alanis Morissette"));
        songs.add(new Song("Tush", "ZZ Top"));
        songs.add(new Song("Push", "Matchbox Twenty"));
        songs.add(new Song("Black Velvet", "Alannah Myles"));
        songs.add(new Song("Unchain My Heart", "Joe Cocker"));
        songs.add(new Song("Aqualung", "Jethro Tull"));
        songs.add(new Song("In-A-Gadda-Da-Vida", "Iron Butterfly"));
        songs.add(new Song("Rock & Roll", "The Velvet Underground"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above.
        listView.setAdapter(adapter);

        Intent incoming = getIntent();
        if (incoming == null)
            return;
        colorCode = incoming.getIntExtra(EXTRA_COLOR_NAME, colorCode);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(RockClassicsActivity.this, NowPlayingActivity.class);
                intent.putExtra(EXTRA_SONG_NAME, songs.get(position).getSongName());
                intent.putExtra(EXTRA_ARTIST_NAME, songs.get(position).getArtistName());
                intent.putExtra(EXTRA_COLOR_NAME, colorCode);
                startActivity(intent);
            }
        });
    }
}