import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DB {

    static Connection connection;
    static JFrame frame;
    static JTextField namefield;
    static String dbURL = "jdbc:ucanaccess://C:/Users/ADMIN/Desktop/OOP/OOP/Week 16/Assignment/V2/Test/MyDB.accdb";
    static JTextField emailfield;
    static JTextField contactfield;

    public static void main(String args[]) {

        try {
            connection = DriverManager.getConnection(dbURL);
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        frame = new JFrame("DB");
        JPanel mainpanel = new JPanel(new GridLayout(1, 1));
        frame.getContentPane().add(mainpanel);
        JPanel form = new JPanel();
        mainpanel.add(form);
        JPanel topPanel = new JPanel(new GridLayout(3, 1));
        form.add(topPanel);
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        form.add(bottomPanel);
        JLabel nameLabel = new JLabel("Name");
        topPanel.add(nameLabel);
        namefield = new JTextField(10);
        nameLabel.setLabelFor(namefield);
        topPanel.add(namefield);
        JLabel emailLabel = new JLabel("Email");
        topPanel.add(emailLabel);
        emailfield = new JTextField(10);
        emailLabel.setLabelFor(emailfield);
        topPanel.add(emailfield);
        JLabel contactLabel = new JLabel("Contact");
        topPanel.add(contactLabel);
        contactfield = new JTextField(10);
        contactLabel.setLabelFor(contactfield);
        topPanel.add(contactfield);
        JButton bsave = new JButton("Save");
        bsave.addActionListener(new DB().new Save());
        bottomPanel.add(bsave);
        JButton bclear = new JButton("Clear");
        bclear.addActionListener(new DB().new Clear());
        bottomPanel.add(bclear);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    class Save implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String query = "INSERT INTO data(Name, Email, Contact) Values('" + namefield.getText() + "', '"
                    + emailfield.getText() + "', '" + contactfield.getText() + "')";
            try {
                Statement statement = connection.createStatement();
                int row = statement.executeUpdate(query);
                if (row >= 0) {
                    System.out.println("added data");
                    namefield.setText("");
                    emailfield.setText("");
                    contactfield.setText("");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    class Clear implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            namefield.setText("");
            emailfield.setText("");
            contactfield.setText("");
        }
    }
}