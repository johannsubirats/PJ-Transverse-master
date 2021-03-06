package com.example.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class SplashScreen extends AppCompatActivity {

    private static int temps = 6000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,ProfileActivity.class);
                startActivity(intent);
                finish();
            }
        },temps);
    }
}
