package com.example.bidanbunda2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Splashscreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        splashscreen();


    }

    private void splashscreen() {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(i);
            }
        }, 2000);
    }
}
