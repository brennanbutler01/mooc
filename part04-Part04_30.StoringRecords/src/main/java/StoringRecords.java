
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                String person = fileScanner.nextLine();
                String[] personArray = person.split(",");
                String name = personArray[0];
                int age = Integer.valueOf(personArray[1]);

                Person newPerson = new Person (name, age);
                persons.add(newPerson);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return persons;

    }
}
