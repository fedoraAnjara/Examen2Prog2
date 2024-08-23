package com.examen;

import java.util.List;

public abstract class Lieu {
    private String nom;
    private Double longitude;
    private Double latitude;
    private String description;
    private List<Evaluation> evaluation;

    public Lieu(String nom, Double longitude, Double latitude, String description, List<Evaluation> evaluation) {
        this.nom = nom;
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
        this.evaluation = evaluation;

    }

    public String getNom() {
        return nom;
    }

    public Lieu setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Lieu setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Lieu setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Lieu setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Evaluation> getEvaluation() {
        return evaluation;
    }

    public Lieu setEvaluation(List<Evaluation> evaluation) {
        this.evaluation = evaluation;
        return this;
    }
}
