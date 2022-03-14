package ca.cal.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Documents {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String titre;
    String auteur;
    String editeur;
    int annee_de_publication;
    String genre_de_document;
    int joursDePret;

    public Documents(long id, String titre, String auteur, String editeur, int annee_de_publication, String genre_de_document, int joursDePret) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.annee_de_publication = annee_de_publication;
        this.genre_de_document = genre_de_document;
        this.joursDePret = joursDePret;
    }

    public long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public int getAnnee_de_publication() {
        return annee_de_publication;
    }

    public String getGenre_de_document() {
        return genre_de_document;
    }

    public int getDate() {
        return joursDePret;
    }
}
