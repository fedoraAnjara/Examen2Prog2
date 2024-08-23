package com.examen;

import java.util.ArrayList;
import java.util.List;

public class GestionEvaluation {
    private List<Evaluation> evaluations;
    public GestionEvaluation() {
        this.evaluations = new ArrayList<>();
    }

    public void addReview (Evaluation evaluation){
        evaluations.add(evaluation);
    }

    public List<Evaluation> getAllReviews(){
        return evaluations;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }
}
