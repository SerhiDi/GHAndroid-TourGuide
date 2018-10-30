package com.example.trazi.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);
        initList();
    }

    private void initList() {
        ArrayList<Place> places = new ArrayList<Place>();
        Place museumHistory = getPlaceItem(R.array.museum_history, R.drawable.museum_history);
        Place museumArt = getPlaceItem(R.array.museum_art, R.drawable.museum_art);
        Place museumSimonenko = getPlaceItem(R.array.museum_simonenko, R.drawable.museum_simonenko);

        places.add(museumHistory);
        places.add(museumArt);
        places.add(museumSimonenko);

        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.places_list);
        listView.setAdapter(adapter);
    }

    private Place getPlaceItem(int placeArrayId, int placeImageId) {
        String[] placeArray = getResources().getStringArray(placeArrayId);
        return new Place(placeArray[0], placeArray[1], placeImageId);
    }

}