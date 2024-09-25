package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new Book("Melissa Da Costa", "Tout le bleu du ciel"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        mediatheque.addItem( new CD(14, "L'Amour"));
        mediatheque.printCatalog();

        System.out.println("Only Books");
        mediatheque.printBooksOnlyVisitor();

        System.out.println("Only CDs");
        mediatheque.printOnlyCDVisitor();
    }
}
