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
        var book1Id = dao.createBook("Bobby Pendragon", "McHale", 2002, "Roman");
        var book2Id = dao.createBook("Harry Potter", "Rowling", 1999, "Roman");
        var book3Id = dao.createBook("Les aventures de Harry", "Rowling", 2002, "Magazine");
        var book4Id = dao.createBook("Attack On Titans", "Eren Yeager", 2015, "Roman");
        var book5Id = dao.createBook("Teen Titans", "McH", 2020, "Roman");

        System.out.println(lecteur1Id);
        System.out.println(lecteur2Id);
        //Emprunt d'un document s'il en reste 1
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
