package com.example.recyclerview;

public class Client {

    private String nom;
    private String prenom;
    private int image;

    public Client(String nom, String prenom, int image) {
        this.nom = nom;
        this.prenom = prenom;
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return nom + ' ' + prenom;
    }
}
