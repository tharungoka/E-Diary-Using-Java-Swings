package PersonalAssistant;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.event.WindowEvent; 
import java.awt.event.WindowListener; 
import java.text.*; 
public class ProjectFinal extends WindowAdapter implements ActionListener 
{
	JTextField tfl;
	JPasswordField pfl;
	JLabel ll,ll1,ll2,ll3;
	JPanel contentPane;
	JButton bl;
	JFrame f,f1,f2,f3,f4,f5,frame;
	JButton f1_1,f1_2,f1_3,f1_4;
	JButton f2_1,f2_2,f2_3,f2_4,f2_5;
	JButton f4_1,f4_2,f4_3,f4_4,f4_5;
	JButton f3_1,f3_2,f3_3,f3_4;
	JButton a,b,c,d,e,chat;
	DefaultListModel<String> l1,l2,l3,l4;
	JList<String> l,l5,l6,l7,l8;
	JLabel m,m1,m2,m3,m4,m6;
	JTextField t,t1,t2,t3;
	JLabel m5,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20;
	File g;
	String sr,sx,sr1;
	Runtime r=Runtime.getRuntime();
        Process p=null;
	String s,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
	File[] arr,arr1,arr2;
	File main,main1,main2;
	int i,i1;
	ProjectFinal()
	{
		i=0;
		i1=0;	
		m12=new JLabel();
		m13=new JLabel();
		m14=new JLabel();
		m15=new JLabel();
		m16=new JLabel();
		m19=new JLabel();
		m19.setBounds(140,0,250,25);
		m=new JLabel("Welcome to E-Diary.Thank you for choosing our E-Diary");
		m.setBounds(50,20,500,50);
		f=new JFrame("Electronic Diary");
		a=new JButton("WRITE");
		a.setBounds(140,70,200,50);
		b=new JButton("UPDATE");
                b.setBounds(140,150,200,50);
		c=new JButton("GET");
                c.setBounds(140,230,200,50);
		d=new JButton("DELETE");
                d.setBounds(140,310,200,50);
		chat=new JButton("CHATBOT");
		chat.setBounds(140,390,200,50);
		e=new JButton("EXIT");
                e.setBounds(140,470,200,50);
		f.add(a);
		a.addActionListener(this);
		f.add(b);
		b.addActionListener(this);
		f.add(c);
                c.addActionListener(this);
		f.add(d);
                d.addActionListener(this);
		f.add(chat);
		chat.addActionListener(this);
		f.add(e);
		f.add(m);
		Date date=new Date();
		SimpleDateFormat ft1 = 
		new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		String msg=ft1.format(date);
		m19.setText(msg);
		f.add(m19);
		f.setResizable(false);
		e.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							int by=JOptionPane.showConfirmDialog(f,"Are Yoy Sure ?");
							if(by==JOptionPane.YES_OPTION)
							{
								f.dispose();
							}
						}
					});
		f.setSize(500,600);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==a)
		{
			m1=new JLabel("Create A Notes Here..!");
			m1.setBounds(100,50,500,50);
			m2=new JLabel("Enter Name of Notes and click Submit");
			m2.setBounds(100,75,500,50);
			f1=new JFrame("WRITE");
			f1_1=new JButton("GO BACK");
			f1_1.setBounds(10,10,100,25);
			f1_1.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								f1.dispose();
							}
						});
			t=new JTextField();
			t.setBounds(100,125,190,25);
			f1_3=new JButton("SUBMIT");
			f1_3.setBounds(290,125,100,25);
			Date date1=new Date();
			SimpleDateFormat ft = 
      			new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
                        String msg1=ft.format(date1);
                        m20=new JLabel();
                        m20.setText(msg1);
			f1_3.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e1)
							{	
								sr="/home/gtk678/Java_Projects/Mini_Project/Notes/"+t.getText();
								try
								{
                                                                	sx="leafpad "+sr;
                                                                	p=r.exec(sx);
									m12.setText("* "+sr+" is Opened...");
									m12.setBounds(0,175,500,25);			
									t.setText(" ");
                                                                }
                                                                catch(IOException t)
                                                                {
                                                                        System.out.println(e);
                                                                }
							}	
						});
			m20.setBounds(150,0,250,25);
			f1.add(t);
			f1.add(f1_1);
			f1.add(f1_3);
			f1.add(m1);
			f1.add(m2);
			f1.add(m12);
			f1.add(m20);
			f1.setSize(500,250);
			f1.setLayout(null);
			f1.setResizable(false);
			f1.setVisible(true);
		}
		else if(e.getSource()==b)
		{
			i=0;
			m3=new JLabel("Update Notes Here..!");
                        m3.setBounds(100,50,500,50);
                        m4=new JLabel("Enter Name of Notes and click Submit");
                        m4.setBounds(100,75,500,50);
                        f2=new JFrame("UPDATE");
                        f2_1=new JButton("GO BACK");
                        f2_1.setBounds(10,10,100,25);
			f2_1.addActionListener(new ActionListener()
                                                {
                                                        public void actionPerformed(ActionEvent e)
                                                        {
                                                                f2.dispose();
                                                        }
                                                });
                        t1=new JTextField();
                        t1.setBounds(100,125,190,25);
                        f2_3=new JButton("SUBMIT");
                        f2_3.setBounds(290,125,100,25);
			f2_4=new JButton("OK");
			f2_4.setBounds(300,225,80,25);
                        f2_3.addActionListener(new ActionListener()
                                                {
                                                        public void actionPerformed(ActionEvent e1)
                                                        {
                                                                sr="/home/gtk678/Java_Projects/Mini_Project/Notes/"+t1.getText();
                                                                try
								{
                                                               		sx="leafpad "+sr;
                                                                	p=r.exec(sx);
									m13.setText("* "+sr+" is Opened");
									m13.setBounds(0,650,500,25);
									t1.setText(" ");
                                                                }
                                                                catch(IOException t)
                                                                {
                                                                        System.out.println(e);
                                                                }

                                                        }
                                                });
			l1=new DefaultListModel<>();
			s1=new String("/home/gtk678/Java_Projects/Mini_Project/Notes/");
			main=new File(s1);
			if(main.exists() && main.isDirectory())
			{
				arr=main.listFiles();
				while(i!=arr.length)
				{
					if(arr[i].isFile())
					{
						s=arr[i].getName();
						l1.addElement(s);					
					}		
					i++;
				}
			}
			m6=new JLabel("Here the list of notes..!");
			m5=new JLabel("Select the Notes and click OK");
			m5.setBounds(100,190,300,25);
			m6.setBounds(100,170,200,25);
			f2_4.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								if(l.getSelectedIndex()!=-1)
								{
									s3=l.getSelectedValue();
									t1.setText(s3);
								}
							}
						});
			l=new JList<>(l1);
			l.setBounds(100,225,200,400);
			f2.add(l);
			f2.add(m6);
			f2.add(m5);
			f2.add(m3);
			f2.add(m4);
			f2.add(m13);
			f2.add(t1);
                        f2.add(f2_1);
                        f2.add(f2_3);
			f2.add(f2_4);
                        f2.setSize(500,1000);
                        f2.setLayout(null);
			f2.setResizable(false);
                        f2.setVisible(true);
		}
		else if(e.getSource()==c)
                {
			i=0;
                        f3=new JFrame("GET");
			l2=new DefaultListModel<>();
                        s4=new String("/home/gtk678/Java_Projects/Mini_Project/Notes/");
                        main1=new File(s4);
                        if(main1.exists() && main1.isDirectory())
                        {
                                arr1=main1.listFiles();
                       		while(i!=arr1.length)
                                {
                                	if(arr1[i].isFile())
                                	{
                                		s5=arr1[i].getName();
                                		l2.addElement(s5);
                                	}
                               		i++;
                                }
                        }
                        m7=new JLabel("Here the list of notes..!");
                        m7.setBounds(100,50,200,25);
                        l5=new JList<>(l2);
                        l5.setBounds(100,75,200,600);
			f3_1=new JButton("GO BACK");
                        f3_1.setBounds(10,10,100,25);
                        f3_1.addActionListener(new ActionListener()
                                                {
                                                        public void actionPerformed(ActionEvent e)
                                                        {
                                                                f3.dispose();
                                                        }
                                                });

                        f3.add(l5);
			f3.add(f3_1);
                        f3.add(m7);
                        f3.setSize(500,1000);
                        f3.setLayout(null);
			f3.setResizable(false);
                        f3.setVisible(true);
                }
		else if(e.getSource()==d)
                {
			i=0;
                        m11=new JLabel("Delete Notes Here..!");
                        m11.setBounds(100,50,500,50);
                        m10=new JLabel("Enter Name of Notes and click Submit");
                        m10.setBounds(100,75,500,50);
                        f4=new JFrame("DELETE");
                        f4_1=new JButton("GO BACK");
                        f4_1.setBounds(10,10,100,25);
                        f4_1.addActionListener(new ActionListener()
                                                {
                                                        public void actionPerformed(ActionEvent e)
                                                        {
                                                                f4.dispose();
                                                        }
                                                });
                        t3=new JTextField();
                        t3.setBounds(100,125,190,25);
                        f4_3=new JButton("DELETE");
                        f4_3.setBounds(290,125,100,25);
                        f4_4=new JButton("OK");
                        f4_4.setBounds(300,225,80,25);
                        f4_3.addActionListener(new ActionListener()
                                                {
                                                        public void actionPerformed(ActionEvent e2)
                                                        {
                                                                sr="/home/gtk678/Java_Projects/Mini_Project/Notes/"+t3.getText();
                                                              	g=new File(sr);
								g.delete();
								t3.setText(" ");
								m14.setText("* "+sr+" is Deleted");
								m14.setBounds(0,650,500,25);
                                                        }
                                                });
                        l3=new DefaultListModel<>();
                        s9=new String("/home/gtk678/Java_Projects/Mini_Project/Notes/");
                        main2=new File(s9);
			if(main2.exists() && main2.isDirectory())
                        {
                                arr2=main2.listFiles();
                                {
                                        while(i!=arr2.length)
                                        {
                                                if(arr2[i].isFile())
                                                {
                                                        s8=arr2[i].getName();
                                                        l3.addElement(s8);
                                                }
                                                i++;
                                        }
                                }
                        }
                        m8=new JLabel("Here the list of notes..!");
                        m9=new JLabel("Select the Notes and click OK");
                        m9.setBounds(100,190,300,25);
                        m8.setBounds(100,170,200,25);
                        f4_4.addActionListener(new ActionListener()
                                                {
                                                        public void actionPerformed(ActionEvent e7)
                                                        {
                                                                if(l6.getSelectedIndex()!=-1)
                                                                {
                                                                        s7=l6.getSelectedValue();
                                                                        t3.setText(s7);
                                                                }
                                                        }
                                                });
                        l6=new JList<>(l3);
                        l6.setBounds(100,225,200,400);
                        f4.add(l6);
                        f4.add(m8);
                        f4.add(m9);
                        f4.add(m10);
			f4.add(m11);
			f4.add(m14);
                        f4.add(t3);
                        f4.add(f4_1);
                        f4.add(f4_3);
                        f4.add(f4_4);
			f4.setResizable(false);
                        f4.setSize(500,1000);
                        f4.setLayout(null);
                        f4.setVisible(true);
                }
		else if (e.getSource()==chat){

			 ChatBotMain.main(new String[] {});
		 	 	 
		}
	//	else if(e.getSource()==e)
                {  
       		       // public void windowClosing(WindowEvent e)
        		{  
        //	        	f.dispose();  
        	    				      
		      	}                 
                }

	}		
	public static void main(String[] args)
	{
		ProjectFinal p=new ProjectFinal();
	//	p.mProjectFinal();
	}
}
