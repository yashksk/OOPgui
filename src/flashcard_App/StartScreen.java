package flashcard_App;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartScreen {
	

	private JFrame signin;
	
	public StartScreen() {
		signin = new JFrame("Flash Card");
		signin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signin.setSize(400, 500);
		signin.getContentPane().setLayout(null);
		
		JButton LoginButton = new JButton("User Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LoginButton.setBounds(130, 122, 110, 34);
		signin.getContentPane().add(LoginButton);
		
		JButton SignUpButton = new JButton("User SignUp");
		SignUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SignUpButton.setBounds(130, 196, 110, 34);
		signin.getContentPane().add(SignUpButton);
		
		JButton AdminButton = new JButton("Admin Login");
		AdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AdminButton.setBounds(130, 268, 110, 34);
		signin.getContentPane().add(AdminButton);
		signin.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new StartScreen();
			}
		});

	}
}
