package com.example.machomefolder.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.machomefolder.musicalstructureapp.HomeActivity.EXTRA_PLAYLIST_NAME;

public class ListOfSongsActivity extends AppCompatActivity {
    final ArrayList<Song> songs = new ArrayList<Song>();

    public static final String EXTRA_SONG_NAME = "songName";
    public static final String EXTRA_ARTIST_NAME = "artistName";
    public static final String EXTRA_COLOR_NAME = "color";


    private int colorCode = 0;
    private String playListName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        Intent incoming = getIntent();
        if (incoming == null)
            return;
        colorCode = incoming.getIntExtra(EXTRA_COLOR_NAME, colorCode);
        playListName = incoming.getStringExtra(EXTRA_PLAYLIST_NAME);

        displaySongs();
    }
    // Display list of songs based on playlist chosen

    public void displaySongs() {
        if (playListName.equals(getString(R.string.happy_hits))) {

            songs.add(new Song("IDGAF", "Dua Lipa"));
            songs.add(new Song("Anyway", "Tyron Hapi, Mimoza"));
            songs.add(new Song("Heartline", "Craig David"));
            songs.add(new Song("Replay", "Davai, CIRE"));
            songs.add(new Song("Feels Great (feat. Fetty Wap & CVBZ", "Cheat Codes, Fetty Wap, CVBZ"));
            songs.add(new Song("1950", "King Princess"));
            songs.add(new Song("Feel Good", "Felix Jaehn, Mike Williams"));
            songs.add(new Song("Shivers", "Rachel Platten"));
            songs.add(new Song("I like me better", "Lauv"));
            songs.add(new Song("Dive With Me", "LVNDSCAPE, Cathrine Lassen"));

        } else if (playListName.equals(getString(R.string.feel_good_house))) {

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

        } else if (playListName.equals(getString(R.string.jazz_vibes))) {

            songs.add(new Song("Blue Orchard", "FloFilz"));
            songs.add(new Song("Strollin", "Otesla"));
            songs.add(new Song("Licence to Chill", "Brock Berrigan"));
            songs.add(new Song("Buddha Sack", "ENTRO//"));
            songs.add(new Song("Accade de Bali", "OJ Son"));
            songs.add(new Song("Cafe Nervosa", "Too Ugly"));
            songs.add(new Song("Seasons", "Kupla"));
            songs.add(new Song("Sakura Trees", "Saib"));
            songs.add(new Song("Moonlight", "Aair"));
            songs.add(new Song("Newage", "L One"));

        } else if (playListName.equals(getString(R.string.music_for_studying))) {

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

        } else if (playListName.equals(getString(R.string.peaceful_guitar))) {

            songs.add(new Song("River Flows In You", "Miranda Boumedin"));
            songs.add(new Song("Braids", "Enrico Carmona"));
            songs.add(new Song("Twin Peaks Theme", "Henrik Janson"));
            songs.add(new Song("Forevermore", "Channing Spence"));
            songs.add(new Song("Flow", "Tom Ellenhag"));
            songs.add(new Song("The Ludlows", "Christopher Varela"));
            songs.add(new Song("Somewhere in Paris", "Henrik Janson"));
            songs.add(new Song("Before I Disappear", "Aaron Flemming"));
            songs.add(new Song("Gymnopedie", "Richard Mollenbeck"));
            songs.add(new Song("Moments", "Cindy Woon"));

        } else if (playListName.equals(getString(R.string.rock_classics))) {

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
        }

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above.
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListOfSongsActivity.this, NowPlayingActivity.class);
                intent.putExtra(EXTRA_SONG_NAME, songs.get(position).getSongName());
                intent.putExtra(EXTRA_ARTIST_NAME, songs.get(position).getArtistName());
                intent.putExtra(EXTRA_COLOR_NAME, colorCode);
                startActivity(intent);
            }
        });
    }
}


