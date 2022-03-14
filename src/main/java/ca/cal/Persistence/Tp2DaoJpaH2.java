package ca.cal.Persistence;

import ca.cal.Model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.text.Document;
import java.util.List;

public class Tp2DaoJpaH2 {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp2");

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

        final Bibliotheque bibliotheque = new Bibliotheque(id,"montreal");
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

    public Bibliotheque getBiblio(long id){
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final Bibliotheque biblio = em.find(Bibliotheque.class, id);

        em.getTransaction().commit();
        em.close();

        return biblio;
    }


    public Utilisateur getUtilisateur(long id) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final Utilisateur lecteur = em.find(Lecteur.class, id);

        em.getTransaction().commit();
        em.close();

        return lecteur;
    }

    public <T> void save(T t) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(t);

        em.getTransaction().commit();
        em.close();

    }

    public <T> void merge(T t) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.merge(t);

        em.getTransaction().commit();
        em.close();

    }

    public List<Documents> getDocuments(String titre) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Documents> query = em.createQuery(
                "select d from Documents d where d.titre like :titre"
                , Documents.class);
        query.setParameter("titre", "%" +titre+ "%");
        final List<Documents> docs = query.getResultList();

        em.getTransaction().commit();
        em.close();
        return  docs;
    }


}
