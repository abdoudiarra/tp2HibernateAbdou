package ca.cal.Service;

import ca.cal.Persistence.Tp2DaoJpaH2;

public class Services {

    Tp2DaoJpaH2 dao;

    public Services(Tp2DaoJpaH2 dao) {
        this.dao = dao;
    }

    public long createLecteur(long id, String prenom, String nom, String addresse, double solde) {
        return dao.createLecteur(id, prenom,nom,addresse,solde);
    }

    public long createBook(String titre, String auteur, int anneePublication, String type) {
        return dao.createBook(titre,auteur,anneePublication,type);
    }

//    public void addBookToEmprunts(long bookId, long lecteurId){
//        return dao.addBookToEmprunts();
//    }
//
//    public void getBook(String name) {
//        return dao.getBook(name);
//    }
//
//    public void getBook(int anneePublication){
//        return dao.getBook(anneePublication);
//    }
//
//
//    public void addBookToBibliotheque(long bookId) {
//        return dao.addBookToBibliotheque(bookId);
//    }
}
