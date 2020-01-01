import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class AddTeacher extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String Gender; 
	private String Qualification;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	FileInputStream fistream,fistream_1,fistream_2;
	File pics,docs,docs_1;
	JFileChooser picChooser,docChooser_1,docChooser_2;
	private JTextField textField_8;
	private JTextField textField_9;
	private String Course;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
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
	public AddTeacher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		//creating Lable name
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(26, 25, 70, 15);
		panel.add(lblName);
    	//creating TextBox1
		textField = new JTextField();
		textField.setBounds(188, 25, 439, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		
		
		// creating lable Father
		JLabel lblF = new JLabel("FATHER NAME");
		lblF.setBounds(26, 53, 117, 15);
		panel.add(lblF);
     	// creating TextBox2 father 
		textField_1 = new JTextField();
		textField_1.setBounds(188, 51, 439, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		
		//Creating Gender field
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBounds(26, 80, 70, 15);
		panel.add(lblGender);
		//Creating Radio Button Male
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				Gender = "Male";
			}
		});
		rdbtnMale.setBounds(198, 78, 149, 23);
		panel.add(rdbtnMale);
		//Creating Radio Button Female
		JRadioButton rdbtnFeamale = new JRadioButton("Female");
		rdbtnFeamale.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				Gender = "Female";
			}
		});
		rdbtnFeamale.setBounds(423, 78, 149, 23);
		panel.add(rdbtnFeamale);
		//Adding Button Group
		ButtonGroup group =new ButtonGroup();
		group.add(rdbtnMale);
        group.add(rdbtnFeamale);	
        
      
        
        
      //Choose date of birth 
        JLabel lblDateOfBirth = new JLabel("Date OF Birth");
		lblDateOfBirth.setBounds(26, 113, 117, 15);
		panel.add(lblDateOfBirth);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(188, 109, 439, 19);
		panel.add(dateChooser);
		
        
		
		//Qualification
				JLabel lblQualification = new JLabel("QUALIFICATION");
				lblQualification.setBounds(26, 140, 117, 19);
				panel.add(lblQualification);
				
				JRadioButton rdbtnMatriculation = new JRadioButton("Matriculation");
				rdbtnMatriculation.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						Qualification = "Matriculation";
					}
				});
				rdbtnMatriculation.setBounds(188, 136, 127, 23);
				panel.add(rdbtnMatriculation);
				
				JRadioButton rdbtnIntermediate = new JRadioButton("Intermediate");
				rdbtnIntermediate.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						Qualification = "Intermediate";
					}
				});
				rdbtnIntermediate.setBounds(319, 136, 117, 23);
				panel.add(rdbtnIntermediate);
				
				JRadioButton rdbtnGrdauate = new JRadioButton("Grdauate");
				rdbtnGrdauate.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						Qualification = "Gradute";
					}
				});
                rdbtnGrdauate.setBounds(439, 136, 92, 23);
				panel.add(rdbtnGrdauate);
				
				JRadioButton rdbtnPostGradute = new JRadioButton("Post Gradute");
				rdbtnPostGradute.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						Qualification = "Post Graduation";
					}
				});
				rdbtnPostGradute.setBounds(535, 136, 149, 23);
				panel.add(rdbtnPostGradute);
				
				ButtonGroup group1 =new ButtonGroup();
				group1.add(rdbtnPostGradute);
		        group1.add(rdbtnGrdauate);	
		        group1.add(rdbtnIntermediate);
		        group1.add(rdbtnMatriculation);
       
		//Creating Email
		        JLabel lblEmail = new JLabel("EMAIL");
				lblEmail.setBounds(26, 167, 70, 15);
				panel.add(lblEmail);
				
				textField_2 = new JTextField();
				textField_2.setBounds(188, 165, 439, 19);
				panel.add(textField_2);
				textField_2.setColumns(10);
				
		//Creating Address
				JLabel lblAddress = new JLabel("ADDRESS ");
				lblAddress.setBounds(26, 191, 70, 15);
				panel.add(lblAddress);
				
				textField_3 = new JTextField();
				textField_3.setBounds(188, 189, 439, 19);
				panel.add(textField_3);
				textField_3.setColumns(10);
				
		//Creating PIncode
				
				JLabel lblPincode = new JLabel("PINCODE");
				lblPincode.setBounds(26, 218, 70, 15);
				panel.add(lblPincode);
				
				textField_4 = new JTextField();
				textField_4.setBounds(188, 214, 439, 19);
				panel.add(textField_4);
				textField_4.setColumns(10);
				
		 //Creating Phone Number 
				
				JLabel lblMobile = new JLabel("MOBILE");
				lblMobile.setBounds(26, 239, 70, 15);
				panel.add(lblMobile);
				
				textField_5 = new JTextField();
				textField_5.setBounds(188, 237, 202, 19);
				panel.add(textField_5);
				textField_5.setColumns(10);
				
				textField_6 = new JTextField();
				textField_6.setBounds(412, 237, 215, 19);
				panel.add(textField_6);
				textField_6.setColumns(10);
				
				
				// Creating Image
				
				textField_7 = new JTextField();
				textField_7.setBounds(412, 271, 215, 22);
				panel.add(textField_7);
				textField_7.setColumns(10);
				
				
				JLabel lblImage = new JLabel("IMAGE");
				lblImage.setBounds(26, 273, 70, 15);
				panel.add(lblImage);
				
				JButton btnNewButton = new JButton("Choose Image");
				btnNewButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e)
					{
						  try
						  {
						     JFileChooser picChooser = new JFileChooser();    //creates the JFileChooser object
						     int returnVal = picChooser.showOpenDialog(null); //Opens the JFileChooser window
						     File file = null;
						     if(returnVal  == JFileChooser.APPROVE_OPTION)     //Confirmation for selected file
						     {
						        file  = picChooser.getSelectedFile();             //Returns the selected file.
						        String filename=file.getAbsolutePath();          //Returns the path of the file.
						        pics=new File(filename);              //File pics; (Define as global variable).
						        fistream=new FileInputStream(pics);  //FileInputStream fistream ; (Define as global  variable).
						        textField_7.setText(file.getAbsolutePath());
						        
						        /*
						         * variables pics and fistream will be used in Step 5 for 
						         * converting image into binary format for saving image in MySQL
						         */
						     }
						  }
						  catch(Exception  ex)
						  {
						        ex.printStackTrace();
						  }
						
				    }
				});
				
				
				
				
				
				//Creating Document
				
				JLabel lblDocument = new JLabel("DOCUMENT");
				lblDocument.setBounds(26, 308, 84, 15);
				panel.add(lblDocument);
				
				JButton btnNewButton_1 = new JButton("Document_1");
				btnNewButton_1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						 try
						  {
						     JFileChooser docChooser_1 = new JFileChooser();    //creates the JFileChooser object
						     int returnVal = docChooser_1.showOpenDialog(null); //Opens the JFileChooser window
						     File file_1 = null;
						     if(returnVal  == JFileChooser.APPROVE_OPTION)     //Confirmation for selected file
						     {
						        file_1  = docChooser_1.getSelectedFile();             //Returns the selected file.
						        String filename=file_1.getAbsolutePath();          //Returns the path of the file.
						        docs=new File(filename);              //File docs; (Define as global variable).
						        fistream_1=new FileInputStream(docs);  //FileInputStream fistream ; (Define as global  variable).
						        textField_8.setText(file_1.getAbsolutePath());
						        
						        /*
						         * variables pics and fistream will be used in Step 5 for 
						         * converting image into binary format for saving image in MySQL
						         */
						     }
						  }
						  catch(Exception ex)
						 {
						  
						        ex.printStackTrace();
						  }
					}
					
				});
				btnNewButton_1.setBounds(188, 305, 202, 25);
				panel.add(btnNewButton_1);
				
			      JButton btnNewButton_2 = new JButton("Document_2");
				  btnNewButton_2.addActionListener(new ActionListener() 
				  {
					public void actionPerformed(ActionEvent e)
					 {

						 try
						  {
						     JFileChooser docChooser_2 = new JFileChooser();    //creates the JFileChooser object
						     int returnVal = docChooser_2.showOpenDialog(null); //Opens the JFileChooser window
						     File file_2 = null;
						     if(returnVal  == JFileChooser.APPROVE_OPTION)     //Confirmation for selected file
						     {
						        file_2= docChooser_2.getSelectedFile();             //Returns the selected file.
						        String filename=file_2.getAbsolutePath();          //Returns the path of the file.
						        docs_1=new File(filename);              //File docs; (Define as global variable).
						        fistream_2=new FileInputStream(docs_1);  //FileInputStream fistream ; (Define as global  variable).
						        textField_9.setText(file_2.getAbsolutePath());
						        
						        /*
						         * variables pics and fistream will be used in Step 5 for 
						         * converting image into binary format for saving image in MySQL
						         */
						     }
						  }
						  catch(Exception ex)
						 {
						  
						        ex.printStackTrace();
						  }
					}
				});
				btnNewButton_2.setBounds(412, 303, 215, 25);
				panel.add(btnNewButton_2);
				
				textField_8 = new JTextField();
				textField_8.setBounds(188, 340, 202, 19);
				panel.add(textField_8);
				textField_8.setColumns(10);
				
			      textField_9 = new JTextField();
				  textField_9.setBounds(412, 340, 221, 19);
				  panel.add(textField_9);
				  textField_9.setColumns(10);
				
				
				btnNewButton.setBounds(188, 268, 202, 25);
				panel.add(btnNewButton);
				
				
				
				
				//Creating Course
				JLabel lblNewLabel = new JLabel("COURSE");
				lblNewLabel.setBounds(26, 374, 70, 15);
				panel.add(lblNewLabel);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Optical Fiber", "Document Assistant", "Solar Power", "Customer Care Executive", "Field Tech-Networking and Stroage"}));
		
				comboBox.setBounds(188, 374, 202, 24);
				panel.add(comboBox);
				
				
				
	    
		//creating save button
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
			    String name = textField.getText();
			    String fathername =textField_1.getText();
			    String Date =dateChooser.getDateFormatString();
			    String Email = textField_2.getText();
			    String Address = textField_3.getText();
                String Pincode = textField_4.getText();
			    String Phone_1 = textField_5.getText();
			    String Phone_2 = textField_6.getText();
				String Course = (String) comboBox.getItemAt(comboBox.getSelectedIndex());
			 
			  
			    
			    
			  
				int i = AddStudentDao.Save(name,fathername,Gender,Date,Qualification,Email,Address,Pincode,Phone_1,Phone_2,fistream,pics,fistream_1,docs,fistream_2,docs_1,Course);
			    if(i>0){
					JOptionPane.showMessageDialog(AddTeacher.this,"Teacher data added successfully!");
				
				}
			    else
			    {
					JOptionPane.showMessageDialog(AddTeacher.this,"Sorry, unable to save!");
				}
			}

			
		});
		btnSave.setBounds(423, 416, 117, 43);
		panel.add(btnSave);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	
	
	}
}
