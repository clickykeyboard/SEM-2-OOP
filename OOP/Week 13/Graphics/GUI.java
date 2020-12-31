import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {

    public static void main(String args[]) {

        JFrame frame = new JFrame("Frame");

        Oval oval = new Oval();
        frame.add(BorderLayout.CENTER, oval);

        JButton button = new JButton("Change color");
        frame.add(BorderLayout.SOUTH, button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                oval.repaint();
            }
        });

        JButton buttonTop = new JButton("Change background color");
        frame.add(BorderLayout.NORTH, buttonTop);
        buttonTop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame.getContentPane().setBackground(randomColor());
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public static Color randomColor() {
        int red, green, blue;

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);

        return randomColor;
    }

}