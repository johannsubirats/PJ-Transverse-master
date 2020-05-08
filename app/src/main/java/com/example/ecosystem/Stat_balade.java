package com.example.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import java.util.Calendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class Stat_balade extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stat_balade);

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.imageButton);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {

                        case R.id.imageButton2:
                            Intent produit2 = new Intent(Stat_balade.this, localisation.class);
                            startActivity(produit2);
                            break;
                        case R.id.imageButton3:
                            Intent produit3 = new Intent(Stat_balade.this, ProfileActivity.class);
                            startActivity(produit3);
                            break;
                        case R.id.imageButton:
                            break;
                        case R.id.imageButton1:
                            Intent produit1 = new Intent(Stat_balade.this, photo.class);
                            startActivity(produit1);;
                            break;
                    }

                    return true;
                }
            };
}