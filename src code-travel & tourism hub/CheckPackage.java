package travel.management.system;

import javax.swing.*;
import java.awt.*;


public class CheckPackage extends JFrame{
    
    // Constructor for the CheckPackage class
    CheckPackage(){
        
        setBounds(200, 60, 900, 600);
        getContentPane().setBackground(Color.WHITE);
        
        // Define package details as string arrays
        String[] package1 = new String[]{"GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only","package1.jpg"};
        String[] package2 = new String[]{"SILVER PACKAGE","4 days and 3 Nights", "Toll & Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only","package2.jpg"};
        String[] package3 = new String[]{"BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only","package3.jpg"};
        
        // Create a tabbed pane to display packages
        JTabbedPane tab = new JTabbedPane();
      
        // Create panels for each package
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);

        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);

        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);
        
        add(tab);
        

        setVisible(true);
        
        
    }
    // Create a panel to display package details
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);  
        p1.setBackground(Color.WHITE);
        
        // Create and add labels with package details
        JLabel label1 = new JLabel(pack[0]);
        label1.setBounds(50, 5, 300, 30);
        label1.setForeground(Color.ORANGE);
        label1.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(label1); // Add the label to the panel (pl)

        JLabel label2 = new JLabel(pack[1]);
        label2.setBounds(30, 60, 300, 30);
        label2.setForeground(Color.RED);
        label2.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(label2);
        
        JLabel label3 = new JLabel(pack[2]);
        label3.setBounds(30, 110, 300, 30);
        label3.setForeground(Color.BLUE);
        label3.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(label3);

        JLabel label4 = new JLabel(pack[3]);
        label4.setBounds(30, 160, 300, 30);
        label4.setForeground(Color.DARK_GRAY);
        label4.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(label4);
        
        JLabel label5 = new JLabel(pack[4]);
        label5.setBounds(30, 210, 300, 30);
        label5.setForeground(Color.MAGENTA);
        label5.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(label5);
        
        JLabel label6 = new JLabel(pack[5]);
        label6.setBounds(30, 260, 300, 30);
        label6.setForeground(Color.RED);
        label6.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(label6);

        JLabel label7 = new JLabel(pack[6]);
        label7.setBounds(30, 310, 300, 30);
        label7.setForeground(Color.GREEN);
        label7.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(label7);
        
        JLabel label8 = new JLabel(pack[7]);
        label8.setBounds(30, 360, 300, 30);
        label8.setForeground(Color.RED);
        label8.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(label8);

        JLabel label9 = new JLabel(pack[8]);
        label9.setBounds(60, 430, 300, 30);
        label9.setForeground(Color.RED);
        label9.setFont(new Font("Tahoma", Font.BOLD, 29));
        p1.add(label9);
        
        JLabel label10 = new JLabel(pack[9]);
        label10.setBounds(80, 480, 300, 30);
        label10.setForeground(Color.MAGENTA);
        label10.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(label10);
        
        JLabel label11 = new JLabel(pack[10]);
        label11.setBounds(500, 420, 300, 30);
        label11.setForeground(Color.CYAN);
        label11.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(label11);

        // Load and display the package image
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));

        Image image = icon.getImage().getScaledInstance(530, 330, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);

        JLabel label12 = new JLabel(scaledIcon);
        label12.setBounds(330, 50, 530, 330);
        p1.add(label12);
        
        return p1;
    }
    
    // Main method to create an instance of CheckPackage
    public static void main(String[] args) {
        new CheckPackage();
    }
    
}
