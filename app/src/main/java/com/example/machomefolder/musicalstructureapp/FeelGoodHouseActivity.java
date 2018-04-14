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

public class FeelGoodHouseActivity extends AppCompatActivity {

    private int colorCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Natural High", "Tobu"));
        songs.add(new Song("Tiger", "Dogena"));
        songs.add(new Song("Carpe Diem", "Ahrix"));
        songs.add(new Song("Trip", "Axero"));
        songs.add(new Song("Shadows", "Janji"));
        songs.add(new Song("Adventures", "Alex Skrindo"));
        songs.add(new Song("Phantasm", "Itro"));
        songs.add(new Song("Up And Away", "CMA"));
        songs.add(new Song("Thoughts", "Loch"));
        songs.add(new Song("Changes", "Axel Wernberg"));

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
                Intent intent = new Intent(FeelGoodHouseActivity.this, NowPlayingActivity.class);
                intent.putExtra(EXTRA_SONG_NAME, songs.get(position).getSongName());
                intent.putExtra(EXTRA_ARTIST_NAME, songs.get(position).getArtistName());
                intent.putExtra(EXTRA_COLOR_NAME, colorCode);
                startActivity(intent);
            }
        });
    }
}

