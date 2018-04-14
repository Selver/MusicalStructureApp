package com.example.machomefolder.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class HappyHitsActivity extends AppCompatActivity{

    public static final String EXTRA_SONG_NAME = "songName";
    public static final String EXTRA_ARTIST_NAME = "artistName";
    public static final String EXTRA_COLOR_NAME = "color";

    private int colorCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song ("IDGAF", "Dua Lipa"));
        songs.add(new Song("Anyway", "Tyron Hapi, Mimoza"));
        songs.add(new Song("Heartline", "Craig David"));
        songs.add(new Song("Replay", "Davai, CIRE"));
        songs.add(new Song("Feels Great(feat.Fetty Wap & CVBZ", "Cheat Codes, Fetty Wap, CVBZ"));
        songs.add(new Song("1950", "King Princess"));
        songs.add(new Song("Feel Good", "Felix Jaehn, Mike Williams"));
        songs.add(new Song("Shivers", "Rachel Platten"));
        songs.add(new Song("I like me better", "Lauv"));
        songs.add(new Song("Dive With Me", "LVNDSCAPE, Cathrine Lassen"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list.
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
                Intent intent = new Intent(HappyHitsActivity.this, NowPlayingActivity.class);
                intent.putExtra(EXTRA_SONG_NAME, songs.get(position).getSongName());
                intent.putExtra(EXTRA_ARTIST_NAME, songs.get(position).getArtistName());
                intent.putExtra(EXTRA_COLOR_NAME, colorCode);
                  startActivity(intent);
            }
        });
    }
}
