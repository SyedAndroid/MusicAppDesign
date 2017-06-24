package com.example.syed.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.syed.musicstructureapp.R.id.track;
import static com.example.syed.musicstructureapp.R.id.genres;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tracks = (TextView) findViewById(R.id.track);

// Set a click listener on that View
        tracks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, CreatePlaylist.class);
                startActivity(numbersIntent);
            }
        });

        TextView genres = (TextView) findViewById(R.id.genres);

// Set a click listener on that View
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MainActivity.this, Genres.class);
                startActivity(genresIntent);
            }
        });

        TextView top_chart = (TextView) findViewById(R.id.top);

        top_chart.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                Intent chartIntent = new Intent(MainActivity.this,TopCharts.class);
                startActivity(chartIntent);
            }

        });

        TextView playlist = (TextView) findViewById(R.id.playlist);

        playlist.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                Intent playlistIntent = new Intent(MainActivity.this,Playlist.class);
                startActivity(playlistIntent);
            }

        });

        TextView play = (TextView) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                Intent playIntent = new Intent(MainActivity.this,NowPlaying.class);
                startActivity(playIntent);
            }

        });

        TextView setting = (TextView) findViewById(R.id.setting);

        setting.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                Intent settingIntent = new Intent(MainActivity.this,Login.class);
                startActivity(settingIntent);
            }

        });
    }

}


