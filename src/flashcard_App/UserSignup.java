package flashcard_App;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserSignup {

	private JFrame userSignup;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public UserSignup() {
		userSignup = new JFrame("User Login");
		userSignup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userSignup.setSize(400, 500);
		userSignup.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(33, 96, 45, 13);
		userSignup.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(33, 168, 45, 13);
		userSignup.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(33, 249, 45, 13);
		userSignup.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(33, 119, 237, 19);
		userSignup.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(33, 199, 237, 19);
		userSignup.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(33, 289, 237, 19);
		userSignup.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(139, 362, 85, 21);
		userSignup.getContentPane().add(btnNewButton);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new UserSignup();
			}
		});

	}

}
