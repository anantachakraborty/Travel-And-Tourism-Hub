package travel.management.system;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class AboutUs extends JFrame implements ActionListener {
    AboutUs() {
        // Set the frame dimensions and properties
        setBounds(400, 100, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Create and configure the "ABOUT" label
        JLabel label = new JLabel("ABOUT");
        label.setBounds(200, 10, 100, 40);
        label.setForeground(Color.RED);
        label.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(label);

        // Create a multi-line text area to display project information
        String S = "About the Travel & Tourism Management System Project:\n\n"
                + "The Travel and Tourism Management System project aims to create an automated system "
                + "that streamlines and simplifies various travel-related processes and activities. "
                + "The primary objective is to design a comprehensive system that allows users to perform "
                + "all essential travel operations with ease and efficiency.\n\n"
                + "Key Features:\n"
                + "1. Access Travel Information: This application provides easy access to information about "
                + "different travel destinations.\n"
                + "2. Tour Tracking: Users can effortlessly track the details of their tours through the application.\n"
                + "3. Travel Agency Information: Obtain information about travel agencies and their services.\n\n"
                + "Advantages of the Project:\n"
                + "1. Accurate Information: The system ensures the accuracy of travel-related data.\n"
                + "2. Process Simplification: It simplifies manual work, reducing the need for extensive documentation.\n"
                + "3. Real-time Information: Provides up-to-date travel information.\n"
                + "4. User-Friendly Environment: Offers a user-friendly interface with warning messages.\n"
                + "5. Detailed Traveler Information: Allows for the provision of travelers' details.\n"
                + "6. Booking Confirmation Notifications: Sends booking confirmation notifications to users.\n";

        TextArea area = new TextArea(S, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);

        // Create a "Back" button and register it for action events
        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);

        // Make the frame visible
        setVisible(true);
    }

    // Define the actionPerformed method to handle button click events
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    // Entry point of the program
    public static void main(String[] args) {
        new AboutUs();
    }
}
