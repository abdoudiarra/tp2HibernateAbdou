package ca.cal.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Lecteur extends Utilisateur{

    private double solde;

    public Lecteur(long id, String firstName, String lastName, String adress, double solde) {
        super(id, firstName, lastName, adress);
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }
}
