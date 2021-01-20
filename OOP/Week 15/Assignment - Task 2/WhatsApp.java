import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WhatsApp {
    
    JFrame frame;
    static JTextArea textArea;
    static JLabel messages;

    public void go() {

        frame =  new JFrame("WhatsApp");
        
        textArea = new JTextArea(2, 10);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        JButton sendButton = new JButton("Send Message");
        sendButton.addActionListener(new WhatsApp().new ButtonClick());
        
        JPanel messagesPanel = new JPanel();
        messages = new JLabel("Messages: ");
        messagesPanel.add(messages, BorderLayout.SOUTH);

        JPanel inputPanel = new JPanel();
        inputPanel.add(scrollPane, BorderLayout.NORTH);
        inputPanel.add(sendButton, BorderLayout.SOUTH);

        frame.getContentPane().add(messagesPanel, BorderLayout.NORTH);
        frame.getContentPane().add(inputPanel, BorderLayout.SOUTH);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    class ButtonClick implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String message = textArea.getText();
            try {

                File file = new File("file.txt");
    
                if (file.createNewFile()) 
                    writeMessageToFile(message, file);
                else 
                    writeMessageToFile(message, file);
                
    
            } catch (IOException ioError) {
                ioError.printStackTrace();
            } finally {
                textArea.setText("");
                messages.setText(messages.getText() + message + " ");
            }
        }

        public void writeMessageToFile(String message, File file) {
            FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(message + "\n");
            fileWriter.close();
        } catch (IOException ioError) {
            System.out.println("Error: " + ioError);
            ioError.printStackTrace();
        }
        }
        
    }

    public static void main(String args[]) {
        new WhatsApp().go();
    }

}
