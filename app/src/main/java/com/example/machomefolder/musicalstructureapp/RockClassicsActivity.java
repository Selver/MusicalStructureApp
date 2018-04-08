package com.example.machomefolder.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockClassicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song ("How You Remind Me", "Nickelback"));
        songs.add(new Song("Semi - Charmed Life", "Third Eye Blind"));
        songs.add(new Song("Ironic", "Alanis Morissette"));
        songs.add(new Song("Tush", "ZZ Top"));
        songs.add(new Song("Push", "Matchbox Twenty"));
        songs.add(new Song("Black Velvet", "Alannah Myles"));
        songs.add(new Song("Unchain My Heart", "Joe Cocker"));
        songs.add(new Song("Aqualung", "Jethro Tull"));
        songs.add(new Song("In-A-Gadda-Da-Vida", "Iron Butterfly"));
        songs.add(new Song("Rock & Roll", "The Velvet Underground"));

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
