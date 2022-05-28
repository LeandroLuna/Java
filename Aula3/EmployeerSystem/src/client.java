package Classes.Aula3.EmployeerSystem.src;

public class client implements Authentication {
    private String password = "abc";

    @Override
    public boolean autentication(String password) {
        return (this.password == password);
    }

}
