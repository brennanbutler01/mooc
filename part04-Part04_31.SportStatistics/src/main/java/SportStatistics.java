
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int winCount= 0;
        int lossCount = 0;

        try(Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] array = row.split(",");
                int teamIndex = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equals(team)) {
                        teamIndex = i;
                    }
                }
                if (teamIndex == 0) {
                    int wins = Integer.valueOf(array[2]);
                    int losses = Integer.valueOf(array[3]);
                    if (row.contains(team)) {
                        games += 1;
                        if (wins > losses) {
                            winCount += 1;
                        } else {
                            lossCount += 1;
                        }
                    }
                } else {
                    int wins = Integer.valueOf(array[3]);
                    int losses = Integer.valueOf(array[2]);
                    if (row.contains(team)) {
                        games += 1;
                        if (wins > losses) {
                            winCount += 1;
                        } else {
                            lossCount += 1;
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }

}
