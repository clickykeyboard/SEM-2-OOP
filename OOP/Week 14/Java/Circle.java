import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {

    public void paintComponent(Graphics graphics) {
        Color randomBackgroundcolor = GUI.generateColor();
        graphics.setColor(randomBackgroundcolor);
        graphics.fillOval(this.getWidth()/2, this.getHeight()/2, 100, 100);
    }

}