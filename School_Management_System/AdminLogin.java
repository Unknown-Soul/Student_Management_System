import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("ADMIN LOGIN");
		lbl1.setFont(new Font("Dialog", Font.BOLD, 19));
		lbl1.setBounds(129, 12, 188, 30);
		panel.add(lbl1);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setFont(new Font("Dialog", Font.BOLD, 19));
		lblUserName.setBounds(53, 82, 135, 30);
		panel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 19));
		lblPassword.setBounds(53, 124, 135, 30);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(262, 82, 135, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(262, 124, 135, 30);
		panel.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String name = textField.getText();
				String password = String.valueOf(passwordField.getPassword());
				if(name.equals("admin")&&password.equals("admin123"))
                 {
	            	AdminSucces.main(new String[]{});              /* GOTO admin SUCCESS.java */
					//Window frame = null;
					//frame.dispose();
	             }
                else
                 {
	            	JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
		            textField.setText("");
		            passwordField.setText("");
	             }
		 }
		});
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 19));
		btnLogin.setBounds(163, 166, 117, 43);
		panel.add(btnLogin);
	}
}
