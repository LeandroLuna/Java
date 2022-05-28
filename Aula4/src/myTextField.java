package Classes.Aula4.src;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Dimension;

public class myTextField extends JTextField {
    public myTextField() {
        super();
        init();
    }

    private void init() {
        this.setPreferredSize(new Dimension(200, 30));
        this.setBackground(Color.WHITE);
        this.setForeground(new Color(50, 50, 50));
        this.setBorder(BorderFactory.create());
    }
}
