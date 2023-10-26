package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class LoadingFrame extends JFrame implements Runnable {
// Declaring Globally    
Thread t;
JProgressBar bar; 
String username;

// Implementation of the run method (from the Runnable interface)
public void run () {
      try {
            for (int i = 1; i <= 101; i++) {
                  int max = bar.getMaximum (); 
                  int value = bar.getValue ();
                  
                    if (value < max) { 
                    bar.setValue (bar.getValue() + 1);
                    } else {
                    setVisible (false);
                     new Dashboard(username);
                    }
                Thread.sleep(30);
            }
        } catch (Exception e) {
            e.printStackTrace ();
            }
    }
    
    
    LoadingFrame(String username) {
        // Initialize the username
        this.username = username;
        // Create a new thread for the progress bar
        t = new Thread(this);
        
        setBounds(300, 175, 650, 400);
        getContentPane ().setBackground (Color. WHITE);
        setLayout (null);
        
        // Create and configure a label for displaying text
        JLabel text = new JLabel("Your Travel Companion");
        text.setBounds (120, 20, 600, 40);
        text.setForeground (Color.BLUE) ;
        text.setFont (new Font ("Raleway", Font. BOLD, 35));
        add (text) ;
        
        // Create and configure a progress bar
        bar = new JProgressBar ();
        bar.setBounds (150, 100, 300, 35);
        bar.setStringPainted (true);
        add (bar);
        
        // Create and configure a label for displaying a waiting message
        JLabel wait = new JLabel("Loading, Please Wait...");
        wait.setBounds (230, 130, 175, 30);
        wait.setForeground (Color.RED) ;
        wait.setFont (new Font ("Raleway", Font. BOLD, 16));
        add (wait) ;
        
        // Create and configure a label to welcome the user
        JLabel lblusername = new JLabel("Welcome " + username);
        lblusername.setBounds (20, 310, 400, 40);
        lblusername.setForeground (Color.RED) ;
        lblusername.setFont (new Font ("Raleway", Font. BOLD, 16));
        add (lblusername) ;
        
        // Start the progress bar thread
        t.start();
        setVisible(true);
    }
    // The main method to run the application
    public static void main (String[] args) {
      new LoadingFrame ("");
    }
}
