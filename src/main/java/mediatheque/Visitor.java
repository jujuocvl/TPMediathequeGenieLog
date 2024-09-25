package mediatheque;

public interface Visitor {
    void visit(Book item);
    void visit(CD item);

}
