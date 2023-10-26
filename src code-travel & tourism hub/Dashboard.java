package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    // Declaring Globally
    String username;
    JButton addPersonalDetails, viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage,viewpackage,viewhotels;
    JButton destinations,bookhotel,viewhotelbooking,payments,calculator,notepad,about,deletePersonalDetails;
    
    // Constructor for the Dashboard class
    Dashboard(String username){
        // Initialize the username
        this.username = username;

        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the frame to be maximized
        setLayout(null);
        
        // Create the top panel (p1) with a background color and title
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,101));
        p1.setBounds(0,0, 1600, 65);
        add(p1);
        
        // Add an icon to the top panel
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(75,75,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(2,-5,75,75);
        p1.add(icon);
        
        // Add the title to the top panel
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(90, 10, 300, 40);
	heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 30));
	p1.add(heading);
        
        // Create the side panel (p2) with buttons for various functionalities
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,40));
        p2.setBounds(0,65, 250, 900);
        add(p2);
        
        // Add button
        addPersonalDetails = new JButton("Add Your Details");
        addPersonalDetails.setBounds (0, 0, 250, 42);
        addPersonalDetails.setBackground (new Color (0, 0, 102));
        addPersonalDetails.setForeground (Color. WHITE);
        addPersonalDetails.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        addPersonalDetails.setMargin (new Insets (0, 0, 0, 80)); 
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        // Add button
        updatePersonalDetails = new JButton("Update Your Details");
        updatePersonalDetails.setBounds (0, 42, 250, 42);
        updatePersonalDetails.setBackground (new Color (0, 0, 102));
        updatePersonalDetails.setForeground (Color. WHITE);
        updatePersonalDetails.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        updatePersonalDetails.setMargin (new Insets (0, 0, 0, 55));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        // Add button
        viewPersonalDetails = new JButton("View Your Profile");
        viewPersonalDetails.setBounds (0, 84, 250, 42);
        viewPersonalDetails.setBackground (new Color (0, 0, 102));
        viewPersonalDetails.setForeground (Color. WHITE);
        viewPersonalDetails.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        viewPersonalDetails.setMargin (new Insets (0, 0, 0, 80));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        // Add button
        deletePersonalDetails = new JButton("Delete Your Account");
        deletePersonalDetails.setBounds (0, 126, 250, 42);
        deletePersonalDetails.setBackground (new Color (0, 0, 102));
        deletePersonalDetails.setForeground (Color. WHITE);
        deletePersonalDetails.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        deletePersonalDetails.setMargin (new Insets (0, 0, 0, 53));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        // Add button
        checkpackages = new JButton("View Packages");
        checkpackages.setBounds (0, 168, 250, 42);
        checkpackages.setBackground (new Color (0, 0, 102));
        checkpackages.setForeground (Color. WHITE);
        checkpackages.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        checkpackages.setMargin (new Insets (0, 0, 0, 100));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        // Add button
        bookpackage = new JButton("Book Package");
        bookpackage.setBounds (0, 210, 250, 42);
        bookpackage.setBackground (new Color (0, 0, 102));
        bookpackage.setForeground (Color. WHITE);
        bookpackage.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        bookpackage.setMargin (new Insets (0, 0, 0, 108));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        // Add button
        viewpackage = new JButton("View Booked Package");
        viewpackage.setBounds (0, 252, 250, 42);
        viewpackage.setBackground (new Color (0, 0, 102));
        viewpackage.setForeground (Color. WHITE);
        viewpackage.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        viewpackage.setMargin (new Insets (0, 0, 0, 45));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        // Add button
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds (0, 294, 250, 42);
        viewhotels.setBackground (new Color (0, 0, 102));
        viewhotels.setForeground (Color. WHITE);
        viewhotels.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        viewhotels.setMargin (new Insets (0, 0, 0, 120));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        // Add button
        bookhotel = new JButton("Book Hotels");
        bookhotel.setBounds (0, 336, 250, 42);
        bookhotel.setBackground (new Color (0, 0, 102));
        bookhotel.setForeground (Color. WHITE);
        bookhotel.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        bookhotel.setMargin (new Insets (0, 0, 0, 122));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        // Add button
        viewhotelbooking = new JButton("View Booked Hotel");
        viewhotelbooking.setBounds (0, 378, 250, 42);
        viewhotelbooking.setBackground (new Color (0, 0, 102));
        viewhotelbooking.setForeground (Color. WHITE);
        viewhotelbooking.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        viewhotelbooking.setMargin (new Insets (0, 0, 0, 65));
        viewhotelbooking.addActionListener(this);
        p2.add(viewhotelbooking);
        
        // Add button
        destinations = new JButton("Destinations");
        destinations.setBounds (0, 420, 250, 42);
        destinations.setBackground (new Color (0, 0, 102));
        destinations.setForeground (Color. WHITE);
        destinations.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        destinations.setMargin (new Insets (0, 0, 0, 120));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        // Add button
        payments = new JButton("Make Payment");
        payments.setBounds (0, 462, 250, 42);
        payments.setBackground (new Color (0, 0, 102));
        payments.setForeground (Color. WHITE);
        payments.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        payments.setMargin (new Insets (0, 0, 0, 102));
        payments.addActionListener(this);
        p2.add(payments);
        
        // Add button
        calculator = new JButton("Calculator");
        calculator.setBounds (0, 504, 250, 42);
        calculator.setBackground (new Color (0, 0, 102));
        calculator.setForeground (Color. WHITE);
        calculator.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        calculator.setMargin (new Insets (0, 0, 0, 137));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        // Add button
        notepad = new JButton("Note Book");
        notepad.setBounds (0, 546, 250, 42);
        notepad.setBackground (new Color (0, 0, 102));
        notepad.setForeground (Color. WHITE);
        notepad.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        notepad.setMargin (new Insets (0, 0, 0, 135));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        // Add button
        about = new JButton("About Us");
        about.setBounds (0, 588, 250, 42);
        about.setBackground (new Color (0, 0, 102));
        about.setForeground (Color. WHITE);
        about.setFont (new Font ("Tahoma", Font. PLAIN, 18));
        about.setMargin (new Insets (0, 0, 0, 145));
        about.addActionListener(this);
        p2.add(about);
        
        
        // Set up the main content area with a background image and title
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel (i6);
        image.setBounds (100, 50, 1200, 800);
        add (image);
        
        JLabel text = new JLabel ("Travel and Tourism Management System");
        text.setBounds(175, 50, 1200, 70);
        text.setForeground(Color.WHITE) ;
        text.setFont (new Font("Raleway", Font.BOLD, 50));
        image.add (text) ;

        
        setVisible(true);
    }
    
    // Handle button click events
    public void actionPerformed (ActionEvent ae) {
           if (ae.getSource() == addPersonalDetails) {
                new AddCustomer(username);
            }else if (ae.getSource() == viewPersonalDetails){
                new ViewCustomer(username);
            }else if (ae.getSource() == updatePersonalDetails){
                new UpdateCustomer(username);
            }else if (ae.getSource() == checkpackages){
                new CheckPackage();
            }else if (ae.getSource()== bookpackage){
                new BookPackage(username);
            }else if (ae.getSource() == viewpackage) {
                new ViewBookedPackage(username);
            }else if (ae.getSource()  == viewhotels){
                new CheckHotels();
            }else if (ae.getSource() == destinations){
                new Destinations();
            }else if (ae.getSource() == bookhotel){
                new BookHotel(username);
            }else if (ae.getSource() == viewhotelbooking){
                new ViewBookedHotel(username);
            }else if (ae.getSource() == payments){
                new Payment();
            }else if (ae.getSource() == calculator) {
                try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else if (ae.getSource() == notepad) {
                try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else if (ae.getSource() == about){
                new AboutUs();
            }else if (ae.getSource() == deletePersonalDetails){
                new DeleteCustomerDetails(username);
            }

    }
    
    // Main method to create an instance
    public static void main (String[] args){
        new Dashboard("");
    }
}

