import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextArea {
    
    static JList list;
    static JTextArea textArea;
    static JCheckBox checkbox;

    public static void main(String args[]) {

        JFrame frame = new JFrame("Text Area");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkbox = new JCheckBox("I am a checkbox");

        JButton button = new JButton("Click me");
        button.addActionListener(new TextArea().new ButtonClick());

        String strings[] = {"Alpha", "Beta", "Gamma"};
        list = new JList(strings);
        textArea = new JTextArea(10, 20);
        textArea.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JPanel panel = new JPanel();
        panel.add(scrollPane);

        frame.getContentPane().add(checkbox, BorderLayout.NORTH);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(list, BorderLayout.EAST);

        frame.setSize(400, 400);
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setVisible(true);
    }

    public class ButtonClick implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (checkbox.isSelected()) {
                textArea.append(list.getSelectedValue().toString() + "\n");
            }
        }

    }
}
