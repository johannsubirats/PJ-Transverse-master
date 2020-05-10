package com.example.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class ProfileActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.imageButton4);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {


                        case R.id.imageButton1:
                            Intent produit1 = new Intent(ProfileActivity.this, calendrier.class);
                            startActivity(produit1);
                            break;
                        case R.id.imageButton2:
                            Intent produit2 = new Intent(ProfileActivity.this, photo.class);
                            startActivity(produit2);
                            break;
                        case R.id.imageButton3:
                            Intent produit3 = new Intent(ProfileActivity.this, localisation.class);
                            startActivity(produit3);
                            break;
                        case R.id.imageButton4:

                            break;


                    }

                    return true;
                }
            };
}