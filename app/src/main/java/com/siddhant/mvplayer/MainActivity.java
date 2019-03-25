package com.siddhant.mvplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mbt,vbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbt=findViewById(R.id.music);
        vbt=findViewById(R.id.video);
        mbt.setOnClickListener(this);
        vbt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==mbt){
            startActivity(new Intent(this,MusicActivity.class));
        }
        if(v==vbt){
            startActivity(new Intent(this,CameraActivity.class));
        }

    }
}
