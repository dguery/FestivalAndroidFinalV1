package org.joliverie.sio.festival01.metier;

import java.util.ArrayList;

public class Representation {

    private String id;

    private String dateRepres;

    private String heureDebut;

    private String heureFin;

    private String groupe;

    private String lieu;

    // Constructeur

    //public Representation(){}
    public Representation(String id, String dateRepres, String heureDebut, String heureFin, String groupe, String lieu) {
        this.id = id;
        this.dateRepres = dateRepres;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.groupe = groupe;
        this.lieu = lieu;
    }
    public Representation() {

    }

    @Override
    public String toString() {
        return "Date : " + dateRepres + '\n' +
                "Lieu : " + lieu + '\n' +
                "Groupe : " + groupe;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateRepres() {
        return dateRepres;
    }

    public void setDateRepres(String dateRepres) {
        this.dateRepres = dateRepres;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}