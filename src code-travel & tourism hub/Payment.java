package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    // Declaring Globally
    JButton pay, back;
    // Constructor for the Payment class 
    public Payment() {
        
        setBounds (220, 75, 800, 600);
        setLayout (null);
        getContentPane().setBackground(Color.WHITE);
        
        // Load the Paytm image and add it to the frame
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = il.getImage() .getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds (0, 0, 800, 600);
        add (image) ;
        
        // Create "Back" button for returning to the previous screen
        back = new JButton("Back");
        back.setBounds(210, 0, 80, 40);
        back.addActionListener(this);
        image.add(back);
        
        // Create "Pay" button for making a payment
        pay = new JButton("Pay");
        pay.setBounds(510, 0, 80, 40);
        pay.addActionListener(this);
        image.add(pay);     
        
        
        setVisible(true);
    }
    
    // Action performed when a button is clicked
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == pay){
            setVisible(false);
            new Paytm();
            
        }else{
            setVisible(false);
        }
        
    }
    
    // The main method that initializes and shows the frame
    public static void main(String[] args) {
        new Payment();
    }
}

