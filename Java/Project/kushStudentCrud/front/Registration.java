package kush.front;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registration {

	private JFrame frame;
	private JTextField textName;
	private JTextField textMobile;
	private JTextField textCourse;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public void tableUpdate() {
		try {
			Connection con=DBUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("Select * from record ");
			ResultSet rs=ps.executeQuery();
			java.sql.ResultSetMetaData rsmd=rs.getMetaData();
			int col=rsmd.getColumnCount();
			DefaultTableModel dtm=(DefaultTableModel) table.getModel(); 
			dtm.setRowCount(0);
			while(rs.next()) {
				Vector<String> v=new Vector<String>();
				for(int i=0;i<col;i++) {
					v.add(rs.getString("Id"));
					v.add(rs.getString("Name"));
					v.add(rs.getString("Mobile"));
					v.add(rs.getString("Course"));	
				}
				dtm.addRow(v);
			}
			
		} 
		catch (SQLException e1) {e1.printStackTrace();}
	}
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
		tableUpdate();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Student CRUD");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 627, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentRegistration = new JLabel("Student Registration");
		lblStudentRegistration.setBackground(Color.GRAY);
		lblStudentRegistration.setFont(new Font("Candara Light", Font.BOLD | Font.ITALIC, 26));
		lblStudentRegistration.setBounds(164, 11, 267, 49);
		frame.getContentPane().add(lblStudentRegistration);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(30, 71, 231, 231);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(65, 21, 90, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 60, 48, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 99, 48, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Course");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 141, 48, 14);
		panel.add(lblNewLabel_3);
		
		textName = new JTextField();
		textName.setBounds(65, 59, 131, 20);
		panel.add(textName);
		textName.setColumns(10);
		
		textMobile = new JTextField();
		textMobile.setBounds(65, 98, 131, 20);
		panel.add(textMobile);
		textMobile.setColumns(10);
		
		textCourse = new JTextField();
		textCourse.setBounds(65, 140, 131, 20);
		panel.add(textCourse);
		textCourse.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String name=textName.getText();
				String mobile=textMobile.getText();
				String course=textCourse.getText();
				Connection con=DBUtil.getConnection();
				String query = "insert into record(Name,Mobile,Course) values(?,?,?)";
				try {
					PreparedStatement prepare=con.prepareStatement(query);
					prepare.setString(1, name);
					prepare.setString(2, mobile);
					prepare.setString(3, course);
					prepare.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added");
					tableUpdate();
					textName.setText("");
					textMobile.setText("");
					textCourse.setText("");
					textName.setFocusable(true);
					//System.out.println("Record Added..");
				} 
				catch (SQLException e1) {e1.printStackTrace();}
			}
			
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBounds(10, 184, 62, 23);
		panel.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm=(DefaultTableModel) table.getModel();
				int selectedRow=table.getSelectedRow();
				int id=Integer.parseInt((String) dtm.getValueAt(selectedRow, 0));// for update table
				// Text after Editing..
				String name=textName.getText();
				String mobile=textMobile.getText();
				String course=textCourse.getText();
				
				try {
					Connection con=DBUtil.getConnection();
					PreparedStatement ps=con.prepareStatement("update record set Name=?,Mobile=?,Course=? where id =?");
					ps.setString(1, name);
					ps.setString(2, mobile);
					ps.setString(3, course);
					ps.setInt(4, id);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null,"Update Succesfully..");
					tableUpdate();
					textName.setText("");
					textMobile.setText("");
					textCourse.setText("");
									
				} catch (SQLException e1) {e1.printStackTrace();}	
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEdit.setBounds(79, 184, 62, 23);
		panel.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				DefaultTableModel dtm=(DefaultTableModel) table.getModel();
				int seletedIndex=table.getSelectedRow();
				int id=Integer.parseInt(dtm.getValueAt(seletedIndex, 0).toString());
				int dialogeResult=JOptionPane.showConfirmDialog(null,"Do you want to delete record.","Warning",JOptionPane.YES_NO_CANCEL_OPTION);
				if(dialogeResult==JOptionPane.YES_OPTION) {
				Connection con=DBUtil.getConnection();
				PreparedStatement ps=con.prepareStatement("delete from record where id =?");
					ps.setInt(1,id);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null,"Row Deleted..!");
					tableUpdate();
				}
			} 
				catch (SQLException e1) {e1.printStackTrace();}	
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(146, 184, 75, 23);
		panel.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(312, 71, 267, 231);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel dtm=(DefaultTableModel) table.getModel();
				int selectedRow=table.getSelectedRow();
				
				textName.setText(dtm.getValueAt(selectedRow, 1).toString());
				textMobile.setText(dtm.getValueAt(selectedRow, 2).toString());
				textCourse.setText(dtm.getValueAt(selectedRow, 3).toString());
				
			}
		});
		
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		   
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Name", "Mobile", "Course"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, String.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBackground(new Color(255, 255, 255));
		
	}
}
