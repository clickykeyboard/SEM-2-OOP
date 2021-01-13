import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import java.awt.event.*;

public class Login {

    public static boolean invalidPassword = false;
    public static String username = "admin";
    public static String password = "password";

    public static JLabel validLabel;
    public static JTextField usernameField;
    public static JTextField passwordField;

    public static void main(String args[]) {

        JFrame mainFrame = new JFrame("Login");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel usernamePanel = new JPanel();
        JPanel passwordPanel = new JPanel();
        JPanel middlePanel = new JPanel();

        JLabel usernameLabel = new JLabel("Enter Username");
        usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Enter Password");
        passwordField = new JPasswordField(20);

        usernamePanel.add(usernameLabel, BorderLayout.WEST);
        usernamePanel.add(usernameField, BorderLayout.EAST);

        passwordPanel.add(passwordLabel, BorderLayout.WEST);
        passwordPanel.add(passwordField, BorderLayout.EAST);
        validLabel = new JLabel("Incorrect password!");
        validLabel.setVisible(false);

        passwordPanel.add(validLabel, BorderLayout.SOUTH);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new Login().new LoginButton());

        mainFrame.getContentPane().add(usernamePanel, BorderLayout.NORTH);
        mainFrame.getContentPane().add(passwordPanel, BorderLayout.CENTER);
        mainFrame.getContentPane().add(middlePanel, BorderLayout.SOUTH);

        middlePanel.add(loginButton, BorderLayout.SOUTH);


        mainFrame.setSize(400, 400);
        mainFrame.setVisible(true);

    }

    class LoginButton implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (
            usernameField.
            getText().
            toString().
            equalsIgnoreCase(username) &&
            passwordField.
            getText().
            toString().
            equalsIgnoreCase(password)
            ) {
                System.out.println("Username correct");
                System.out.println("Password correct");
                invalidPassword = false;
            } else {
                invalidPassword = true;
            }

            validLabel.setVisible(true);           
            validLabel.setText("Access denied!");
            validLabel.setOpaque(true);
            validLabel.setBackground(Color.RED);

            if (!invalidPassword) {
                validLabel.setVisible(true);
                validLabel.setText("Logged in!");
                validLabel.setOpaque(true);
                validLabel.setBackground(Color.GREEN);
            }
        }
        
    }








}