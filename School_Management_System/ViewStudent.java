
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.sql.ResultSet;

import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;

public class ViewStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblId;
	private JLabel lblIdN;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudent frame = new ViewStudent();
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
	public ViewStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//ID number
		lblId = new JLabel("IDENTIFICATION NUMBER ");
		lblId.setBounds(268, 51, 180, 15);
		contentPane.add(lblId);
		
		lblIdN = new JLabel("ID NUMBER");
		lblIdN.setBounds(493, 51, 117, 15);
		contentPane.add(lblIdN);
		
		//Getting text from user
		textField = new JTextField();
		textField.setBounds(39, 82, 189, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Dialog", Font.BOLD, 16));
		lblStudentName.setBounds(51, 44, 132, 26);
		contentPane.add(lblStudentName);
		
		
		
		//Getting user name
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(268, 78, 70, 15);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(493, 78, 117, 15);
		contentPane.add(lblNewLabel);
		
		
		
		
		//Show Image

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(651, 12, 180, 197);
		contentPane.add(desktopPane);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 180, 185);
		desktopPane.add(label);
		
		
		
		
		JButton btnShowData = new JButton("Show data");
		btnShowData.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String name =textField.getText();
			    ResultSet rs =ViewStudentDBO.getdata(name);
			    try {
					if (rs.next())
					 {
						String a = rs.getString(1);//first column value of ps which we got from DBO
							String n = rs.getString(2);
					    byte[] image = rs.getBytes(12);
					    Image img = Toolkit.getDefaultToolkit().createImage(image);
					    Image myImg = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
					    ImageIcon icon = new ImageIcon(myImg);
					    
					    
					    
						lblNewLabel.setText(n);
					   
				        lblIdN.setText(a);
				        label.setIcon(icon);			
					   
		
					
						
					 }
				} catch (Exception e1) {e1.printStackTrace();  
			    
				
				
			}
			}
		});
		btnShowData.setBounds(51, 120, 117, 25);
		contentPane.add(btnShowData);
		
	
		
	
		
	
	}

	
}
