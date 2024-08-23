package com.examen;

import java.util.List;

public class Parc extends Lieu {
    private List<Hotel>hotels;
    public Parc(String nom, Double longitude, Double latitude, String description, Evaluation evaluation, List<Hotel> hotels) {
        super(nom, longitude, latitude, description, evaluation);
        this.hotels = hotels;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public Parc setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
        return this;
    }
}
