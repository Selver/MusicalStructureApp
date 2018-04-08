package com.example.machomefolder.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PeacefulGuitarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song ("River Flows In You", "Miranda Boumedin"));
        songs.add(new Song("Braids", "Enrico Carmona"));
        songs.add(new Song("Twin Peaks Theme", "Henrik Janson"));
        songs.add(new Song("Forevermore", "Channing Spence"));
        songs.add(new Song("Flow", "Tom Ellenhag"));
        songs.add(new Song("The Ludlows", "Christopher Varela"));
        songs.add(new Song("Somewhere in Paris", "Henrik Janson"));
        songs.add(new Song("Before I Disappear", "Aaron Flemming"));
        songs.add(new Song("Gymnopedie", "Richard Mollenbeck"));
        songs.add(new Song("Moments", "Cindy Woon"));

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