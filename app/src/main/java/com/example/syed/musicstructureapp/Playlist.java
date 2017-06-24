package com.example.syed.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ImageView play1= (ImageView) findViewById(R.id.playicon);

        play1.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                Intent playIntent = new Intent(Playlist.this,NowPlaying.class);
                startActivity(playIntent);
            }

        });
    }
}
