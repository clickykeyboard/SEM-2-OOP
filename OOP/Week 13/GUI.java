import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    public static JButton button;
    public static void main(String args[]) {
        
        // 1 - Make a frame
        JFrame frame = new JFrame("My frame");

        // Set close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2 - Make a button
        button = new JButton("Click me");
        button.addActionListener(new GUI());
        
        // 3 - Add the button to frame
        frame.getContentPane().add(button);
        

        // 4 - Display frame
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent arg0) {
        button.setText("Button clicked");
    }
    
}
