package ca.cal.Model;

import java.time.LocalDate;

public class DVD extends Documents{
    public DVD(long id, String titre, String auteur, String editeur, int annee_de_publication, String genre_de_document, int date) {
        super(id, titre, auteur, editeur, annee_de_publication, genre_de_document, date);
    }
}
