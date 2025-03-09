/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
 import java.util.Date;
/**
 *
 * @author hp
 */
public class AffectationÉquipement {
    // Attributs
    
    private Salle salle;
    private Équipement equipement;
    private Date date_affectation;

    // Constructeur
    public AffectationÉquipement(Salle salle, Équipement equipement, Date date_affectation) {
       
        this.salle = salle;
        this.equipement = equipement;
        this.date_affectation = date_affectation;
    }

    // Getters et Setters

    public int getSalle_id() {
        return salle;
    }

    public void setSalle_id(Salle salle) {
        this.salle = salle;
    }

    public int getEquipement_id() {
        return equipement_id;
    }

    public void setEquipement_id(Équipement equipement) {
        this.equipement = equipement;
    }

    public Date getDate_affectation() {
        return date_affectation;
    }

    public void setDate_affectation(Date date_affectation) {
        this.date_affectation = date_affectation;
    }
}
    
