package PersonalAssistant;
import java.awt.Adjustable;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class ChatBotMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JButton btnSend;
	private String main="";
	JTextArea textArea;
	private JScrollBar scrollBar;
	Runtime r=Runtime.getRuntime();
	Process p=null;
	public static void main(String[] args) {
			try {
				ChatBotMain frame = new ChatBotMain();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public ChatBotMain() {
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField_1.setBounds(0, 555, 338, 60);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					action();
				}
			}
			
		});
		textField_1.setColumns(10);
		btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action();
			}
		});
		btnSend.setBounds(341, 555, 75, 59);
		textArea = new JTextArea();
		textArea.setSize(100,100);
		textArea.setBounds(50,100,100,100);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textArea.append("Im Your Personal Assistant\n");
		add(textField_1);
		add(btnSend);
		add(textArea);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(450,50, 428, 657);
	}
	
	void action()
	{
		
		String query=textField_1.getText();
		textArea.append(" You-> "+query+"\n");
		//query.trim();
		query=query.toLowerCase();
		if(query.contains("clear screen")||query.contains("clr")||query.contains("cls"))
		{
			textArea.setText("");
			textField_1.setText("");
		}
		else if(query.contains("hi")||query.contains("hey")||query.contains("hola")||query.contains("hello")||query.contains("hallo"))
		{
			Random rand=new Random();
			int a=rand.nextInt(4);
			if(a==0)
			{
				ai("Hey,Boss");
			}
			else if(a==1)
			{
				ai("Hey,Whatsup Boss ?");
			}
			else if(a==2)
			{
				ai("Hey,What can i do for you Boss ?");
			}
			else if(a==3)
			{
				ai("Hello,are u there Boss ?");
			}
			else if(a==4)
			{
				ai("Hello Boss,How are you ?");
			}
			
		}
		else if(query.contains("fine")||query.contains("I'm fine")||query.contains("am okay"))
		{
			Random rand=new Random();
			int a=rand.nextInt(4);
			if(a==0)
			{
				ai("It's good to know that you are fine");
			}
			else if(a==1)
			{
				ai("It's pleasure to know that you are fine");
			}
			else if(a==2)
			{
				ai("Oh,great");
			}
			else if(a==3)
			{
				ai("Oh,such a great news");
			}
			else if(a==4)
			{
				ai("Wish,you always remain fine");
			}
		}
		else if(query.contains("no babe")||query.contains("no darling")||query.contains("no")||query.contains("no dude"))
		{
			ai("Why Boss");
		}
		else if(query.contains("feel bore")||query.contains("lets leave")||query.contains("lets")||query.contains("leave"))
		{
			ai("Ok Boss,Lets start boom boom");
		}
		else if(query.contains("wssup")||query.contains("whats up")||query.contains("whatsup")||query.contains("wtsup")
				||query.contains("you doing")||query.contains("u doing")||query.contains("how are")||query.contains("u")||query.contains("you"))
		{
				ai("I'm fine and what about you");
		}
		else if(query.contains("yes")||query.contains("yeah")||query.contains("ya"))
		{
			Random rand=new Random();
			int a=rand.nextInt(2);
			if(a==0)
			{
				ai("Oh, Great");
			}
			else if(a==1)
			{
				ai("Ohh,Great news");
			}
			else if(a==2)
			{
				ai("Nice");
			}
		}
		else if(query.contains("ntnhng")||query.contains("nothing")||query.contains("ntng"))
		{
			Random rand=new Random();
			int a=rand.nextInt(2);
			if(a==0)
			{
				ai("Why?");
			}
			else if(a==1)
			{
				ai("Why? as per I know you are a very charming person");
			}
			else if(a==2)
			{
				ai("Why? Don't waste your time this way");
			}
		}
		else if(query.contains("leafpad")||query.contains("lfpad")||query.contains("open leafpad"))
		{	
			try{
				ai("Ok dude,Opening the Notes");
				String s2="leafpad ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("files")||query.contains("file")||query.contains("my computer"))
		{
			try{
				ai("Ok dude,Opening the Files");
				String s2="io.elementary.files ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("browser")||query.contains("internet")||query.contains("open internet")||query.contains("open browser"))
		{
			try{
				ai("Ok dude,Opening the Chromium Browser");
				String s2="chromium-browser ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("calci")||query.contains("calculator")||query.contains("calculater")||query.contains("calculatar"))
		{
			try{
				ai("Ok dude,Opening Calculator");
				String s2="io.elementary.calculator ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("libre")||query.contains("liber")||query.contains("libre office")||query.contains("office"))
		{
			try{
				ai("Ok dude,Opening Office");
				String s2="libreoffice ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("netbeans")||query.contains("ide")||query.contains("beans")||query.contains("java"))
		{
			try{
				ai("Ok dude,Opening Netbeans");
				String s2="/usr/bin/netbeans ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("firefox")||query.contains("fox")||query.contains("fire"))
		{
			try{
				ai("Ok dude,Opening Firefox");
				String s2="firefox ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("calender")||query.contains("clndr")||query.contains("calender"))
		{
			try{
				ai("Ok dude,Opening Calendar");
				String s2="io.elementary.calendar ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("appcenter")||query.contains("play")||query.contains("playstore")||query.contains("store"))
		{
			try{
				ai("Ok dude,Opening Play Store");
				String s2="io.elementary.appcenter ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("camera")||query.contains("camara")||query.contains("cam")||query.contains("camra"))	
		{
			try{
				ai("Ok dude,Opening Camera");
				String s2="io.elementary.camera ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}	
		else if(query.contains("vim")||query.contains("code editor")||query.contains("editor")||query.contains("code"))		
		{
			try{
				ai("Ok dude,Opening Code Editor");
				String s2="io.elementary.code ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("photos")||query.contains("gallery")||query.contains("gallary")||query.contains("galry"))
		{
			try{
				ai("Ok dude,Opening Photos");
				String s2="io.elementary.photos ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("terminal")||query.contains("command")||query.contains("cmd"))
		{
			try{
				ai("Ok dude,Opening Terminal");
				String s2="io.elementary.terminal ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("python")||query.contains("jupyter")||query.contains("jnotebook"))
		{
			try{
				ai("Ok dude,Opening Jupyter Notebook");
				String s2="jupyter-notebook ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else if(query.contains("mini")||query.contains("mini project")||query.contains("ediary")||query.contains("e-diary"))
		{
			try{
				ai("Ok dude,Opening Terminal");
				String s2="cd ";
				p=r.exec(s2);
				s2="java LoginPage ";
				p=r.exec(s2);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else{
			Random rand=new Random();
			int a=rand.nextInt(4);
			if(a==0)
			{
				ai("Sorry,I'cant get you");
			}
			else if(a==1)
			{
				ai("Plase say it correctly");
			}
			else if(a==2)
			{
				ai("Please rephrase that");
			}
			else if(a==3)
			{
				ai("???");
			}
		}
	}
	

	void ai(String s)
	{
		textArea.append(" AI->"+s+"\n\n");
		textField_1.setText("");
	}
}
