public class Main {
    public static void main(String[] args) {

        //Clients
        Client client = new Client(1,"Abdou", "Diarra");
        Client client2 = new Client(2,"Bob", "Léponge");
        //Livres
        Livre livre1 = new Livre("Bobby Pendragon", "McHale", 2002, "Roman");
        Livre livre2 = new Livre("Harry Potter", "Rowling", 1999, "Roman");
        Livre livre3 = new Livre("Les aventures de Harry", "Rowling", 2002, "Magazine");
        Livre livre4 = new Livre("Attack On Titans", "Eren Yeager", 2015, "Roman");
        Livre livre5 = new Livre("Teen Titans", "McH", 2020, "Roman");
        Services dao = new Services(new TpDaoJpa());
        //Enregistrer un nouveau client
        dao.save(client);
        //Ajout de livres dans la bibliothèque
        dao.addBook(livre);
        //rechercher livre par : titre, auteur, année et catégorie. (titre doit pas etre exacte)

        //Titre
        dao.getBook("Bobby");
        dao.getBook("Titans");
        //auteur
        dao.getBook("Rowling");
        //annee
        dao.getBook(2015);
        //Emprunt d'un document s'il en reste 1
        dao.saveBook(client,livre2);
        dao.saveBook(client2,livre4);
        //Voir la liste des emprunts et les dates auxquelles il doit les retourner
        dao.getSavedBooks(client2);
        dao.getSavedBooks(client);
    }
}
