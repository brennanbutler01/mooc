
public class Main {

    public static void main(String[] args) {

        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person first = new Person("Leevi", new SimpleDate(1, 1, 2017), 70, 10);
        Person second = new Person("Leevi", new SimpleDate(1, 1, 2017), 70, 10);



        if (first.equals(second)) {
            System.out.println("equals");
        }
        
    }
}
