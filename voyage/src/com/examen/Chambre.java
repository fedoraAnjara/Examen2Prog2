package com.examen;

public abstract class Chambre {
    private String numero;
    private Double tarifNuitee;
    private Evaluation evaluation;


    public Chambre(String numero, Double tarifNuitee, Evaluation evaluation) {
        this.numero = numero;
        this.tarifNuitee = tarifNuitee;
        this.evaluation = evaluation;
    }

    public String getNumero() {
        return numero;
    }

    public Chambre setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public Double getTarifNuitee() {
        return tarifNuitee;
    }

    public Chambre setTarifNuitee(Double tarifNuitee) {
        this.tarifNuitee = tarifNuitee;
        return this;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public Chambre setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
        return this;
    }
}
