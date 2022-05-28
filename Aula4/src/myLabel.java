package Classes.Aula4.src;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class myLabel extends JLabel {
    private static final long serialVersionUID = 1L;
    private int fontSize = 14;

    public myLabel(String text) {
        super(text);
        init();
    }

    public myLabel(String text, int fontSize) {
        super(text);
        this.fontSize = fontSize;
        init();
    }

    private void init() {
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setForeground(new Color(255, 0, 150));
        this.setFont(new Font(null, Font.BOLD, this.fontSize));
    }
}
