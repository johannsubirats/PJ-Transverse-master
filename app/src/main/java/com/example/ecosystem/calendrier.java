package com.example.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.TextView;


public class calendrier extends AppCompatActivity {

    CalendarView calendarView;
    TextView dateDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendrier);

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.imageButton1);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        dateDisplay = (TextView) findViewById(R.id.date_display);
        dateDisplay.setText("Date: ");


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                if ((i2 == 2) || (i2 == 9) || (i2 == 16) || (i2 == 23) || (i2 == 30) && i1 == 4){
                    dateDisplay.setText("Date: " + i2 + " / " + (i1+1) + " / " + i + "\n\n" + "Vous pouvez encore progresser vous ferez mieux demain");
                }
                else if ((i2 == 4) || (i2 == 7) ||(i2 == 11) || (i2 == 14) || (i2 == 18) || (i2 == 21) || (i2 == 25) || (i2 == 28) && i1 == 4){
                    dateDisplay.setText("Date: " + i2 + " / " + (i1+1) + " / " + i + "\n\n" + "Mauvaise balade...vous n'avez dépensé que 100 calories et fait la connaissance de personnes");
                }
                else{
                    dateDisplay.setText("Date: " + i2 + " / " + (i1+1) + " / " + i + "\n\n" + "Quelle balade! Vous vous êtes baladés 20 minutes, votre chien a dépensé 500 calories et vous avez rencontré un nouveau chien");
                }
            }
        });
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {


                        case R.id.imageButton1:
                            break;
                        case R.id.imageButton2:
                            Intent produit1 = new Intent(calendrier.this, photo.class);
                            startActivity(produit1);
                            break;
                        case R.id.imageButton3:
                            Intent produit2 = new Intent(calendrier.this, localisation.class);
                            startActivity(produit2);
                            break;
                        case R.id.imageButton4:
                            Intent produit3 = new Intent(calendrier.this, ProfileActivity.class);
                            startActivity(produit3);;
                            break;
                    }

                    return true;
                }
            };
}