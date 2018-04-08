package com.example.machomefolder.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicForStudyingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song ("Find Beauty In Rain", "Etienne Dubois"));
        songs.add(new Song("Philein - Solo Violin Version", "Erika Schmidt"));
        songs.add(new Song("Say Goodbye", "Norris Foster"));
        songs.add(new Song("Sparkling - Song For Cello", "Hanna De Jong"));
        songs.add(new Song("Hello Autumn", "Harry Evans"));
        songs.add(new Song("Shine", "Charlotte Gudrun"));
        songs.add(new Song("Faraway", "Hans Overgraard"));
        songs.add(new Song("Moonlight River", "Dominik Andersen"));
        songs.add(new Song("Suite Emotion", "Josh Freeman"));
        songs.add(new Song("Angel Island", "Norris Foster"));

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
