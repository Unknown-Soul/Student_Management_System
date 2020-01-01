import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class AdminSucces extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSucces frame = new AdminSucces();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminSucces() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//welcome
		JLabel lblWelcome = new JLabel("             WELCOME");
		lblWelcome.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 15));
		lblWelcome.setBounds(169, 38, 226, 19);
		panel.add(lblWelcome);
		
		
		
		//addteacher
		JButton btnAddReceptionist = new JButton("ADD TEACHER");
		btnAddReceptionist.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				AddTeacher.main(new String[]{});
			}
		});
		btnAddReceptionist.setBounds(169, 121, 226, 51);
		panel.add(btnAddReceptionist);
		
		
		//View Teacher
		JButton btnViewReceptionist = new JButton("VIEW TEACHER ");
		btnViewReceptionist.setBounds(169, 184, 226, 54);
		panel.add(btnViewReceptionist);
		
		
		
		//Delete Teacher
		JButton btnDeleteReceptionist = new JButton("DELETE TEACHER");
		btnDeleteReceptionist.setBounds(169, 250, 226, 54);
		panel.add(btnDeleteReceptionist);
		
		
		//Logout
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(169, 316, 226, 48);
		panel.add(btnLogout);
		
		
	
		
		
		
		
		//add Receptionist
		JButton btnAddReceptionist_1 = new JButton("ADD RECEPTIONIST");
		btnAddReceptionist_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				AdReception.main(new String[]{});
			}
		});
		btnAddReceptionist_1.setBounds(169, 58, 226, 51);
		panel.add(btnAddReceptionist_1);
	}
}
