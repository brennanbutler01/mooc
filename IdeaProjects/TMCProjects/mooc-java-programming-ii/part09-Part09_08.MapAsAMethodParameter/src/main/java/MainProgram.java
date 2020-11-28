import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("My first cat:", "Luther");
        map.put("My second cat:", "Basil");
        System.out.println(returnSize(map));
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map map) {
        return map.size();
    }
}
