package Classes.Aula2.Account;

public class Accounts {

    // Construtor padrão
    private String holder;
    private int number;
    private double balance;
    private double fees;

    // Criando um construtor (Sobrescreve o construtor padrão)
    public Accounts(String holder) {
        this.holder = holder;
        balance = 0;
    }

    // Sobrecarga de método (Mais de um construtor)
    public Accounts() {
        balance = 0;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setFees(double fees) {
        if (fees >= 0) {
            this.fees = fees;
        }
    }

    public double getFees() {
        return fees;
    }

    public String getHolder() {
        return holder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
