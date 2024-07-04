import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpPage extends JFrame implements ActionListener {
    // Components of the sign-up form
    private Container container;
    private JLabel titleLabel;
    private JLabel userLabel;
    private JTextField userTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JButton signUpButton;
    private JButton resetButton;
    private JLabel messageLabel;

    // Constructor to initialize the components
    public SignUpPage() {
        setTitle("Sign-Up Page");
        setBounds(300, 90, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        titleLabel = new JLabel("Sign Up");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        titleLabel.setBounds(150, 30, 100, 30);
        container.add(titleLabel);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 100, 30);
        container.add(userLabel);

        userTextField = new JTextField();
        userTextField.setBounds(150, 80, 150, 30);
        container.add(userTextField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 130, 100, 30);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 130, 150, 30);
        container.add(passwordField);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 180, 100, 30);
        container.add(emailLabel);

        emailTextField = new JTextField();
        emailTextField.setBounds(150, 180, 150, 30);
        container.add(emailTextField);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(50, 230, 100, 30);
        signUpButton.addActionListener(this);
        container.add(signUpButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 230, 100, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);

        messageLabel = new JLabel();
        messageLabel.setBounds(50, 280, 250, 30);
        container.add(messageLabel);
    }

    // Implementing the actionPerformed method to handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());
            String email = emailTextField.getText();

            // Simple validation
            if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                messageLabel.setText("Please fill in all fields.");
                messageLabel.setForeground(Color.RED);
            } else if (!email.contains("@") || !email.contains(".")) {
                messageLabel.setText("Invalid email format.");
                messageLabel.setForeground(Color.RED);
            } else {
                // Here you would normally add code to save the user data
                messageLabel.setText("Sign up successful!");
                messageLabel.setForeground(Color.GREEN);
            }
        } else if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
            emailTextField.setText("");
            messageLabel.setText("");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.setVisible(true);
    }
}
