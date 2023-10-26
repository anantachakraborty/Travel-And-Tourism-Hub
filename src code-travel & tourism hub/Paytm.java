package travel.management.system;

import java.awt.event.*;
import javax.swing.*;


public class Paytm extends JFrame implements ActionListener{
    // Constructor for the Payment class
    Paytm(){
        setBounds (220, 75, 800, 600);
        // Create a JEditorPane for displaying web content
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        try {
            // Attempt to load the Paytm website
            pane.setPage("https://paytm.com/rent-payment");
        } catch (Exception e) {
            // If loading fails, display an error message
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404</html>");
        }
        
        // Add the JEditorPane to a JScrollPane for scrolling
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        setVisible(true);
        
        // Create a "Back" button for returning to the previous screen
        JButton back = new JButton("Back");
        back.setBounds(680, 50, 80, 40);
        back.addActionListener(this); 
        pane.add(back);
       
    }
    // Action performed when the "Back" button is clicked
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment();
    }
    
    // The main method that initializes and shows the frame
     public static void main(String[] args) {
        new Paytm();
    }
     
}
