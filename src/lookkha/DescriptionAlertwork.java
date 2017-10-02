package lookkha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class DescriptionAlertwork {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DescriptionAlertwork window = new DescriptionAlertwork();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DescriptionAlertwork() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("\u0E1C\u0E25\u0E01\u0E32\u0E23\u0E2A\u0E21\u0E31\u0E04\u0E23\u0E07\u0E32\u0E19");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		frame.getContentPane().add(label, BorderLayout.NORTH);
		
		JTextPane textPane = new JTextPane();
		frame.getContentPane().add(textPane, BorderLayout.CENTER);
		
		JButton button = new JButton("\u0E1B\u0E34\u0E14");
		frame.getContentPane().add(button, BorderLayout.SOUTH);
	}

}
