package Classes.Aula3.EmployeerSystem.src;

public class engineer extends employeer {
    public engineer(int salary) {
        super(salary);
    }

    private String department;
    private int crea;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCrea() {
        return crea;
    }

    public void setCrea(int crea) {
        this.crea = crea;
    }

    @Override
    public int getSalary() {
        return (int) (this.salary * 1.5);
    }
}
