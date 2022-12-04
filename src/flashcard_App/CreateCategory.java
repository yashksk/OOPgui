package flashcard_App;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreateCategory {
	private JFrame frame;
	private JTextField textField;
	
	public CreateCategory() {
		frame = new JFrame("Create Category");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 500);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Type new Category");
		lblNewLabel.setBounds(32, 51, 112, 13);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(32, 136, 293, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CreateCategory();
			}
		});
	}

}
