
public class YourFirstAccount {

    public static void main(String[] args) {
        Account myFirstAccount = new Account("myFirstAccount", 100.00);
        myFirstAccount.deposit(20);
        System.out.println(myFirstAccount);
    }
}
