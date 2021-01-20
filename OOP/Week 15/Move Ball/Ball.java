import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUIDR
{
    JFrame frame;
    JButton b1,b2,b3,b4;
    JLabel label;
    JPanel p,p1;
    int x,y;
    MyDrawing drawing;
    public void go()
    {
        frame=new JFrame("My Drawing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x= 150;
        y= 100;
        b1=new JButton("Right");
        b2=new JButton("Left");
        b3=new JButton("Up");
        b4=new JButton("Down");
        p=new JPanel();
        p1=new JPanel();
        label=new JLabel("");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p1.add(label);
        drawing=new MyDrawing();

        JPanel circleFrame = new JPanel();
        circleFrame.setBackground(Color.WHITE);
        circleFrame.add(drawing);

        b1.addActionListener(new Right());
        b2.addActionListener(new Left());
        b3.addActionListener(new UP());
        b4.addActionListener(new Down());
        
        frame.getContentPane().add(BorderLayout.CENTER,circleFrame);
        drawing.repaint();
        frame.getContentPane().add(BorderLayout.SOUTH,p);
        frame.getContentPane().add(BorderLayout.NORTH,p1);
        
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
            g.setColor(Color.red);
            g.fillOval(x,y,100,100);
        }
    }
    public class Right implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
           x=x+10;
           label.setText("x="+x+" ,y="+y);
           frame.repaint();
        }
    }
    public class Left implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
           x=x-10;
           label.setText("x="+x+" ,y="+y);
           frame.repaint();
        }
    }
    public class UP implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
           y=y-10;
           label.setText("x="+x+" ,y="+y);
           frame.repaint();
        }
    }
    public class Down implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
           y=y+10;
           label.setText("x="+x+" ,y="+y);
           frame.repaint();
        }
    }
}