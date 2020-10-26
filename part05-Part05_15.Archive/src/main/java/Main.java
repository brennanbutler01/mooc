
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<Archive>();

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive entry = new Archive(identifier, name);
            archive.add(entry);
        }

        System.out.println("==Items==");
        ArrayList<String> printHistory = new ArrayList<String>();

        for (Archive archiveEntry: archive) {
                String identifier = archiveEntry.getIdentifier();
                String name = archiveEntry.getName();
                if (printHistory.contains(identifier)) {
                    continue;
                }
                printHistory.add(identifier);
            System.out.println(identifier + ": " + name);
            }



    }
}
