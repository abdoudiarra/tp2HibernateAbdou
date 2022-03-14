package ca.cal;

import ca.cal.Model.Lecteur;
import ca.cal.Model.Utilisateur;
import ca.cal.Persistence.Tp2DaoJpaH2;
import ca.cal.Service.Services;

public class Main {
    public static void main(String[] args) {

        Services dao = new Services(new Tp2DaoJpaH2());

        //Creer la bibliotheque
        var biblioId = dao.createBibliotheque(1);

        //Creation de lecteurs
        var lecteur1Id = dao.createLecteur(1,"Abdou", "Diarra","32 rue des raisins",0);
        var lecteur2Id = dao.createLecteur(2,"Bob", "Léponge","Sous l'ocean",0);

        //Création de livres
        var book1Id = dao.createBook(1, "Bobby Pendragon", "McHale", "random", 2002,"Roman",21);
        var book2Id = dao.createBook(2, "Harry Potter", "Rowling", "jsp", 2004,"Roman",21);
        var book3Id = dao.createBook(3, "Les aventures de Harry", "Rowling", "idk", 2004,"dvd",7);
        var book4Id = dao.createBook(4, "Attack On Titans", "Eren Yeager", "mtl", 2005,"cd",14);
        var book5Id = dao.createBook(5, "Teen Titans", "Marvel", "tr", 2009,"Roman",21);



        //Tester le getBook
        final var book = dao.getBook(book5Id);
        System.out.println(book);

        //Tester le getBiblio
        final var biblio = dao.getBiblio(biblioId);
        System.out.println(biblio);

        //tester le getLecteur
        System.out.println(dao.getLecteur(lecteur2Id).getFirstName());

        //Ajouter un livre dans la bibliothèque
        dao.addBookToBibliotheque(book5Id,biblioId);
        dao.addBookToBibliotheque(book4Id,biblioId);
        dao.addBookToBibliotheque(book3Id,biblioId);
        System.out.println(dao.getBiblio(biblioId));

        //recherche dans les emprunts
        dao.getEmprunts(lecteur1Id);


    }
}
