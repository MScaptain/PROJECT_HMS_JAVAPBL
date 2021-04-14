/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel HotelManagementSystem = new JLabel("THE BLACK PEARL WELCOMES YOU");
	HotelManagementSystem.setForeground(Color.black);
        HotelManagementSystem.setFont(new Font("Algerian", Font.PLAIN, 46));
	HotelManagementSystem.setBounds(440, 60, 1000, 50);
	NewLabel.add(HotelManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu HotelSystem = new JMenu("HOTEL MANAGEMENT");
        HotelSystem.setForeground(Color.BLUE);
	menuBar.add(HotelSystem);
		
        JMenuItem HotelDetails = new JMenuItem("RECEPTION");
	HotelSystem.add(HotelDetails);
		
	JMenu HotelSystemHello = new JMenu("ADMIN");
        HotelSystemHello.setForeground(Color.RED);
	menuBar.add(HotelSystemHello);
        
        JMenuItem HotelDetailshello1 = new JMenuItem("ADD EMPLOYEE");
	HotelSystemHello.add(HotelDetailshello1);
        
        HotelDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                  new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem HotelDetailshello2 = new JMenuItem("ADD ROOMS");
	HotelSystemHello.add(HotelDetailshello2);
        
        HotelDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                  new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	HotelDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              new Reception();
            }
	});
        
        
        JMenuItem HotelDetailshello3 = new JMenuItem("ADD DRIVERS");
	HotelSystemHello.add(HotelDetailshello3);
        
	HotelDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                 new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
