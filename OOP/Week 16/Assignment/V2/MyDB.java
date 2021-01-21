import java.sql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyDB {

    // Database
    public static String databaseURL = "jdbc:ucanaccess://C:/Users/ADMIN/Desktop/OOP/OOP/Week 16/Assignment/V2/MyDB.accdb";
    public Connection connection;

    public static int dataLength;

    // GUI
    public JFrame frame;

    public JTextField nameTextField;
    public JTextField emailTextField;
    public JTextField contactTextField;

    public JPanel dataPanel;

    public void setGUI() {

        frame = new JFrame("My Database");
        JPanel mainFrame = new JPanel(new GridLayout(3, 1));
        frame.getContentPane().add(mainFrame);

        // Form panel
        JPanel formPanel = new JPanel();
        mainFrame.add(formPanel);

        mainFrame.add(new JPanel()); // Empty space

        // Data panel
        dataPanel = new JPanel(new GridLayout(dataLength, 1));
        mainFrame.add(dataPanel);

        // Top panel
        JPanel topPanel = new JPanel(new GridLayout(3, 1));
        formPanel.add(topPanel);

        // Bottom panel
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        formPanel.add(bottomPanel);

        // Panels

        // Name
        JLabel nameLabel = new JLabel("Name");
        topPanel.add(nameLabel);
        nameTextField = new JTextField(10);
        nameLabel.setLabelFor(nameTextField);
        topPanel.add(nameTextField);

        // Email
        JLabel emailLabel = new JLabel("Email");
        topPanel.add(emailLabel);
        emailTextField = new JTextField(10);
        emailLabel.setLabelFor(emailTextField);
        topPanel.add(emailTextField);

        // Contact
        JLabel contactLabel = new JLabel("Contact");
        topPanel.add(contactLabel);
        contactTextField = new JTextField(10);
        contactLabel.setLabelFor(contactTextField);
        topPanel.add(contactTextField);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(this.new SaveButton());
        bottomPanel.add(saveButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this.new ClearButton());
        bottomPanel.add(clearButton);

        // Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 600);
        frame.setVisible(true);

    }

    public void setDatabase() {
        try {
            connection = DriverManager.getConnection(databaseURL);
            System.out.println("Connected to the database");
        } catch (SQLException error) {
            error.printStackTrace();
        }
    }

    public void getRows() {
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM data");

            while (result.next()) {

                dataLength++;

                int rollNumber = result.getInt("Rollno");
                String name = result.getString("Name");
                String email = result.getString("Email");
                String contact = result.getString("Contact");

                JLabel label = new JLabel(
                        "  " + Integer.toString(rollNumber) + " - " + name + " - " + email + " - " + contact);
                dataPanel.add(label);

            }

        } catch (SQLException error) {
            error.printStackTrace();
        }

        frame.setVisible(true);
    }

    public static void main(String args[]) {

        MyDB myDB = new MyDB();

        myDB.setGUI();
        myDB.setDatabase();
        myDB.getRows();

    }

    class SaveButton implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String query = String.format("INSERT INTO data(Name, Email, Contact) Values('%s', '%s', '%s')",
                    nameTextField.getText(), emailTextField.getText(), contactTextField.getText());
            try {
                Statement statement = connection.createStatement();

                int row = statement.executeUpdate(query);

                if (row > 0) {

                    JLabel label = new JLabel("  " + ++dataLength + " - " + nameTextField.getText() + " - "
                            + emailTextField.getText() + " - " + contactTextField.getText());
                    dataPanel.add(label);
                    frame.setVisible(true);

                    nameTextField.setText("");
                    emailTextField.setText("");
                    contactTextField.setText("");
                }

            } catch (SQLException error) {
                error.printStackTrace();
            }
        }

    }

    class ClearButton implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            nameTextField.setText("");
            emailTextField.setText("");
            contactTextField.setText("");
        }

    }

}
