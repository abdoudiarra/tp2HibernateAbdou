package ca.cal.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Bibliotheque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String nom;
    private String biblio;

    @OneToMany(mappedBy = "bibliotheque", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Documents> documentsList = new LinkedList<>();

    public Bibliotheque(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void addBook(Documents livre) {
        documentsList.add(livre);
        livre.setBibliotheque(this);
    }

    public List<Documents> getDocumentsList() {
        return documentsList;
    }
}
