package kush.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TicOpti extends JFrame implements ActionListener {
	static JButton b[]=new JButton[10];  
	static char ch[]=new char[10];
	static int fillNumber=0;
	boolean x=true;
	
	public void showButton(){ 
		int x=80,y=60,w=50,h=50,i;
		for(i=1;i<10;i++) {
		b[i]=new JButton();
		b[i].setBounds(x,y,w,h);
		add(b[i]);
		x+=70;
		if(i%3==0){
			y+=70;
			x=80;
		}
		b[i].addActionListener(this);  
		}
 }
	
	public static boolean checkWin() {
		if((ch[1]=='X' && ch[2]=='X' && ch[3]=='X')
			|| ch[1]=='0' && ch[2]=='0' && ch[3]=='0') {//1,2,3
			changeColor(1,2,3);
			return true;
		}
		if((ch[4]=='X' && ch[5]=='X' && ch[6]=='X')
				|| ch[4]=='0' && ch[5]=='0' && ch[6]=='0') {//4,5,6
			changeColor(4,5,6);
				return true;
		}
		if((ch[7]=='X' && ch[8]=='X' && ch[9]=='X')
				|| ch[7]=='0' && ch[8]=='0' && ch[9]=='0') {//7,8,9
			changeColor(7,8,9);	
			return true;
		}
		if((ch[2]=='X' && ch[5]=='X' && ch[8]=='X')
				|| ch[2]=='0' && ch[5]=='0' && ch[8]=='0') {//2,5,8
			changeColor(2,5,8);	
			return true;
		}
		if((ch[3]=='X' && ch[6]=='X' && ch[9]=='X')
				|| ch[3]=='0' && ch[6]=='0' && ch[9]=='0') {//3,6,9
			changeColor(3,6,9);	
			return true;
		}
		if((ch[1]=='X' && ch[5]=='X' && ch[9]=='X')
				|| ch[1]=='0' && ch[5]=='0' && ch[9]=='0') {//1,5,9
			changeColor(1,5,9);	
			return true;
		}
		if((ch[3]=='X' && ch[5]=='X' && ch[7]=='X')
				|| ch[3]=='0' && ch[5]=='0' && ch[7]=='0') {//3,5,7
			changeColor(3,5,7);	
			return true;
		}
		if((ch[1]=='X' && ch[4]=='X' && ch[7]=='X')
				|| ch[1]=='0' && ch[4]=='0' && ch[7]=='0') {//1,4,7
			changeColor(1,4,7);	
			return true;
		}
		
		return false;
	}
	
	public static void changeColor(int i, int j, int k) {
		b[i].setBackground(Color.red);
		b[j].setBackground(Color.red);
		b[k].setBackground(Color.red);
	}

	public static boolean checkDraw() {
		if(fillNumber==9)
			return true;
		return false;
	}
	
	public static void showDraw() {
		JOptionPane.showMessageDialog(null,"Match Draw..!");
		for(int i=1;i<10;i++)
			b[i].setEnabled(false);
	}
	
	public static void showWin(char win) {
		JOptionPane.showMessageDialog(null,win+" :Win the Game..");
		for(int i=1;i<10;i++)
			b[i].setEnabled(false);
	}
	
	public TicOpti() 
	{
	//For printing 9 button
	showButton();
	
	JButton reset=new JButton("PlayAgain");
	reset.setBounds(120, 280, 100, 30);
	reset.addActionListener(new ActionListener() {		
		public void actionPerformed(ActionEvent e) {
			 fillNumber=0;
		        x=true;
		    for(int i=0;i<10;i++)
		     ch[i]='1';
			dispose();
			new TicOpti();
		}
	});
	add(reset);
	//label
	JLabel lblTicToc = new JLabel("Tic-Toc");
	lblTicToc.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18));
	lblTicToc.setBounds(141, 20, 107, 25);
	add(lblTicToc);
	setLayout(null);
	
	setSize(380,400);
	setTitle("TicTocToe");
	setVisible(true);
	setLocationRelativeTo(null); //for printing frame in mid.
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public static void main(String[] args) {
		new TicOpti();
	}

	public void actionPerformed(ActionEvent e) {
		JButton btnPressed=(JButton) e.getSource(); //which button pressed.
		for(int i=1;i<10;i++) {
			if(btnPressed==b[i]) {
				if(x) {
					 b[i].setText("X");
					 b[i].setEnabled(false);
					 b[i].setBackground(Color.black);
					 ch[i]='X';
					 x=false;
					 fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('X');
					 } 
				}
				else {
					b[i].setText("0");
					b[i].setEnabled(false);
					ch[i]='0';
					b[i].setBackground(Color.black);
					x=true;
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('0');
					 } 
				}
			}
	}
}
}
