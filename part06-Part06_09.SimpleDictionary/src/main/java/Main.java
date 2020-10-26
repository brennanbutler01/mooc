
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        SimpleDictionary simpleDictionary = new SimpleDictionary();
        TextUI textUI = new TextUI(
                scanner, simpleDictionary
        );
        textUI.start();
    }
}
