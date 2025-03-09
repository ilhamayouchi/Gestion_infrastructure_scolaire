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
    private int id;
    private int salle_id;
    private int equipement_id;
    private Date date_affectation;

    // Constructeur
    public AffectationÉquipement(int id, int salle_id, int equipement_id, Date date_affectation) {
        this.id = id;
        this.salle_id = salle_id;
        this.equipement_id = equipement_id;
        this.date_affectation = date_affectation;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalle_id() {
        return salle_id;
    }

    public void setSalle_id(int salle_id) {
        this.salle_id = salle_id;
    }

    public int getEquipement_id() {
        return equipement_id;
    }

    public void setEquipement_id(int equipement_id) {
        this.equipement_id = equipement_id;
    }

    public Date getDate_affectation() {
        return date_affectation;
    }

    public void setDate_affectation(Date date_affectation) {
        this.date_affectation = date_affectation;
    }
}
    
