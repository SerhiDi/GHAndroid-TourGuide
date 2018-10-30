package com.example.trazi.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initEvents();
    }

    private void initEvents() {
        int placesTextViewId = R.id.places_view;
        addClickListener(placesTextViewId, PlacesActivity.class);

        int museumsTextViewId = R.id.museums_view;
        addClickListener(museumsTextViewId, MuseumsActivity.class);
    }

    private void addClickListener(int id, final Class<? extends Activity> ActivityToOpen) {
        TextView textView = (TextView) findViewById(id);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(getBaseContext(), ActivityToOpen);
                startActivity(activityIntent);
            }
        });
    }
}
