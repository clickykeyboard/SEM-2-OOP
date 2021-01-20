import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.sql.*;

public class GUIDB {

    public String databaseURL;
    public Connection connection;

    JFrame frame;
    JPanel leftPanel;
    public JTextArea textAreaPhone;
    public JTextArea textAreaName;
    public JTextArea textAreaEmail;

    public int entries = 0;

    public GUIDB(String databaseURL) {

        this.databaseURL = databaseURL;

        try {
            connection = DriverManager.getConnection(this.databaseURL);
            System.out.println("Connected to the database");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    public static void main(String args[]) {

        GUIDB guiDB = new GUIDB("jdbc:ucanaccess://C:/Users/ADMIN/Desktop/OOP/OOP/Week 16/Assignment/MyDB.accdb");
        Connection connection = guiDB.connection;

        guiDB.frame = new JFrame("Data Form");
        guiDB.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        guiDB.leftPanel = new JPanel();
        BoxLayout leftPanelLayout = new BoxLayout(guiDB.leftPanel, BoxLayout.Y_AXIS);
        guiDB.leftPanel.setLayout(leftPanelLayout);

        guiDB.updateData();

        JPanel bottomLeftPanel = new JPanel();
        BoxLayout bottomLeftPanelLayout = new BoxLayout(bottomLeftPanel, BoxLayout.Y_AXIS);
        bottomLeftPanel.setLayout(bottomLeftPanelLayout);

        JLabel nameLabel = new JLabel("Name");
        guiDB.textAreaName = new JTextArea(1, 20);
        guiDB.textAreaName.setLineWrap(true);
        bottomLeftPanel.add(nameLabel);
        bottomLeftPanel.add(guiDB.textAreaName);

        JLabel emailLabel = new JLabel("Email");
        guiDB.textAreaEmail = new JTextArea(1, 20);
        guiDB.textAreaEmail.setLineWrap(true);
        bottomLeftPanel.add(emailLabel);
        bottomLeftPanel.add(guiDB.textAreaEmail);

        JLabel phoneLabel = new JLabel("Phone");
        guiDB.textAreaPhone = new JTextArea(1, 20);
        guiDB.textAreaPhone.setLineWrap(true);
        bottomLeftPanel.add(phoneLabel);
        bottomLeftPanel.add(guiDB.textAreaPhone);

        JButton submitButton = new JButton("Submit Data");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String query = String.format("INSERT INTO data(Naam, Email, contact) Values('%s', '%s', '%s')",
                        guiDB.textAreaName.getText(), guiDB.textAreaEmail.getText(), guiDB.textAreaPhone.getText());
                try {
                    Statement statement = connection.createStatement();

                    int row = statement.executeUpdate(query);

                    if (row >= 0) {
                        JLabel label = new JLabel("  " + ++guiDB.entries + " - " + guiDB.textAreaName.getText() + " - "
                                + guiDB.textAreaEmail.getText() + " - " + guiDB.textAreaPhone.getText());
                        guiDB.leftPanel.add(label);
                        guiDB.frame.setVisible(true);

                        guiDB.textAreaName.setText("");
                        guiDB.textAreaPhone.setText("");
                        guiDB.textAreaEmail.setText("");
                    }

                } catch (SQLException error) {
                    error.printStackTrace();
                }

            }
        });
        bottomLeftPanel.add(submitButton, BorderLayout.WEST);

        guiDB.frame.getContentPane().add(guiDB.leftPanel, BorderLayout.WEST);
        guiDB.frame.getContentPane().add(bottomLeftPanel, BorderLayout.SOUTH);
        guiDB.frame.setSize(400, 400);
        guiDB.frame.setVisible(true);

    }

    public void updateData() {
        String query = "SELECT * FROM data";
        try {

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {

                int rollNumber = result.getInt("Rollno");
                String name = result.getString("Naam");
                String email = result.getString("Email");
                String contact = result.getString("contact");

                JLabel label = new JLabel(
                        "  " + Integer.toString(rollNumber) + " - " + name + " - " + email + " - " + contact);
                leftPanel.add(label, BorderLayout.WEST);

                this.entries = rollNumber;
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

}
