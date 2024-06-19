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
public class Remboursement {
    String id_location ;
    float montant;
    Date date_remboursement;
    
     // Constructor
    public Remboursement(String id_location, float montant, Date date_remboursement) {
        this.id_location = id_location;
        this.montant = montant;
        this.date_remboursement = date_remboursement;
    }
    public Remboursement(String id_location, float montant) {
        this.id_location = id_location;
        this.montant = montant;
    }
    
    // Getters
    public String getIdLocation() {
        return id_location;
    }

    public float getMontant() {
        return montant;
    }

    public Date getDateRemboursement() {
        return date_remboursement;
    }
    
    // Setters
    public void setIdLocation(String id_location) {
        this.id_location = id_location;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public void setDateRemboursement(Date date_remboursement) {
        this.date_remboursement = date_remboursement;
    }
}
