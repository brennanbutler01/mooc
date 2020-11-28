import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("To add:");
                String taskToAdd = scanner.nextLine();
                todoList.add(taskToAdd);
            }

            if (command.equals("list")) {
                todoList.print();
            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int indexOfTaskToRemove = Integer.valueOf(scanner.nextLine());
                todoList.remove(indexOfTaskToRemove);
            }
        }
    }


}
