
public class YourFirstAccount {

    public static void main(String[] args) {
        Account basilsAccount = new Account("Basil", 100.0);
        basilsAccount.deposit(20.0);
        System.out.println(basilsAccount.toString());
    }
}
