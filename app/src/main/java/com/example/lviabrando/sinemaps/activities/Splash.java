package com.example.lviabrando.sinemaps.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lviabrando.sinemaps.R;
import com.example.lviabrando.sinemaps.activities.MapsActivity;

public class Splash extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed (this, 10000);
    }



    @Override
    public void run() {
        startActivity(new Intent(this, MapsActivity.class));
        finish();
    }
}
