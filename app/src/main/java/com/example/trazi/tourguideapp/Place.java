package com.example.trazi.tourguideapp;

import java.util.ResourceBundle;

public class Place {
    private String placeName;
    private String placeDescription;
    private int imageResourceId = NO_PROVIDED_IMAGE;
    private static final int NO_PROVIDED_IMAGE = -1;

    public Place(String placeName, String placeDescription) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
    }

    public Place(String placeName, String placeDescription, int imageResourceId) {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return NO_PROVIDED_IMAGE != imageResourceId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }
}
