
public class Main {

    public static void main(String[] args) {
        HealthStation choray = new HealthStation();

        Person carl = new Person ("George", 1, 110, 7);
        System.out.println(choray.weigh(carl));
        choray.feed(carl);
        System.out.println(choray.weigh(carl));
        System.out.println("weighings performed: " + choray.weighings());
    }
}
