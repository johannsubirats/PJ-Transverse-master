package com.example.ecosystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

//import org.osmdroid.util.GeoPoint;

public class localisation extends FragmentActivity implements OnMapReadyCallback {



    private GoogleMap mMap;
    private Button BtnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.localisation);



        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        bottomNavigationView.setSelectedItemId(R.id.imageButton3);

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
                        new LatLng(48.77744, 2.3530) ,
                        new LatLng(48.7776, 2.35361)
                ));
        // Store a data object with the polyline, used here to indicate an arbitrary type.
        polyline1.setTag("A");
        Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(48.77744, 2.3530),
                        new LatLng(48.778, 2.35270)
                ));
        // Store a data object with the polyline, used here to indicate an arbitrary type.
        polyline2.setTag("B");
        Polyline polyline3 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(48.778, 2.35270),
                        new LatLng(48.77855, 2.35476)
                ));
        // Store a data object with the polyline, used here to indicate an arbitrary type.
        polyline3.setTag("C");
        Polyline polyline4 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(48.77855, 2.35476),
                        new LatLng(48.77790, 2.35485)
                ));
        // Store a data object with the polyline, used here to indicate an arbitrary type.
        polyline4.setTag("D");
        Polyline polyline5 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(48.77790, 2.35485),
                        new LatLng(48.7776, 2.35361)
                ));
        // Store a data object with the polyline, used here to indicate an arbitrary type.
        polyline5.setTag("E");

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(48.7774, 2.3532), 16));
        LatLng maison = new LatLng(48.7775, 2.3534);
        googleMap.addMarker(new MarkerOptions().position(maison)
                .title("Mon p'tit chien").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(maison));
        LatLng  destination = new LatLng(48.7775, 2.35350);
        googleMap.addMarker(new MarkerOptions().position(destination)
                .title("Son chien ami, double-cliquez pour l'ajouter à vos amis").icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(destination));

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {


                        case R.id.imageButton1:
                            Intent produit1 = new Intent(localisation.this, calendrier.class);
                            startActivity(produit1);
                            break;
                        case R.id.imageButton2:
                            Intent produit2 = new Intent(localisation.this, photo.class);
                            startActivity(produit2);
                            break;
                        case R.id.imageButton3:

                            break;
                        case R.id.imageButton4:
                            Intent produit4 = new Intent(localisation.this, ProfileActivity.class);
                            startActivity(produit4);;
                            break;
                    }

                    return true;
                }
            };
}