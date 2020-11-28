import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList  = new ArrayList<>();
    }

    public void add(String task) {
        todoList.add(task);
    }

    public void print() {
        int i = 1;

        for (String listItem : todoList) {
            System.out.println(i + ": " + listItem);
            i++;
        }
    }

    public void remove(int number) {
        int i = 1;

        for (String listItem : todoList) {
            if (i == number) {
                todoList.remove(i - 1);
                break;
            }
            i++;
        }
    }
}

