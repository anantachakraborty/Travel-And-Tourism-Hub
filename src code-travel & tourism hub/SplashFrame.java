package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class SplashFrame extends JFrame implements Runnable {
    Thread thread;

    // Constructor for the Splash class
    SplashFrame() {
        // Create a splash screen with an image
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        // Make the splash screen visible
        setVisible(true);

        // Start a new thread for the splash screen animation
        thread = new Thread(this);
        thread.start();
    }

    // The run method is executed when the thread starts
    public void run() {
        try {
            // Pause the splash screen for 5 seconds (5000 milliseconds)
            Thread.sleep(5000);

            // Close the splash screen by setting it to invisible
            setVisible(false);
            // Now Continue With Login page
            new Login();
            
        } catch (Exception e) {
            // Handle any exceptions that may occur during thread execution
        }
    }

    // The main method where the program starts execution
    public static void main(String[] args) {
        // Create a new instance of the Splash class
        SplashFrame frame = new SplashFrame();

        // Animation loop to change the size and location of the splash screen
        int x = 1;
        for (int i = 1; i <= 500; x += 7, i += 6) {
            // Animate the splash screen by changing its location and size
            frame.setLocation(635 - (x + i) / 2, 325 - (i / 2));
            frame.setSize(x + i, i + 50);

            try {
                // Pause briefly to create an animation effect
                Thread.sleep(10);
            } catch (Exception e) {
                // Handle any exceptions that may occur during animation
            }
        }
    }
}