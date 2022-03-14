package ca.cal.Persistence;

import ca.cal.Model.Lecteur;
import ca.cal.Model.Utilisateur;

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

    public long createBook(String titre, String auteur, int anneePublication, String type) {
       return 0;
    }
}
