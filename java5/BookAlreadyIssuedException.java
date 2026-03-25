package java5;

public class BookAlreadyIssuedException extends Exception {
    public BookAlreadyIssuedException(String msg) {
        super(msg);
    }
}