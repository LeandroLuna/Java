package Classes.Aula2.Account;

public class Bank {
    public static void main(String[] args) {
        Accounts acc1 = new Accounts("Leandro");
        acc1.setFees(3.5);
        acc1.setFees(7.5);

        Accounts acc2 = new Accounts();
        acc2.setHolder("Luna");

        System.out.println(acc1.getHolder());
        System.out.println(acc1.getFees());
        System.out.println(acc1.getBalance());

        System.out.println(acc2.getHolder());
        System.out.println(acc2.getFees());
        System.out.println(acc2.getBalance());
    }
}