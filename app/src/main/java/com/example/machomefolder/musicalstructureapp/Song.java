package com.example.machomefolder.musicalstructureapp;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Song {
    private String mSongName;
    private String mArtistName;


    public Song (String songName, String artistName ){

        mSongName = songName;
        mArtistName = artistName;
    }

    public String getSongName(){
        return mSongName;
    }
    public String getArtistName () {
        return mArtistName;
    }

}