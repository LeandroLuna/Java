package Classes.Aula3.EmployeerSystem.src;

public class payroll {
    public double totalPayment = 0;

    public void register(employeer employeer) {
        totalPayment += employeer.getSalary();
    }

    public void login(Authentication Authentication) {
        if (Authentication.autentication("123")) {
            System.out.println(Authentication.getClass() + " : Logado com sucesso!");
        } else {
            System.out.println(Authentication.getClass() + " : Falha de Login..");
        }
    }

    public double getTotalPayment() {
        return totalPayment;
    }

}
