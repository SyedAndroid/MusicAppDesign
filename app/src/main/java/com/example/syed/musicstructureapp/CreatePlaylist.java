package com.example.syed.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreatePlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_playlist);

        TextView playlist = (TextView) findViewById(R.id.button);

        playlist.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                Intent playlistIntent = new Intent(CreatePlaylist.this,Playlist.class);
                startActivity(playlistIntent);
            }

        });
    }
}
