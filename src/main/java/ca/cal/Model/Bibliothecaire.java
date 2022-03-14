package ca.cal.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Bibliothecaire extends Utilisateur{

    public Bibliothecaire(long id, String firstName, String lastName, String adress) {
        super(id, firstName, lastName, adress);
    }
}
