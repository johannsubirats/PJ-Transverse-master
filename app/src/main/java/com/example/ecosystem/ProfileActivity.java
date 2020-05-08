package com.example.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.imageButton3);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {


                        case R.id.imageButton:
                            Intent produit0 = new Intent(ProfileActivity.this, Stat_balade.class);
                            startActivity(produit0);
                            break;
                        case R.id.imageButton1:
                            Intent produit1 = new Intent(ProfileActivity.this, photo.class);
                            startActivity(produit1);
                            break;
                        case R.id.imageButton2:
                            Intent produit2 = new Intent(ProfileActivity.this, localisation.class);
                            startActivity(produit2);
                            break;
                        case R.id.imageButton3:

                            break;


                    }

                    return true;
                }
            };
}