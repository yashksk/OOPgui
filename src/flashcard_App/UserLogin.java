package flashcard_App;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin {
	
	private JFrame userLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	
	public UserLogin() {

		userLogin = new JFrame("User Login");
		userLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userLogin.setSize(400, 500);
		userLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(44, 99, 79, 25);
		userLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(44, 225, 79, 25);
		userLogin.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(44, 152, 195, 19);
		userLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(44, 282, 195, 19);
		userLogin.getContentPane().add(passwordField);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(154, 355, 85, 21);
		userLogin.getContentPane().add(btnNewButton);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new UserLogin();
			}
		});

	}
}
