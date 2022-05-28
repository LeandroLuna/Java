package Classes.Aula3.EmployeerSystem.src;

public class App {
    public static void main(String[] args) {
        payroll folhaDePagamento = new payroll();
        engineer Engenheiro = new engineer(1000);
        manager Gerente = new manager(1000, 1500);
        president Presidente = new president(1000, 10000, 0.3);
        client Cliente = new client();
        // System.out.println("Salario engenheiro: " + Engenheiro.getSalary());
        // System.out.println("Salario gerente: " + Gerente.getSalary());
        // System.out.println("Salario presidente: " + Presidente.getSalary());
        folhaDePagamento.register(Engenheiro);
        folhaDePagamento.register(Gerente);
        folhaDePagamento.register(Presidente);
        System.out.println(folhaDePagamento.getTotalPayment());
        folhaDePagamento.login(Presidente);
        folhaDePagamento.login(Gerente);
        folhaDePagamento.login(Cliente);
    }
}
