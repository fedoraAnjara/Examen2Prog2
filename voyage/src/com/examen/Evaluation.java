package com.examen;

import java.time.LocalDate;

public class Evaluation {
    private Utilisateur utilisateur;
    private int score;
    private String commentaire;
    private LocalDate datePublication;

    public Evaluation(Utilisateur utilisateur, int score, String commentaire, LocalDate datePublication) {
        this.utilisateur = utilisateur;
        this.score = score;
        this.commentaire = commentaire;
        this.datePublication = datePublication;
    }

    public String getUtilisateur() {
        return utilisateur.getNom() +" " + utilisateur.getEmail();
    }

    public Evaluation setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
        return this;
    }

    public int getScore() {
        if (score>=0 && score<= 5){
            return score;
        }else {
            throw new IllegalArgumentException("le score doit etre entre 0 et 5");
        }
    }

    public Evaluation setScore(int score) {
        this.score = score;
        return this;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public Evaluation setCommentaire(String commentaire) {
        this.commentaire = commentaire;
        return this;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public Evaluation setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
        return this;
    }

}
