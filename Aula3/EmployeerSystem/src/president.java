package Classes.Aula3.EmployeerSystem.src;

public final class president extends employeer implements Authentication {
    public president(int salary, int companyValue, double quotas) {
        super(salary);
        this.companyValue = companyValue;
        this.quotas = quotas;
    }

    private double quotas;
    private int companyValue;
    private String password = "123";

    public double getQuotas() {
        return quotas;
    }

    public void setQuotas(double quotas) {
        this.quotas = quotas;
    }

    @Override
    public int getSalary() {
        return (int) (this.salary + (this.companyValue * this.quotas));
    }

    @Override
    public boolean autentication(String password) {
        return (this.password == password);
    }
}
