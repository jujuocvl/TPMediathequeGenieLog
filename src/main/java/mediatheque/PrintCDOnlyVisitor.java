package mediatheque;

public class PrintCDOnlyVisitor implements Visitor {

    public PrintCDOnlyVisitor() {

    }
    public void visit(Book item) {

    }
    public void visit(CD item){
        item.print();
    }
}
