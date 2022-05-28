package Classes.Aula1.Introduction;

public class Cat {
    private int size; // Só pode ser alterado dentro da própria classe
    String name; // Default: podem ser acessados pela mesma classe ou package
    protected char genre; // Só pode ser alterado pela mesma classe, package e subclass
    public String color; // Todos podem acessar seja classe, package, subclasse ou universo

    public void meow() {
        System.out.println(name + " meowwwwwwwww!");
    }

    public double calculateDose(double weight, int age) {
        return weight * age;
    }
}