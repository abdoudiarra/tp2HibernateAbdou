package ca.cal.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Bibliotheque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;


//    List<Documents> documentsList;

    public Bibliotheque(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

//    public List<Documents> getDocumentsList() {
//        return documentsList;
//    }
}
