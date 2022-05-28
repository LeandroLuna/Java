package Classes.Aula1.Introduction;

public class Declaring {
    public static void main(String[] args) {
        Cat miawwwwwww = new Cat(); // Método construtor que cria uma nova instância do tipo Cat
        miawwwwwww.name = "Garfield";
        miawwwwwww.color = "White";
        miawwwwwww.genre = 'M';
        // miawwwwwww.size = 60; Atributo privado a alterações somente da mesma classe
        miawwwwwww.meow(); // Método de trabalho
        double dose = miawwwwwww.calculateDose(20, 3);
        System.out.println("The cast must drink " + dose + " goat(s).");
    }
}
