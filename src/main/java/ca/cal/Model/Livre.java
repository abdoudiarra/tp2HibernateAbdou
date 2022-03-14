package ca.cal.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Livre extends Documents{



    public Livre(long id, String titre, String auteur, String editeur, int annee_de_publication, String genre_de_document, int date) {
        super(id, titre, auteur, editeur, annee_de_publication, genre_de_document, date);
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", editeur='" + editeur + '\'' +
                ", annee_de_publication=" + annee_de_publication +
                ", genre_de_document='" + genre_de_document + '\'' +
                ", joursDePret=" + joursDePret +
                '}';
    }
}
