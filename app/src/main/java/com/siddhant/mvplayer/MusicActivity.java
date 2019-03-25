package com.siddhant.mvplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicActivity extends AppCompatActivity implements View.OnClickListener{
    private Button play,pause,stop;
    MediaPlayer mediaPlayer;
    int currentpp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        play=findViewById(R.id.btn_play);
        pause=findViewById(R.id.btn_pause);
        stop=findViewById(R.id.stop);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
    }
    public void stopmedia(){
        if(mediaPlayer!=null){
        mediaPlayer.stop();
        mediaPlayer=null;
        }
        startActivity(new Intent(this,MainActivity.class));
    }
    @Override
    public void onClick(View v) {
        if(v==play){
            if(mediaPlayer==null){
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.music);
        mediaPlayer.start();}
            else if(!mediaPlayer.isPlaying()){
                mediaPlayer.seekTo(currentpp);
                mediaPlayer.start();
            }
        }
       if(v==pause){
        if(mediaPlayer!=null){
            mediaPlayer.pause();
            currentpp=mediaPlayer.getCurrentPosition();

        }

        }
       if(v==stop){
        stopmedia();
        }

    }
}
