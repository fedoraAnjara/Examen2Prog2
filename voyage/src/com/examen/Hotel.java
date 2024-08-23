package com.examen;

import java.util.List;

public class Hotel extends Lieu{
    private String contact;
    private List<Chambre> chambres;

    public Hotel(String nom, Double longitude, Double latitude, String description, List<Evaluation> evaluation, String contact, List<Chambre>chambres) {
        super(nom, longitude, latitude, description, evaluation);
        this.contact = contact;
        this.chambres = chambres;
    }

    public String getContact() {
        return contact;
    }

    public Hotel setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public Hotel setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
        return this;
    }
}
