package Classes.Aula4.src;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public abstract class BorderFactory {
    public static Border create() {
        return new LineBorder(Color.RED);
    }
}
