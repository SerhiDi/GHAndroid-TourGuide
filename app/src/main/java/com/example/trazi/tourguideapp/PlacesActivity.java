package com.example.trazi.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);
        initList();
    }

    private void initList() {
        ArrayList<Place> places = new ArrayList<Place>();
        Place dolinaRoz = getPlaceItem(R.array.place_dolina_roz, R.drawable.place_dolina_roz);
        Place zoo = getPlaceItem(R.array.place_zoo, R.drawable.place_zoo);
        Place fountain = getPlaceItem(R.array.place_music_fountain, R.drawable.place_music_fountain);

        places.add(dolinaRoz);
        places.add(zoo);
        places.add(fountain);

        PlaceAdapter adapter = new PlaceAdapter(this, places);
        ListView listView = (ListView) findViewById(R.id.places_list);
        listView.setAdapter(adapter);
    }

    private Place getPlaceItem(int placeArrayId, int placeImageId) {
        String[] placeArray = getResources().getStringArray(placeArrayId);
        return new Place(placeArray[0], placeArray[1], placeImageId);
    }
}
