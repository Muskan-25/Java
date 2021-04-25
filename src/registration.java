import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class registration implements ActionListener{

	JFrame fr;
	JLabel firstName, lastName, guardianName, course, emailId, gender, interest, remarks;
	JTextField fName, lName,gName,email;
	JTextArea remark;
	JComboBox courseComboBox;
	JRadioButton male,female,a,b,c,d;
	JButton submit,clearButton;	
	
	public void details() {
	
		Font font1 = new Font("SansSerif", Font.BOLD, 25);
		Font font2 = new Font("SansSerif", Font.PLAIN,20);
		
		fr = new JFrame("Registration");
		
		firstName = new JLabel("First Name");
		firstName.setBounds(40, 40, 300, 30);
		firstName.setFont(font1);
		
		fName= new JTextField();
		fName.setBounds(240, 40, 300, 30);
		fName.setFont(font2);
	
		lastName = new JLabel("Last Name");
		lastName.setBounds(40, 80, 300, 30);
		lastName.setFont(font1);
		
		lName= new JTextField();
		lName.setBounds(240, 80, 300, 30);
		lName.setFont(font2);

		
		guardianName = new JLabel("Guardian Name");
		guardianName.setBounds(40, 120, 300, 30);
		guardianName.setFont(font1);
		
		gName= new JTextField();
		gName.setBounds(240, 120, 300, 30);
		gName.setFont(font2);

		course = new JLabel("course");
		course.setBounds(40, 160, 300, 30);
		course.setFont(font1);
		
		String courses[]= {"SELECT","Core JAVA","HTML & CSS","Responsive Web Designing","Digital Marketing","Programming in C","Other"};
		courseComboBox = new JComboBox(courses);
		courseComboBox.setBounds(240, 160, 300, 30);
		courseComboBox.setFont(font2);
		
		emailId = new JLabel("Email Id");
		emailId.setBounds(40, 200, 300, 30);
		emailId.setFont(font1);
		
		email= new JTextField();
		email.setBounds(240, 200, 300, 30);
		email.setFont(font2);
		
		gender = new JLabel("Gender");
		gender.setBounds(40, 240,300, 30);
		gender.setFont(font1);
		
		male = new JRadioButton("MALE");
		male.setFont(font2);
		male.setBounds(240, 240, 150, 30);
		
		female =  new JRadioButton("FEMALE");
		female.setFont(font2);
		female.setBounds(400, 240, 200, 30);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		interest = new JLabel("Interest");
		interest.setBounds(40, 280, 300, 40);
		interest.setFont(font1);
		
		a= new JRadioButton("Singing");
		a.setFont(font2);
		a.setBounds(240, 280, 150, 30);
		
		b = new JRadioButton("Dancing");
		b.setFont(font2);
		b.setBounds(390, 280, 150, 30);
		
		c = new JRadioButton("Crafts");
		c.setFont(font2);
		c.setBounds(240, 305, 150, 30);
		
		d = new JRadioButton("Others");
		d.setFont(font2);
		d.setBounds(390, 305, 150, 30);
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(a);
		bg2.add(b);
		bg2.add(c);
		bg2.add(d);
		
		remarks = new JLabel("Remarks");
		remarks.setBounds(40, 330, 300, 70);
		remarks.setFont(font1);
		
		remark = new JTextArea();
		remark.setBounds(240, 350, 300, 200);
		remark.setFont(font2);
		
		submit = new JButton("Submit");
		submit.setBounds(40, 610, 160, 30);
		submit.setFont(font1);
		submit.addActionListener((ActionListener) this);
		
		clearButton = new JButton("Clear");
		clearButton.setBounds(240, 610, 160, 30);
		clearButton.setFont(font1);
		clearButton.addActionListener((ActionListener) this);
	
		fr.add(firstName);
		fr.add(fName);
		
		fr.add(lastName);
		fr.add(lName);
		
		fr.add(guardianName);
		fr.add(gName);
		
		fr.add(course);
		fr.add(courseComboBox);
		
		fr.add(emailId);
		fr.add(email);
		
		fr.add(gender);
		fr.add(male);
		fr.add(female);
		
		fr.add(interest);
		fr.add(a);
		fr.add(b);
		fr.add(c);
		fr.add(d);
		
		fr.add(remarks);
		fr.add(remark);
		
		fr.add(submit);
		
		fr.add(clearButton);
		

		fr.setLayout(null);
		fr.setResizable(true);
		fr.setSize(600, 900);
		fr.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand()=="Clear") {
			//System.clearProperty(key);
		}
		if(ae.getActionCommand()=="Submit") {
			if(!fName.getText().equals("")) {
			try {
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con = DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/javaTables","root","gUrUjI.1");  
				//here sonoo is database name, root is username and password  
				Statement stmt=con.createStatement();  
				PreparedStatement stat= con.prepareStatement("INSERT INTO JAVA VALUES (?,?,?,?,?)");
				String firstName= fName.getText();
				String lastName= lName.getText();
				String guardianName= gName.getText();
				String emailId= email.getText();
				String remarkk= remark.getText();
				
				stat.setString(1, firstName);
				stat.setString(2, lastName);
				stat.setString(3, guardianName);
				stat.setString(4, emailId);
				stat.setString(5, remarkk);
				
				stat.executeUpdate();
				
				fName.setText("");
				lName.setText("");
				gName.setText("");
				email.setText("");
				remark.setText("");
				
				JOptionPane.showMessageDialog(fr, "Done","Information",JOptionPane.INFORMATION_MESSAGE);
			}
			catch(Exception e) {
				String msg =e.getMessage();
				if(e.getMessage().equals(msg)) {
					JOptionPane.showMessageDialog(fr, "already exists","warning message",JOptionPane.WARNING_MESSAGE);
					fName.setText("");
					lName.setText("");
					gName.setText("");
					email.setText("");
					remark.setText("");
				}
				
			}
		}
			else {
				JOptionPane.showMessageDialog(fr, "Please fill the details properly.","Error Message",JOptionPane.ERROR_MESSAGE);
			}
	}
	}
	public static void main(String[] args) {
		registration r = new registration();
		r.details();
	}
	
}
