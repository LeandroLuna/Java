package Classes.Aula4.src;

import javax.swing.JFrame;
import java.awt.FlowLayout;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400, 600);
        frame.setTitle("Graphic Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando uma componente diretamente na class main
        // JLabel label = new JLabel("Bem vindo");
        // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setForeground(new Color(255, 0, 150));
        // label.setFont(new Font(null, Font.BOLD, 24));
        // frame.add(label);

        frame.add(new myLabel("Welcome")); // Componente generalizado
        frame.add(new myTextField());
        frame.add(new myTextArea());
        frame.add(new myCheckbox("Concordo com os termos"));
    }
}