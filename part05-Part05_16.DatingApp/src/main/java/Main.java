
public class Main {

    public static void main(String[] args) {

        SimpleDate date = new SimpleDate(30, 12, 2011);
        for (int i =0 ; i < 500; i++) {
            date.advance();
        }
        System.out.println(date);
    }
}
