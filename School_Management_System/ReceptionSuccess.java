import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ReceptionSuccess extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceptionSuccess frame = new ReceptionSuccess();
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
	public ReceptionSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 0, 440, 15);
		contentPane.add(panel);
		

		JLabel jLable = new JLabel("  WELCOME");
		jLable.setFont(new Font("Dialog", Font.BOLD, 20));
		jLable.setBounds(141, 12, 137, 52);
		contentPane.add(jLable);
		
		
		
		JButton jButton1 = new JButton("ADD STUDENT");
		jButton1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				AddStudent.main(new String[] {});
				
				
			}
		});
		jButton1.setBounds(140, 84, 149, 25);
		contentPane.add(jButton1);
		
		
		
		JButton jButton2 = new JButton("VIEW STUDENT");
		jButton2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
                 ViewStudent.main(new String [] {});
               
				
			}
		});
		jButton2.setBounds(140, 142, 149, 25);
		contentPane.add(jButton2);
		
		JButton jButton4 = new JButton("LOGOUT");
		jButton4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Receptionist.main(new String [] {});
            
							
			}
		});
		jButton4.setBounds(140, 202, 149, 25);
		contentPane.add(jButton4);
	}
}
