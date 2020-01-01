import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PMKVY {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PMKVY window = new PMKVY();
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
	public PMKVY() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Admin Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
			}
		});
		button.setBounds(114, 91, 195, 58);
		frame.getContentPane().add(button);
		
		JButton button2 = new JButton("Receptionist Login");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReceptionistLogin.main(new String[]{});
			}
		});
		button2.setBounds(114, 179, 195, 58);
		frame.getContentPane().add(button2);
		
		JLabel labell1 = new JLabel("MY INDIA , SKILL INDIA");
		labell1.setBounds(65, 30, 304, 27);
		labell1.setFont(new Font("Dialog", Font.BOLD, 22));
		frame.getContentPane().add(labell1);
	}
}
