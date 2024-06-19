/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Location {
    
    int id;
    String cin;
    String matricule;
    Date date_debut;
    Date date_fin;
    Date date_retour;
    float total;
    String num_carte_bancaire;
    Date date_paiement;
    
    // Constructor
    public Location(int id, String cin, String matricule, Date date_debut, Date date_fin, Date date_retour,
                    float total, String num_carte_bancaire, Date date_paiement) {
        this.id = id;
        this.cin = cin;
        this.matricule = matricule;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.date_retour = date_retour;
        this.total = total;
        this.num_carte_bancaire = num_carte_bancaire;
        this.date_paiement = date_paiement;
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getCin() {
        return cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public Date getDateDebut() {
        return date_debut;
    }

    public Date getDateFin() {
        return date_fin;
    }

    public Date getDateRetour() {
        return date_retour;
    }

    public float getTotal() {
        return total;
    }

    public String getNumCarteBancaire() {
        return num_carte_bancaire;
    }

    public Date getDatePaiement() {
        return date_paiement;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setDateDebut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public void setDateFin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public void setDateRetour(Date date_retour) {
        this.date_retour = date_retour;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setNumCarteBancaire(String num_carte_bancaire) {
        this.num_carte_bancaire = num_carte_bancaire;
    }

    public void setDatePaiement(Date date_paiement) {
        this.date_paiement = date_paiement;
    }
    
}
