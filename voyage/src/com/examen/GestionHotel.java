package com.examen;

import java.util.ArrayList;
import java.util.List;

public class GestionHotel {
    private List<Chambre> chambreHotelsAVisiter;
    public GestionHotel() {
        chambreHotelsAVisiter = new ArrayList<>();
    }

    public void findBestHotel(){

    }

    public Double findCheapestHotelPrice(){
        for (Chambre chambre : chambreHotelsAVisiter) {
            return chambre.getTarifNuitee();
        }
        return null;
    }

    public List<Chambre> getHotels() {
        return chambreHotelsAVisiter;
    }

    public GestionHotel setHotels(List<Chambre> chambreHotelsAVisiter) {
        this.chambreHotelsAVisiter = chambreHotelsAVisiter;
        return this;
    }
}
