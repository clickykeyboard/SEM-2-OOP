import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {

    public static Circle circle;
    public static JLabel label;
    public static JButton button, buttonTwo, buttonThree;
    public static JFrame frame;
    public static void main(String args[]) {
        
        // 1 - Make a frame
        frame = new JFrame("My frame");

        // Set close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("Change this text");
        
        
        circle = new Circle();
        
        button = new JButton("Change label name");
        button.addActionListener(new GUI());
        
        buttonTwo = new JButton("Change circle color");
        buttonTwo.addActionListener(new GUI());
        
        buttonThree = new JButton("Change everything");
        buttonThree.addActionListener(new GUI());
        
        frame.getContentPane().add(BorderLayout.NORTH, buttonThree);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, circle);
        frame.getContentPane().add(BorderLayout.EAST, buttonTwo);
        frame.getContentPane().add(BorderLayout.WEST, label);
        
        frame.setSize(300, 300);
        frame.setVisible(true);
        
    }
    
    public static Color generateColor() {
        int red, green, blue;
        red = (int) (Math.random() * 225);
        green = (int) (Math.random() * 225);
        blue = (int) (Math.random() * 225);

        Color randomColor = new Color(red, green, blue);

        return randomColor;
    }

    public void actionPerformed(ActionEvent event) {
        
        if (event.getSource() == buttonTwo) {
            circle.repaint();
            return;
        }

        if (event.getSource() == buttonThree) {
            button.setText("Changed text");
            buttonTwo.setText("Changed another text");
            buttonThree.setText("Changed another text again");
            frame.repaint();
        }

        label.setText("New text");

    }
    
}
