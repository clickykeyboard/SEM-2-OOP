import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener {

    public static JButton button;
    public int count = 0;

    public static void main(String args[]) {
        // 2 creating frame
        JFrame frame = new JFrame("My frame");
        // most impthing is to close the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Click me");
        button.addActionListener(new GUI());
        // adding the buton to frame
        frame.add(button);
        // 4 show and set size of frame
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        count++;
        button.setText("Count: " + count);
    }
}
