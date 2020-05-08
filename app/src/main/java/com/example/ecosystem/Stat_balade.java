package com.example.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import java.util.Calendar;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class Stat_balade extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
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
                            Intent produit4 = new Intent(Stat_balade.this, ProfileActivity.class);
                            startActivity(produit4);
                            break;
                        case R.id.imageButton:
                            break;
                        case R.id.imageButton1:
                            Intent produit5 = new Intent(Stat_balade.this, logocentral.class);
                            startActivity(produit5);;
                            break;
                    }

                    return true;
                }
            };
}