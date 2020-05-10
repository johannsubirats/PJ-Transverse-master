package com.example.ecosystem;

import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class photo extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.imageButton2);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {


                        case R.id.imageButton1:
                            Intent produit1 = new Intent(photo.this, calendrier.class);
                            startActivity(produit1);
                            break;
                        case R.id.imageButton2:

                            break;
                        case R.id.imageButton3:
                            Intent produit3 = new Intent(photo.this, localisation.class);
                            startActivity(produit3);
                            break;
                        case R.id.imageButton4:
                            Intent produit4 = new Intent(photo.this, ProfileActivity.class);
                            startActivity(produit4);;
                            break;
                    }

                    return true;
                }
            };
}
