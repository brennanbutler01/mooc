
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        System.out.println(file);
        System.out.println(searchedFor);

        boolean failedToFind = false;

        try(Scanner fileScan = new Scanner(Paths.get(file))) {
            while(fileScan.hasNextLine()) {
                names.add(fileScan.nextLine());
            }
        }
        catch(Exception e) {
            failedToFind=true;
            System.out.println("Reading the file " + file + " failed.");
        }
        boolean found = false;
        for (String name: names) {
            if (name.equals(searchedFor)) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Found!");
        } else {
            if(!failedToFind) {
                System.out.println("Not found.");
            }
        }

    }

}