package wswd412_fa2.sectiona_atm;

// Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
    // Define Variables
    JButton loginButton;
    JPanel myPanel;
    JLabel userLabel, passLabel, Feedback;
    JTextField userText;
    JPasswordField passText;
    
    Login()
    {
        // Creating Elements
        userLabel = new JLabel("Username: ");
        userText = new JTextField(15);
        passLabel = new JLabel("Password: ");
        passText = new JPasswordField();
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        
        Feedback = new JLabel();
        
        myPanel = new JPanel(new GridLayout(6,2,5,5));
        myPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Adding Elements to Panel
        myPanel.add(userLabel);   
        userLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        myPanel.add(userText);
        userText.setBorder(BorderFactory.createEmptyBorder(10, 10,5,5));
        myPanel.add(passLabel);
        passLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        myPanel.add(passText);
        passText.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        myPanel.add(loginButton);
        loginButton.setBackground(Color.LIGHT_GRAY);
        loginButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        myPanel.add(Feedback);
        Feedback.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Adding Elements to Frame
        add(myPanel);
        
        // Setting up the Frame
        setTitle("ATM Login");
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String userValue = userText.getText();
        String passValue = passText.getText();
        
        if(userValue.equals("UserName") && passValue.equals("Password"))
        {
            ATM_f atm_session = new ATM_f();
            
            Login login = new Login();
                        
            atm_session.setVisible(true);
            dispose();
        }
        else
        {
            Feedback.setText("Please enter valid credentials");
            Feedback.setForeground(Color.RED);
        }
    }
    
    public static void main(String[] args)
    {
        Login ATM_Login = new Login();
        ATM_Login.setSize(300,300);
        ATM_Login.setVisible(true);
    }
}
