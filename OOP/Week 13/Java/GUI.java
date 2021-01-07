import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    public static JButton button, buttonTwo;
    public static JFrame frame;
    public static void main(String args[]) {
        
        // 1 - Make a frame
        frame = new JFrame("My frame");

        // Set close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
        Square square = new Square();
        frame.getContentPane().add(square);
        
        Circle circle = new Circle();
        frame.getContentPane().add(BorderLayout.EAST, circle);
        
        
        // 4 - Display frame
        button = new JButton("Change square color");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                square.repaint();
            }
        });
        
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        
        buttonTwo = new JButton("Change circle color");
        buttonTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                circle.repaint();
            }
        });

        frame.getContentPane().add(BorderLayout.NORTH, buttonTwo);
        
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
    
}
