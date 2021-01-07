import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    public void paintComponent(Graphics graphics) {
        Color randomBackgroundcolor = GUI.generateColor();
        graphics.setColor(randomBackgroundcolor);
        graphics.fillRect(-50, 0, this.getWidth(), this.getHeight());
    }

}