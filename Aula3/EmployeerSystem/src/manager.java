package Classes.Aula3.EmployeerSystem.src;

public class manager extends employeer implements Authentication {
    public manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    private String area;
    private int bonus;
    private String password = "321";

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return (this.salary + this.bonus);
    }

    @Override
    public boolean autentication(String password) {
        return (this.password == password);
    }
}
