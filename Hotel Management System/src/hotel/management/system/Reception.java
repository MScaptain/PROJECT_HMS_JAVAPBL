/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import javax.swing.*;

import java.sql.*;	
import java.awt.event.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reception extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		new Reception();
	}
	
	public Reception(){
		setTitle("RECEPTION");
                setBounds(400, 200, 850, 570);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fourth.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(250,30,500,470);
                add(l1);
		
		JButton btnNewCustomerForm = new JButton("New Customer Form");
		btnNewCustomerForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				NewCustomer frame = new NewCustomer();
					frame.setVisible(true);
                                setVisible(false);
			}catch(Exception e1){
				e1.printStackTrace();
			}
			}
		});
		btnNewCustomerForm.setBounds(10, 30, 200, 30);
                btnNewCustomerForm.setBackground(Color.BLACK);
                btnNewCustomerForm.setForeground(Color.WHITE);
		contentPane.add(btnNewCustomerForm);
		
		JButton btnNewButton = new JButton("Room");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Room frame = new Room();
					frame.setVisible(true);
				
                                setVisible(false);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(10, 70, 200, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);

		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Department");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Department frame = new Department();
					frame.setVisible(true);
					
					setVisible(false);
					
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton_1.setBounds(10, 110, 200, 30);
                btnNewButton_1.setBackground(Color.BLACK);
                btnNewButton_1.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("All Employee Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
					Employee frame = new Employee();
					frame.setVisible(true);
					
					setVisible(false);
					
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton_2.setBounds(10, 150, 200, 30);                
                btnNewButton_2.setBackground(Color.BLACK);
                btnNewButton_2.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Customer Info");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					CustomerInfo frame = new CustomerInfo();
					frame.setVisible(true);
									
					setVisible(false);
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(10, 190, 200, 30);
                btnNewButton_3.setBackground(Color.BLACK);
                btnNewButton_3.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_3);
		
		JButton btnManagerInfo = new JButton("Manager Info");
		btnManagerInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				ManagerInfo frame = new ManagerInfo();
					frame.setVisible(true);
				
                                setVisible(false);
				}
				catch (Exception e1){
					e1.printStackTrace();
				}
			}
		});
		btnManagerInfo.setBounds(10, 230, 200, 30);
                btnManagerInfo.setBackground(Color.BLACK);
                btnManagerInfo.setForeground(Color.WHITE);

		contentPane.add(btnManagerInfo);
		
		JButton btnNewButton_4 = new JButton("Check Out");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            try {
                                CheckOut frame = new CheckOut();
                                frame.setVisible(true);
                                setVisible(false); // TODO Auto-generated catch block
                            } catch (SQLException ex) {
                                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
		});
		btnNewButton_4.setBounds(10, 270, 200, 30);
                btnNewButton_4.setBackground(Color.BLACK);
                btnNewButton_4.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Update Check Status");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				UpdateCheck frame = new UpdateCheck();
					frame.setVisible(true);
			
                                setVisible(false);
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setBounds(10, 310, 200, 30);
                btnNewButton_5.setBackground(Color.BLACK);
                btnNewButton_5.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Update Room Status");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					UpdateRoom frame = new UpdateRoom();
					frame.setVisible(true);
				
                                        setVisible(false);
				}catch(Exception s)
				{
					s.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBounds(10, 350, 200, 30);
                btnNewButton_6.setBackground(Color.BLACK);
                btnNewButton_6.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_6);
		
		JButton btnPickUpSerice = new JButton("Pick up Service");
		btnPickUpSerice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				PickUp frame = new PickUp();
					frame.setVisible(true);
				
                                setVisible(false);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		btnPickUpSerice.setBounds(10, 390, 200, 30);
                btnPickUpSerice.setBackground(Color.BLACK);
                btnPickUpSerice.setForeground(Color.WHITE);

		contentPane.add(btnPickUpSerice);
		
		JButton btnSearchRoom = new JButton("Search Room");
		btnSearchRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				SearchRoom search = new SearchRoom();
				search.setVisible(true);
                                setVisible(false);
				}
				catch (Exception ss){
					ss.printStackTrace();
				}
			}
		});
		btnSearchRoom.setBounds(10, 430, 200, 30);
                btnSearchRoom.setBackground(Color.BLACK);
                btnSearchRoom.setForeground(Color.WHITE);

		contentPane.add(btnSearchRoom);

		JButton btnNewButton_7 = new JButton("Log Out");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
                                    new Login().setVisible(true);
                                    setVisible(false);
                                    
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_7.setBounds(10, 470, 200, 30);
                btnNewButton_7.setBackground(Color.BLACK);
                btnNewButton_7.setForeground(Color.WHITE);

		contentPane.add(btnNewButton_7);
                getContentPane().setBackground(Color.WHITE);
                
                setVisible(true);
	}
}
