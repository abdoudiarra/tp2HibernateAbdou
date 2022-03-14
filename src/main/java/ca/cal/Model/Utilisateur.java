package ca.cal.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

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

    @OneToMany(mappedBy = "documents", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Documents> documentsList = new LinkedList<>();

    public Utilisateur(long id, String firstName, String lastName, String adress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public long getId() {
        return id;
    }

    public void addBook(Documents document){
        documentsList.add(document);
        document.setDocuments(document);
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