package ca.cal.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String adress;


    public Utilisateur(long id, String firstName, String lastName, String adress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }


}