package com.example.machomefolder.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JazzVibesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song ("Blue Orchard", "FloFilz"));
        songs.add(new Song("Strollin", "Otesla"));
        songs.add(new Song("Licence to Chill", "Brock Berrigan"));
        songs.add(new Song("Buddha Sack", "ENTRO//"));
        songs.add(new Song("Accade de Bali", "OJ Son"));
        songs.add(new Song("Cafe Nervosa", "Too Ugly"));
        songs.add(new Song("Seasons", "Kupla"));
        songs.add(new Song("Sakura Trees", "Saib"));
        songs.add(new Song("Moonlight", "Aair"));
        songs.add(new Song("Newage", "L One"));

// Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
