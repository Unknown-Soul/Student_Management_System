import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class ReceptionistLogin extends JFrame
{
	static  ReceptionistLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					frame= new ReceptionistLogin();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReceptionistLogin()
       {
  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Welcome");
		lbl1.setBounds(173, 10, 104, 24);
		lbl1.setFont(new Font("Dialog", Font.BOLD, 20));
		contentPane.add(lbl1);
		
		JLabel label = new JLabel("LOGIN NAME");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("Dialog", Font.BOLD, 19));
		label.setBounds(43, 77, 137, 23);
		contentPane.add(label);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 19));
		lblPassword.setBounds(43, 127, 137, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(286, 81, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setEchoChar('*');
		passwordField.setBounds(286, 128, 114, 19);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() 
		{
			String NAME=textField.getText();
			String PASSWORD=String.valueOf(passwordField.getPassword());

			public void actionPerformed(ActionEvent e)
			{
				
				if(ReceptionDBO.Validate(NAME,PASSWORD))
				{
					ReceptionSuccess.main(new String[]{});
					
				}
				else
				{
					JOptionPane.showMessageDialog(ReceptionistLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
				}
						
			
			}
		});
		btnLogin.setBounds(160, 175, 117, 25);
		contentPane.add(btnLogin);
		
		
	
		
       }
}