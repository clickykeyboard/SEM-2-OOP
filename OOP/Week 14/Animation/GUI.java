import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI {
    
    JFrame frame;
    JButton buttonOne, buttonTwo;
    JPanel panelOne, panelTwo;
    Drawing drawing;

    public static int positionX, positionY;

    public void runGUI() {
        
        frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        positionX = 10;
        positionY = 50;

        panelOne = new JPanel();
        panelTwo = new JPanel();

        buttonOne = new JButton("Animate");
        buttonOne.addActionListener(new AnimateButtonForward());

        buttonTwo = new JButton("Go back");
        buttonTwo.addActionListener(new AnimateButtonBack());

        panelTwo.add(buttonOne);
        panelTwo.add(buttonTwo);

        drawing = new Drawing();

        frame.getContentPane().add(BorderLayout.CENTER, drawing);
        frame.getContentPane().add(BorderLayout.SOUTH, panelTwo);
    
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

    public static void main(String args[]) {
        new GUI().runGUI();
    }

    class Drawing extends JPanel {
    
        public void paintComponent(Graphics graphics) {
            
            graphics.setColor(Color.BLACK);
            graphics.fillOval(GUI.positionX, GUI.positionY, 50, 50);
        }
    }

    class AnimateButtonForward implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            
            for (int i = 0; i < 130; i++) {
                positionX++;
                positionY++;
                drawing.repaint();
                try {
                    Thread.sleep(40);
                } catch (Exception e) {}
            }
        }

    }

    class AnimateButtonBack implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            
        }

    }


}
