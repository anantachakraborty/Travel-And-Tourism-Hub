package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewBookedPackage  extends JFrame implements ActionListener{
    // Declaring Globally
    JButton back;
    
    // Constructor for initializing and setting up the window
    ViewBookedPackage(String username){
       
        setBounds (220, 110, 850, 450);
        setLayout (null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("VIEW BOOKED PACKAGES");
        text.setBounds(150, 10, 350, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);
        
        // Username label and corresponding data
        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(30, 60, 150, 25);
        add(lblusername);

        JLabel Labelusername = new JLabel(); 
        Labelusername.setBounds(220, 60, 150, 25); 
        add(Labelusername); 
       
        // Other labels and corresponding data
        JLabel lblperson = new JLabel("Person:");
        lblperson.setBounds(30, 100, 150, 25);
        add(lblperson);

        JLabel Labelperson = new JLabel(); 
        Labelperson.setBounds(220, 100, 150, 25); 
        add(Labelperson); 
        
        
        JLabel lblid = new JLabel("Id:");
        lblid.setBounds(30, 140, 150, 25);
        add(lblid);

        JLabel Labelid = new JLabel(); 
        Labelid.setBounds(220, 140, 150, 25); 
        add(Labelid); 
        
        
        JLabel lblnumber = new JLabel("Number:");
        lblnumber.setBounds(30, 180, 150, 25);
        add(lblnumber);

        JLabel Labelnumber = new JLabel(); 
        Labelnumber.setBounds(220, 180, 150, 25); 
        add(Labelnumber); 
        
        
        JLabel lblphone = new JLabel("Phone:");
        lblphone.setBounds(30, 220, 150, 25);
        add(lblphone);

        JLabel Labelphone = new JLabel(); 
        Labelphone.setBounds(220, 220, 150, 25); 
        add(Labelphone); 

        
        JLabel lblpackage = new JLabel("Package:");
        lblpackage.setBounds(30, 260, 150, 25);
        add(lblpackage);

        JLabel Labelpackage = new JLabel(); 
        Labelpackage.setBounds(220, 260, 150, 25); 
        add(Labelpackage);
        
        
        JLabel lblprice = new JLabel("Price:");
        lblprice.setBounds(30, 300, 150, 25);
        add(lblprice);

        JLabel Labelprice = new JLabel(); 
        Labelprice.setBounds(220, 300, 150, 25); 
        add(Labelprice); 
                     
        // Back button      
        back = new JButton("Back");
        back.setBackground (Color. BLACK) ;
        back.setForeground (Color.WHITE) ;
        back.setBounds (370, 360, 70,20);
        back.addActionListener(this);
        add (back);
        
        // Load and display an image
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = il.getImage() .getScaledInstance(450, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds (400, 40, 400, 300);
        add (image) ;
        
        // Retrieve data from the database and populate the labels
        try {
            DBConn c = new DBConn();  
            ResultSet rs = c.s.executeQuery("SELECT * FROM bookpackage WHERE username = '" + username + "'");
            if (rs.next()) {
        
                Labelusername.setText(rs.getString("username"));
                Labelpackage.setText(rs.getString("package"));
                Labelid.setText(rs.getString("id"));
                Labelnumber.setText(rs.getString("number"));
                Labelperson.setText(rs.getString("person"));
                Labelphone.setText(rs.getString("phone"));
                Labelprice.setText(rs.getString("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    // ActionListener for handling the back button
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
       
    // Main method for testing the class    
    public static void main (String[] args){
        new ViewBookedPackage("username");
    }
}
