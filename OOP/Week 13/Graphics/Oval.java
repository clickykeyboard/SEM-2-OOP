import javax.swing.*;
import java.awt.*;

public class Oval extends JPanel {

    public void paintComponent(Graphics graphics) {

        graphics.setColor(GUI.randomColor());
        graphics.fillOval(100, 100, 100, 100);

    }

}
