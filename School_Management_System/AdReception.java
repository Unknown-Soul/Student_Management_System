import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AdReception extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblAddReceptionists;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdReception frame = new AdReception();
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
	public AdReception() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(206, 63, 180, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 126, 180, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(59, 65, 95, 39);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(59, 131, 95, 31);
		contentPane.add(lblPassword);
		
		JButton btnAddReceptionist = new JButton("ADD RECEPTIONIST");
		btnAddReceptionist.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String name=textField.getText();
				String password =textField_1.getText();
				int i =AddReceptionistDao.Save(name,password);	
				if(i>0){
					JOptionPane.showMessageDialog(AdReception.this,"Receptionist added successfully!");
				
				}
			    else
			    {
					JOptionPane.showMessageDialog(AdReception.this,"Receptionist, unable to save!");
				}
			}
		});
		btnAddReceptionist.setBounds(134, 197, 164, 25);
		contentPane.add(btnAddReceptionist);
		
		lblAddReceptionists = new JLabel("ADD RECEPTIONISTS");
		lblAddReceptionists.setBounds(194, 12, 164, 15);
		contentPane.add(lblAddReceptionists);
	}
}
