package usermanagement.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserManagementFrame extends JFrame {
	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField registerUsernameField;
	private JPasswordField registerPasswordField;
	private JTextField registerNameField;
	private JTextField registerEmailField;
 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public UserManagementFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));
		
		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		JLabel logoText = new JLabel("UserManagement");
		logoText.setHorizontalAlignment(SwingConstants.CENTER);
		logoText.setFont(new Font("D2Coding", Font.BOLD, 20));
		logoText.setBounds(105, 10, 162, 47);
		loginPanel.add(logoText);
		
		JLabel loginText = new JLabel("Login");
		loginText.setHorizontalAlignment(SwingConstants.CENTER);
		loginText.setFont(new Font("D2Coding", Font.BOLD, 20));
		loginText.setBounds(144, 42, 84, 37);
		loginPanel.add(loginText);
		
		usernameField = new JTextField();
		usernameField.setBounds(22, 115, 337, 33);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(22, 190, 337, 33);
		loginPanel.add(passwordField);
		
		JLabel usernameLable = new JLabel("Username or email");
		usernameLable.setFont(new Font("D2Coding", Font.BOLD, 12));
		usernameLable.setHorizontalAlignment(SwingConstants.LEFT);
		usernameLable.setBounds(22, 90, 154, 15);
		loginPanel.add(usernameLable);
		
		JLabel PasswordLable = new JLabel("password");
		PasswordLable.setFont(new Font("D2Coding", Font.BOLD, 12));
		PasswordLable.setHorizontalAlignment(SwingConstants.LEFT);
		PasswordLable.setBounds(22, 165, 62, 15);
		loginPanel.add(PasswordLable);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(new Color(255, 255, 255));
		loginButton.setForeground(new Color(0, 0, 0));
		loginButton.setFont(new Font("D2Coding", Font.BOLD, 15));
		loginButton.setBounds(22, 245, 337, 47);
		loginPanel.add(loginButton);
		
		JLabel signupDesc = new JLabel("Don't have an account?");
		signupDesc.setFont(new Font("Gadugi", Font.BOLD, 12));
		signupDesc.setHorizontalAlignment(SwingConstants.CENTER);
		signupDesc.setBounds(64, 338, 170, 23);
		loginPanel.add(signupDesc);
		
		JLabel signupLink = new JLabel("Sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");
			}
		});
		signupLink.setForeground(new Color(0, 128, 255));
		signupLink.setFont(new Font("굴림", Font.BOLD, 12));
		signupLink.setHorizontalAlignment(SwingConstants.CENTER);
		signupLink.setBounds(237, 343, 57, 15);
		loginPanel.add(signupLink);
		
		JLabel forgotPasswordLink = new JLabel("Forgot your password?");
		forgotPasswordLink.setForeground(new Color(0, 128, 255));
		forgotPasswordLink.setHorizontalAlignment(SwingConstants.CENTER);
		forgotPasswordLink.setFont(new Font("Gadugi", Font.BOLD, 12));
		forgotPasswordLink.setBounds(92, 371, 202, 23);
		loginPanel.add(forgotPasswordLink);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel signInLink = new JLabel("Sign in");
		signInLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
			}
		});
		signInLink.setForeground(new Color(0, 128, 255));
		signInLink.setHorizontalAlignment(SwingConstants.CENTER);
		signInLink.setBounds(299, 425, 85, 26);
		registerPanel.add(signInLink);
		
		JLabel RegisterLogoText2 = new JLabel("UserManagement");
		RegisterLogoText2.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterLogoText2.setFont(new Font("D2Coding", Font.BOLD, 20));
		RegisterLogoText2.setBounds(105, 10, 162, 47);
		registerPanel.add(RegisterLogoText2);
		
		JLabel registerText2 = new JLabel("Register");
		registerText2.setHorizontalAlignment(SwingConstants.CENTER);
		registerText2.setFont(new Font("D2Coding", Font.BOLD, 20));
		registerText2.setBounds(144, 42, 84, 37);
		registerPanel.add(registerText2);
		
		JLabel registerUsernameLable = new JLabel("Username");
		registerUsernameLable.setHorizontalAlignment(SwingConstants.LEFT);
		registerUsernameLable.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerUsernameLable.setBounds(24, 101, 154, 15);
		registerPanel.add(registerUsernameLable);
		
		registerUsernameField = new JTextField();
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(24, 126, 337, 26);
		registerPanel.add(registerUsernameField);
		
		JLabel registerPasswordLable = new JLabel("password");
		registerPasswordLable.setHorizontalAlignment(SwingConstants.LEFT);
		registerPasswordLable.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerPasswordLable.setBounds(24, 162, 62, 15);
		registerPanel.add(registerPasswordLable);
		
		registerPasswordField = new JPasswordField();
		registerPasswordField.setBounds(24, 188, 337, 26);
		registerPanel.add(registerPasswordField);
		
		JLabel registerNameLable = new JLabel("name");
		registerNameLable.setHorizontalAlignment(SwingConstants.LEFT);
		registerNameLable.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerNameLable.setBounds(24, 224, 39, 15);
		registerPanel.add(registerNameLable);
		
		registerNameField = new JTextField();
		registerNameField.setColumns(10);
		registerNameField.setBounds(24, 249, 337, 26);
		registerPanel.add(registerNameField);
		
		JLabel registerEmailLable = new JLabel("email");
		registerEmailLable.setHorizontalAlignment(SwingConstants.LEFT);
		registerEmailLable.setFont(new Font("D2Coding", Font.BOLD, 12));
		registerEmailLable.setBounds(24, 285, 47, 15);
		registerPanel.add(registerEmailLable);
		
		registerEmailField = new JTextField();
		registerEmailField.setColumns(10);
		registerEmailField.setBounds(24, 310, 337, 26);
		registerPanel.add(registerEmailField);
		
		JButton registerButton = new JButton("Register");
		registerButton.setForeground(Color.BLACK);
		registerButton.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerButton.setBackground(Color.WHITE);
		registerButton.setBounds(24, 362, 337, 47);
		registerPanel.add(registerButton);
	}
}
