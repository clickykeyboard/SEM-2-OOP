import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUIDR
{
    JFrame frame;
    JButton b1,b2,b3,b4;
    JLabel label;
    JPanel p,p1;
    MyDrawing drawing;
    public void go()
    {
        frame=new JFrame("My Drawing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawing = new MyDrawing();

        // JPanel leftPanel = new JPanel();
        // leftPanel.setBackground(Color.WHITE);

        JPanel circleFrame = new JPanel();
        circleFrame.setBackground(Color.RED);
        circleFrame.add(drawing);
        
        // frame.getContentPane().add(BorderLayout.WEST, leftPanel);
        frame.getContentPane().add(BorderLayout.CENTER,circleFrame);
        
        frame.setSize(400,400);
        frame.setVisible(true);
        
    }
    public static void main(String args[])
    {
        GUIDR gui=new GUIDR();
        gui.go();
    }
    public class MyDrawing extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            setPreferredSize(new Dimension(400, 400));
            g.setColor(Color.WHITE);
            g.fillOval(100, 100, 120, 120);
            g.setColor(Color.RED);
            g.fillOval(130, 100, 120, 120);
            repaint();

            int[] x  = {42,52,72,52,60,40,15,28,9,32,42};
            int[] y = {38,62,68,80,105,85,102,75,58,60,38};

            for ( int i = 0; i < x.length; i++) {
                x[i] += 170;
                y[i] += 80;
            }

            g.setColor(Color.WHITE);
            g.fillPolygon(x , y, 10);
        }
    }
    
}