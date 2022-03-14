package ca.cal.Model;

import javax.swing.text.Document;
import java.time.LocalDate;

public class CD extends Documents {
    public CD(long id, String titre, String auteur, String editeur, int annee_de_publication, String genre_de_document, int date) {
        super(id, titre, auteur, editeur, annee_de_publication, genre_de_document, date);
    }
}
