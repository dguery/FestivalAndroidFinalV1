package org.joliverie.sio.festival01.metier;

public class Lieu {

    String id;
    String nom;
    String adresse;
    String capAccueil;

    //constructeur
    public Lieu(String id, String nom, String adresse, String capAccueil) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.capAccueil = capAccueil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCapAccueil() {
        return capAccueil;
    }

    public void setCapAccueil(String capAccueil) {
        this.capAccueil = capAccueil;
    }
}