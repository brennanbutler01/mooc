import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(element -> element.split(","))
                    .filter(parts -> parts.length == 6)
                    .sorted((one, two) -> {
                        if (Double.valueOf(one[5]) > Double.valueOf(two[5])) {
                            return 1;
                        } else if (Double.valueOf(one[5]) < Double.valueOf(two[5])) {
                            return -1;
                        } else {
                            return 0;
                        }
                    })
                    .forEach(element -> {
                        System.out.println(element[3].trim() + " (" +
                                element[4] + "), " + element[2].trim().split(" ")[0] + ", "
                                + element[5]);
                    });
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
