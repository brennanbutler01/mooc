
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hi");
        strings.add("Second");
        strings.add("Third");
        strings.add("Last");
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
    }
    public static void removeLast(ArrayList<String> strings) {
        int size = strings.size();
        if (size > 0) {
            strings.remove(strings.size() - 1);
        }
    }

}
