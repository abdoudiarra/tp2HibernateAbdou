package ca.cal;

import ca.cal.Model.Lecteur;
import ca.cal.Model.Utilisateur;
import ca.cal.Persistence.Tp2DaoJpaH2;
import ca.cal.Service.Services;

public class Main {
    public static void main(String[] args) {

        Services dao = new Services(new Tp2DaoJpaH2());

        //Creation de lecteurs
        var lecteur1Id = dao.createLecteur(1,"Abdou", "Diarra","32 rue des raisins",0);
        var lecteur2Id = dao.createLecteur(2,"Bob", "Léponge","Sous l'ocean",0);

        //Création de livres
        var book1Id = dao.createBook(1, "Bobby Pendragon", "McHale", "random", 2002,"Roman",21);
        var book2Id = dao.createBook(2, "Harry Potter", "Rowling", "jsp", 2004,"Roman",21);
        var book3Id = dao.createBook(3, "Les aventures de Harry", "Rowling", "idk", 2004,"dvd",7);
        var book4Id = dao.createBook(4, "Attack On Titans", "Eren Yeager", "mtl", 2005,"cd",14);
        var book5Id = dao.createBook(5, "Teen Titans", "Marvel", "tr", 2009,"Roman",21);



        System.out.println(lecteur1Id);
        System.out.println(lecteur2Id);

        System.out.println(book1Id);
        System.out.println(book2Id);

        System.out.println(dao.getBook(3).getAuteur());
        //Enregistrer les livres dans la bibliothèque
//        dao.addBookToBibliotheque(book1Id);
//        dao.addBookToBibliotheque(book2Id);
//        dao.addBookToBibliotheque(book3Id);
//        dao.addBookToBibliotheque(book4Id);
//        dao.addBookToBibliotheque(book5Id);
//
//        //Enregistrer un nouveau client
//        dao.addBookToEmprunts(book1Id, lecteur1Id);
//        //Ajout de livres dans la bibliothèque
//        dao.addBookToEmprunts(book5Id, lecteur2Id);
//        //rechercher livre par : titre, auteur, année et catégorie. (titre doit pas etre exacte)
//
//        //Titre
//        dao.getBook("Bobby");
//        dao.getBook("Titans");
//        //auteur
//        dao.getBook("Rowling");
//        //annee
//        dao.getBook(2015);
//
//        //Voir la liste des emprunts et les dates auxquelles il doit les retourner
//        dao.getSavedBooks(client2);
//        dao.getSavedBooks(client);
    }
}
