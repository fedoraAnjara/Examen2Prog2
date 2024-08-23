package com.examen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GestionLieux {
    public List<Lieu> lieux;

    public List<Lieu> getAllPlacesInside(double latMin, double latMax, double lonMin, double lonMax) {
        List<Lieu> placesInside = new ArrayList<>();
        for (Lieu lieu : lieux) {
            if (lieu.getLatitude() >= latMin && lieu.getLatitude() <= latMax &&
                    lieu.getLongitude() >= lonMin && lieu.getLongitude() <= lonMax) {
                placesInside.add(lieu);
            }
        }
        return placesInside;
    }

    public List<Lieu> getAllReviewedItems(List<Evaluation> evaluations) {
        List<Lieu> placeReviewed = new ArrayList<>();
        for (Lieu lieu : lieux) {
            if (new HashSet<>(lieu.getEvaluation()).containsAll(evaluations)) {
                placeReviewed.add(lieu);
            }
        }
        return placeReviewed;
    }

    public GestionLieux() {
        lieux = new ArrayList<>();
    }
}
