/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author DELL
 */
public class Penalite {
    String id_location;
    double montant ;
    String num_carte_bancaire ; 
    
    
    // Constructor
    public Penalite(String id_location, double montant, String num_carte_bancaire) {
        this.id_location = id_location;
        this.montant = montant;
        this.num_carte_bancaire = num_carte_bancaire;
    }
    
    // Getters
    public String getIdLocation() {
        return id_location;
    }

    public double getMontant() {
        return montant;
    }

    public String getNumCarteBancaire() {
        return num_carte_bancaire;
    }
    
    // Setters
    public void setIdLocation(String id_location) {
        this.id_location = id_location;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setNumCarteBancaire(String num_carte_bancaire) {
        this.num_carte_bancaire = num_carte_bancaire;
    }
}
