package PersonalAssistant;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class LoginPage
{	
	JFrame frame;
	JTextField tf;
	JPasswordField pf;
	JOptionPane p;
	JLabel l1,l2,l3,l4;
	JButton b;
	LoginPage()
	{
		frame=new JFrame("Login Page");
		l1=new JLabel("LOGIN PAGE");
		l1.setBounds(150,20,300,25);
		l2=new JLabel("Enter UserId:");
		l2.setBounds(70,100,100,25);
		tf=new JTextField();
		tf.setBounds(195,100,100,25);
		l3=new JLabel("Password:");
		l3.setBounds(70,150,100,25);
		l4=new JLabel("Welcome to E-Diary Thank You For choosing Our E-Diary");
		l4.setBounds(0,60,400,25);
		pf=new JPasswordField();
		pf.setBounds(195,150,100,25);
		b=new JButton("Login");
		b.setBounds(130,205,125,25);
		b.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							String name=tf.getText();
							String pass=String.valueOf(pf.getPassword());
							if(name.equals("admin") && pass.equals("admin123"))
							{
								ProjectFinal.main(new String[]{});
								frame.dispose();	
							}
							else
							{
								p.showMessageDialog(frame,"Invalid Please enter correct details");
							}
						}
					});
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(tf);
		frame.add(pf);
		frame.add(b);
		frame.setSize(400,300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		/*try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc://mysql://localhost:3306/sys","root","root");
		}
		catch(Exception e)
		{
			System.out.println("");
		}*/
		new LoginPage();
	}
}

