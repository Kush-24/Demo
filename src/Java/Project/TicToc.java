package kush.test;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicToc extends JFrame {
	private JPanel contentPane;
	static int fillNumber=0;
	boolean x=true;
	static char ch[]=new char[10];
	static JButton button_1,button_2, button_3, button_4
	 ,button_5,button_6, button_7,button_8, button_9;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicToc frame = new TicToc();
					frame.setVisible(true);
					for(int i=0;i<10;i++)
						ch[i]='i';
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		if(i==1 ||j==1 || k==1)
		button_1.setBackground(Color.red);
		if(i==2 ||j==2 || k==2)
			button_2.setBackground(Color.red);
		if(i==3 ||j==3 || k==3)
			button_3.setBackground(Color.red);
		if(i==4 ||j==4 || k==4)
			button_4.setBackground(Color.red);
		if(i==5 ||j==5 || k==5)
			button_5.setBackground(Color.red);
		if(i==6 ||j==7 || k==7)
			button_6.setBackground(Color.red);
		if(i==7 ||j==7|| k==7)
			button_7.setBackground(Color.red);
		if(i==8 ||j==8 || k==8)
			button_8.setBackground(Color.red);
		if(i==9 ||j==9 || k==9)
			button_9.setBackground(Color.red);
		
	}
	public static boolean checkDraw() {
		if(fillNumber==9)
			return true;
		return false;
	}
	public static void showDraw() {
		JOptionPane.showMessageDialog(null,"Match Draw..!");
	}
	public static void showWin(char win) {
		JOptionPane.showMessageDialog(null,win+" :Win the Game..");
	}
	public TicToc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Tic-Toc Game");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTicToc = new JLabel("Tic-Toc");
		lblTicToc.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 18));
		lblTicToc.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicToc.setBounds(141, 11, 107, 25);
		contentPane.add(lblTicToc);
		
		button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x) {
					 button_1.setText("X");
					 button_1.setEnabled(false);
					 button_1.setBackground(Color.black);
					 ch[1]='X';
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
					button_1.setText("0");
					button_1.setEnabled(false);
					ch[1]='0';
					button_1.setBackground(Color.black);
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
		});
		button_1.setBounds(103, 60, 55, 40);
		contentPane.add(button_1);
		
		button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(x) {
					button_4.setText("X");
					button_4.setEnabled(false);
					 ch[4]='X';
					 button_4.setBackground(Color.black);
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
					button_4.setText("0");
					button_4.setEnabled(false);
					 ch[4]='0';
					 button_4.setBackground(Color.black);
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
		});
		button_4.setBounds(103, 107, 55, 40);
		contentPane.add(button_4);
		
		button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(x) {
					button_7.setText("X");
					button_7.setEnabled(false);
					ch[7]='X';
					 button_7.setBackground(Color.black);
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
					button_7.setText("0");
					button_7.setEnabled(false);
					 button_7.setBackground(Color.black);
					x=true;
					ch[7]='0';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('0');
					 } 
				}
			}
		});
		button_7.setBounds(103, 158, 55, 40);
		contentPane.add(button_7);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(x) {
					button_2.setText("X");
					button_2.setEnabled(false);
					 button_2.setBackground(Color.black);
					x=false;
					ch[2]='X';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('X');
					 } 
					
				}
				else {
					button_2.setText("0");
					button_2.setEnabled(false);
					 button_2.setBackground(Color.black);
					x=true;
					ch[2]='0';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('0');
					 } 
				}
			}
		});
		button_2.setBounds(167, 60, 55, 40);
		contentPane.add(button_2);
		
		 button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(x) {
					button_3.setText("X");
					button_3.setEnabled(false);
					 button_3.setBackground(Color.black);
					x=false;
					ch[3]='X';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('X');
					 } 
				}
				else {
					button_3.setText("0");
					button_3.setEnabled(false);
					 button_3.setBackground(Color.black);
					x=true;
					ch[3]='0';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('0');
					 } 
				}
			}
		});
		button_3.setBounds(233, 60, 55, 40);
		contentPane.add(button_3);
		
		 button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(x) {
					button_5.setText("X");
					button_5.setEnabled(false);
					 button_5.setBackground(Color.black);
					x=false;
					ch[5]='X';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('X');
					 } 
				}
				else {
					button_5.setText("0");
					button_5.setEnabled(false);
					 button_5.setBackground(Color.black);
					x=true;
					ch[5]='0';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('0');
					 } 
				}
			}
		});
		button_5.setBounds(167, 107, 55, 40);
		contentPane.add(button_5);
		
		button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(x) {
					button_6.setText("X");
					button_6.setEnabled(false);
					 button_6.setBackground(Color.black);
					x=false;
					ch[6]='X';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('X');
					 } 
				}
				else {
					button_6.setText("0");
					button_6.setEnabled(false);
					 button_6.setBackground(Color.black);
					x=true;
					ch[6]='0';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('0');
					 } 
				}
			}
		});
		button_6.setBounds(233, 107, 55, 40);
		contentPane.add(button_6);
		
		button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(x) {
					button_8.setText("X");
					button_8.setEnabled(false);
					 button_8.setBackground(Color.black);
					x=false;
					ch[8]='X';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('X');
					 } 
				}
				else {
					button_8.setText("0");
					button_8.setEnabled(false);
					 button_8.setBackground(Color.black);
					x=true;
					ch[8]='0';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('0');
					 } 
				}
			}
		});
		button_8.setBounds(167, 158, 55, 40);
		contentPane.add(button_8);
		
		 button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(x) {
					button_9.setText("X");
					button_9.setEnabled(false);
					 button_9.setBackground(Color.black);
					x=false;
					ch[9]='X';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('X');
					 } 
				}
				else {
					button_9.setText("0");
					button_9.setEnabled(false);
					 button_9.setBackground(Color.black);
					x=true;
					ch[9]='0';
					fillNumber++;
					 if(checkDraw()) {
						 showDraw();
					 }
					 if(checkWin()) {
						 showWin('0');
					 } 
				}
			}
		});
		button_9.setBounds(233, 158, 55, 40);
		contentPane.add(button_9);
	}
}
