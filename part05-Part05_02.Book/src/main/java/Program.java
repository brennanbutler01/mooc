
public class Program {

    public static void main(String[] args) {
        Book harryPtr = new Book("J.K Rowling", "Harry Potter and the Sorceror's stone", 223);
        harryPtr.getPages();
        harryPtr.getName();
        harryPtr.getAuthor();
        System.out.println(harryPtr);

    }
}
