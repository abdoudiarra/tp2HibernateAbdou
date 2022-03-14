package ca.cal.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Livre extends Documents{

    public Livre(long id, String titre, String auteur, String editeur, int annee_de_publication, String genre_de_document, int date) {
        super(id, titre, auteur, editeur, annee_de_publication, genre_de_document, date);
    }
}
