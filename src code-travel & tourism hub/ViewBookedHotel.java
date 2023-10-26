package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewBookedHotel  extends JFrame implements ActionListener{
    // Declaring Globally
    JButton back;
    // Constructor for the View Booked Hotel class
    ViewBookedHotel(String username){
       
        setBounds (220, 110, 850, 550);
        setLayout (null);
        getContentPane().setBackground(Color.WHITE);
        
        // Create labels to display booked hotel details
        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setBounds(60, 10, 350, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);
        
       
        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(30, 60, 150, 25);
        add(lblusername);

        JLabel Labelusername = new JLabel(); 
        Labelusername.setBounds(220, 60, 150, 25); 
        add(Labelusername); 
        
        
        JLabel lblpackage = new JLabel("Hotel Name:");
        lblpackage.setBounds(30, 100, 150, 25);
        add(lblpackage);

        JLabel Labelpackage = new JLabel(); 
        Labelpackage.setBounds(220, 100, 150, 25); 
        add(Labelpackage); 
       
        
        JLabel lblperson = new JLabel("Total Person:");
        lblperson.setBounds(30, 140, 150, 25);
        add(lblperson);

        JLabel Labelperson = new JLabel(); 
        Labelperson.setBounds(220, 140, 150, 25); 
        add(Labelperson); 
        
        
        JLabel lbldays = new JLabel("Total Days:");
        lbldays.setBounds(30, 180, 150, 25);
        add(lbldays);

        JLabel Labeldays = new JLabel(); 
        Labeldays.setBounds(220, 180, 150, 25); 
        add(Labeldays); 
        
        
        JLabel lblac = new JLabel("AC/Non-AC:");
        lblac.setBounds(30, 210, 150, 25);
        add(lblac);

        JLabel Labelac = new JLabel(); 
        Labelac.setBounds(220, 210, 150, 25);
        add(Labelac);
        
        
        JLabel lblfood = new JLabel("Food Included:");
        lblfood.setBounds(30, 250, 150, 25);
        add(lblfood);

        JLabel Labelfood = new JLabel(); 
        Labelfood.setBounds(220, 250, 150, 25); 
        add(Labelfood); 
        
        
        JLabel lblid = new JLabel("Id:");
        lblid.setBounds(30, 290, 150, 25);
        add(lblid);

        JLabel Labelid = new JLabel(); 
        Labelid.setBounds(220, 290, 150, 25); 
        add(Labelid); 
        
        
        JLabel lblnumber = new JLabel("Number:");
        lblnumber.setBounds(30, 330, 150, 25);
        add(lblnumber);

        JLabel Labelnumber = new JLabel(); 
        Labelnumber.setBounds(220, 330, 150, 25); 
        add(Labelnumber); 
        
        
        JLabel lblphone = new JLabel("Phone:");
        lblphone.setBounds(30, 370, 150, 25);
        add(lblphone);

        JLabel Labelphone = new JLabel();
        Labelphone.setBounds(220, 370, 150, 25); 
        add(Labelphone); 
  
        
        
        JLabel lblprice = new JLabel("Total Cost:");
        lblprice.setBounds(30, 410, 150, 25);
        add(lblprice);

        JLabel Labelprice = new JLabel(); 
        Labelprice.setBounds(220, 410, 150, 25); 
        add(Labelprice); 
                     
        // Add Back Button      
        back = new JButton("Back");
        back.setBackground (Color. BLACK) ;
        back.setForeground (Color.WHITE) ;
        back.setBounds (370, 450, 70,20);
        back.addActionListener(this);
        add (back);
        
        // Create an image icon and add it to the frame
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = il.getImage() .getScaledInstance(450, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds (400, 40, 400, 300);
        add (image) ;
        
        
        try {// Create a database connection
            DBConn c = new DBConn();  
            ResultSet rs = c.s.executeQuery("SELECT * FROM bookhotel WHERE username = '" + username + "'");
            if (rs.next()) {
        // Retrieve data from the ResultSet and set it to the corresponding JLabels
                Labelusername.setText(rs.getString("username"));
                Labelid.setText(rs.getString("id"));
                Labelnumber.setText(rs.getString("number"));
                Labelpackage.setText(rs.getString("name"));
                Labelprice.setText(rs.getString("price"));
                Labelphone.setText(rs.getString("phone"));
                Labelperson.setText(rs.getString("persons"));
                Labelfood.setText(rs.getString("food"));
                Labelac.setText(rs.getString("ac"));
                Labeldays.setText(rs.getString("days"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
        setVisible(true);
    }
    
    // Action performed functionality
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
       
    
    // The main method that initializes and shows the frame
    public static void main (String[] args){
        new ViewBookedHotel("username");
    }
}
