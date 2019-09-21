package kush.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

import javax.swing.*;

public class IpFinder extends JFrame {
	public IpFinder() {
		 JLabel l=new JLabel("Enter URL:");  
		    l.setBounds(50,70,150,20);;  
		   JTextField tf=new JTextField();  
		    tf.setBounds(50,100,200,20);  
		      
		    JButton b=new JButton("Find IP");  
		    b.setBounds(50,150,80,30);  
		    b.addActionListener(new ActionListener() {				
				public void actionPerformed(ActionEvent e) {
					String url=tf.getText();
					try {
						InetAddress net=InetAddress.getByName(url);
						String ip=net.getHostAddress();
						JOptionPane.showMessageDialog(IpFinder.this,ip);
					} catch (Exception e2) {
						System.out.println(e2.toString());
					}
				}
			}); 
		    add(l);  
		    add(tf);  
		    add(b); 
		    //Frame
		    setTitle("IP Finder..");
		    setSize(300,300); // framesize
		    setLocationRelativeTo(null); //generate frame in center.
		    setLayout(null);  
		    setVisible(true);
	}
	
	public static void main(String[] args) {
		new IpFinder();
	}
}
