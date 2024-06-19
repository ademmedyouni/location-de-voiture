/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author DELL
 */
public class Voiture {
    private String matricule;
    private String marque;
    private String model;
    private String etat;
    private String disponibilite;
    private float prix;
    private int nb_fois_louee;

    // Constructor
    public Voiture(String matricule, String marque, String model, String etat, String disponibilite, float prix, int nb_fois_louee) {
        this.matricule = matricule;
        this.marque = marque;
        this.model = model;
        this.etat = etat;
        this.disponibilite = disponibilite;
        this.prix = prix;
        this.nb_fois_louee = nb_fois_louee;
    }

    // Setters
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setDisponibilite(String disponibilite) {
        this.disponibilite = disponibilite;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setNb_fois_louee(int nb_fois_louee) {
        this.nb_fois_louee = nb_fois_louee;
    }

    // Getters
    public String getMatricule() {
        return matricule;
    }

    public String getMarque() {
        return marque;
    }

    public String getModel() {
        return model;
    }

    public String getEtat() {
        return etat;
    }

    public String getDisponibilite() {
        return disponibilite;
    }

    public float getPrix() {
        return prix;
    }

    public int getNb_fois_louee() {
        return nb_fois_louee;
    }

    // toString method
    @Override
    public String toString() {
        return "Voiture{" +
                "matricule='" + matricule + '\'' +
                ", marque='" + marque + '\'' +
                ", model='" + model + '\'' +
                ", etat='" + etat + '\'' +
                ", disponibilite='" + disponibilite + '\'' +
                ", prix=" + prix +
                ", nb_fois_louee=" + nb_fois_louee +
                '}';
    }
}

