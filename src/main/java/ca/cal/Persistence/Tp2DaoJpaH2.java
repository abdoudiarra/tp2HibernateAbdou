package ca.cal.Persistence;

import ca.cal.Model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tp2DaoJpaH2 {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp2");

//    public long createLecteur() {
//    }
//
//    public long createBook() {
//    }
//
//    public void addBookToEmprunts() {
//    }
//
//    public void getBook(String name) {
//    }

    public long createLecteur(long id, String prenom, String nom, String addresse, double solde) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final Utilisateur lecteur = new Lecteur(id,prenom,nom,addresse,solde);
        em.merge(lecteur);

        em.getTransaction().commit();
        em.close();

        return lecteur.getId();
    }

    public long createBook(long id, String titre, String auteur, String editeur, int annee_de_publication, String genre_de_document, int joursDePret) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final Documents livre = new Livre(id,titre,auteur,editeur,annee_de_publication,genre_de_document,joursDePret);
        em.merge(livre);

        em.getTransaction().commit();
        em.close();

        return livre.getId();
    }

    public long createBibliotheque(long id) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final Bibliotheque bibliotheque = new Bibliotheque(id);
        em.merge(bibliotheque);

        em.getTransaction().commit();
        em.close();

        return bibliotheque.getId();
    }

    public Documents getLivre(long id){
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final Documents document = em.find(Documents.class, id);

        em.getTransaction().commit();
        em.close();

        return document;
    }

}
