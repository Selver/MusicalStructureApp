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

public class MusicForStudyingActivity extends AppCompatActivity {

    int colorCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Find Beauty In Rain", "Etienne Dubois"));
        songs.add(new Song("Philein - Solo Violin Version", "Erika Schmidt"));
        songs.add(new Song("Say Goodbye", "Norris Foster"));
        songs.add(new Song("Sparkling - Song For Cello", "Hanna De Jong"));
        songs.add(new Song("Hello Autumn", "Harry Evans"));
        songs.add(new Song("Shine", "Charlotte Gudrun"));
        songs.add(new Song("Faraway", "Hans Overgraard"));
        songs.add(new Song("Moonlight River", "Dominik Andersen"));
        songs.add(new Song("Suite Emotion", "Josh Freeman"));
        songs.add(new Song("Angel Island", "Norris Foster"));

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
                Intent intent = new Intent(MusicForStudyingActivity.this, NowPlayingActivity.class);
                intent.putExtra(EXTRA_SONG_NAME, songs.get(position).getSongName());
                intent.putExtra(EXTRA_ARTIST_NAME, songs.get(position).getArtistName());
                intent.putExtra(EXTRA_COLOR_NAME, colorCode);
                startActivity(intent);
            }
        });
    }
}
