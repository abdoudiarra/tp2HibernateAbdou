package ca.cal.Service;

import ca.cal.Model.Documents;
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

    public Documents getBook(long id) {
        return dao.getLivre(id);
    }

//    public void addBookToBibliotheque(long bookId, long bibliotheque) {
//        var bookId = dao.getBook();
//    }

//    public void addBookToEmprunts(long bookId, long lecteurId){
//        return dao.addBookToEmprunts();
//    }
//

//
//    public void getBook(int anneePublication){
//        return dao.getBook(anneePublication);
//    }
//
//

}
