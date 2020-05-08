package com.example.ecosystem;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import org.osmdroid.util.GeoPoint;

public class localisation extends FragmentActivity implements OnMapReadyCallback {


//coucoumarco
    private GoogleMap mMap;
    private Button BtnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.localisation);

        BtnMove = findViewById(R.id.Btnlocalisation); //bouton vers stat balade
        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityStat();
            }
        });

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        bottomNavigationView.setSelectedItemId(R.id.imageButton2);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private void moveToActivityStat(){
        Intent intent = new Intent(localisation.this, localisation.class);
        startActivity(intent);
    }


    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(48.7774, 2.3532) ,
                        new LatLng(48.7776, 2.35361)
                ));
        // Store a data object with the polyline, used here to indicate an arbitrary type.
        polyline1.setTag("A");

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(48.7774, 2.3532), 16));
        LatLng maison = new LatLng(48.7774, 2.3532);
        googleMap.addMarker(new MarkerOptions().position(maison)
                .title("Marker in my home"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(maison));
        LatLng  destination = new LatLng(48.7776, 2.35361);
        googleMap.addMarker(new MarkerOptions().position(destination)
                .title("Marker where my dog goes"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(destination));

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {


                        case R.id.imageButton:
                            Intent produit0 = new Intent(localisation.this, Stat_balade.class);
                            startActivity(produit0);
                            break;
                        case R.id.imageButton1:
                            Intent produit1 = new Intent(localisation.this, photo.class);
                            startActivity(produit1);
                            break;
                        case R.id.imageButton2:

                            break;
                        case R.id.imageButton3:
                            Intent produit3 = new Intent(localisation.this, ProfileActivity.class);
                            startActivity(produit3);;
                            break;
                    }

                    return true;
                }
            };
}