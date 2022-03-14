package ca.cal.Service;

import ca.cal.Model.Bibliotheque;
import ca.cal.Model.Documents;
import ca.cal.Model.Lecteur;
import ca.cal.Model.Utilisateur;
import ca.cal.Persistence.Tp2DaoJpaH2;

import java.time.LocalDate;

public class Services {

    Tp2DaoJpaH2 dao;

    public Services(Tp2DaoJpaH2 dao) {
        this.dao = dao;
    }

    public long createLecteur(long id, String prenom, String nom, String addresse, double solde) {
        return dao.createLecteur(id, prenom,nom,addresse,solde);
    }

    public long createBook(long id, String titre, String auteur, String editeur, int annee_de_publication, String genre_de_document, int joursDePrets) {
        return dao.createBook(id,titre,auteur,editeur,annee_de_publication,genre_de_document, joursDePrets);
    }

    public long createBibliotheque(long id) {
        return dao.createBibliotheque(id);
    }



    public Documents getBook(long id) {
        return dao.getLivre(id);
    }

    public Utilisateur getLecteur(long id) {
        return dao.getUtilisateur(id);
    }

    public void addBookToBibliotheque(long livreId, long biblioId) {
        var livre = dao.getLivre(livreId);
        var biblio = dao.getBiblio(biblioId);
        biblio.addBook(livre);
        dao.merge(biblio);
    }

    public Bibliotheque getBiblio(long biblioId) {
        return dao.getBiblio(biblioId);
    }
}
