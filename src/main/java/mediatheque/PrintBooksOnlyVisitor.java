package mediatheque;

public class PrintBooksOnlyVisitor implements Visitor{

    public PrintBooksOnlyVisitor() {
    }
    @Override
    public void visit(Book item) {
        System.out.println(item);
    }

    @Override
    public void visit(CD item) {

    }
}
