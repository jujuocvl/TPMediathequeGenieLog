package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}

	public void printBooksOnlyVisitor() {
		PrintBooksOnlyVisitor bk = new PrintBooksOnlyVisitor() ;
		for (Item i : items) {
			i.accept(bk);
		}
	}

	public void printOnlyCDVisitor() {
		PrintCDOnlyVisitor cd = new PrintCDOnlyVisitor();
		for (Item i : items) {
			i.accept(cd);
		}
	}
}

