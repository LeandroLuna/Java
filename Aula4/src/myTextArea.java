package Classes.Aula4.src;

import java.awt.Color;
import javax.swing.JTextArea;

public class myTextArea extends JTextArea {
    private int columns = 30;
    private int lines = 10;

    public myTextArea() {
        super();
        init();
    }

    private void init() {
        this.setColumns(columns);
        this.setRows(lines);
        this.setForeground(Color.WHITE);
        this.setBorder(BorderFactory.create());
    }

}
