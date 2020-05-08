package com.example.ecosystem;

import android.database.Cursor;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class photo extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.imageButton1);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {


                        case R.id.imageButton:
                            Intent produit0 = new Intent(photo.this, Stat_balade.class);
                            startActivity(produit0);
                            break;
                        case R.id.imageButton1:
                            Intent produit1 = new Intent(photo.this, photo.class);
                            startActivity(produit1);
                            break;
                        case R.id.imageButton2:
                            Intent produit2 = new Intent(photo.this, localisation.class);
                            startActivity(produit2);
                            break;
                        case R.id.imageButton3:
                            Intent produit3 = new Intent(photo.this, ProfileActivity.class);
                            startActivity(produit3);;
                            break;
                    }

                    return true;
                }
            };
}
