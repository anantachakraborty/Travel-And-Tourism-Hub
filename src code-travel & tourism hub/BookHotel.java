package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class BookHotel extends JFrame implements ActionListener{
    // Declaring Globally
    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice, bookhotel, back;
    
    // Constructor for the BookHotel class
    BookHotel(String username){
        // Initialize the username
        this.username = username;
        
        setBounds (150, 100, 1000, 600);
        setLayout (null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("BOOK HOTEL");
        text.setBounds(150, 10, 200, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);

        // Username label and field        
        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(40, 70, 100, 20);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblusername);

        labelusername = new JLabel(); // Create a new JLabel
        labelusername.setBounds(250, 70, 200, 20); // Set its bounds
        labelusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(labelusername); // Add it to the frame or container
        
        
        // Select Hotel label and choice
        JLabel lblhotel = new JLabel("Select Hotel");
        lblhotel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblhotel.setBounds(40, 110, 150, 20);
        add(lblhotel);

        chotel = new Choice();
        chotel.setBounds(250, 110, 200, 20);
        add(chotel);
        
        // Fetch hotel names from the database and add to the choice
        try {
            DBConn c = new DBConn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM hotel");
            while (rs.next()) {
            chotel.add(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

               
        // Total Persons label and field
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblpersons.setBounds(40, 150, 150, 25);
        add(lblpersons);

        tfpersons = new JTextField("1");
        tfpersons.setBounds(250, 150, 200, 25);
        add(tfpersons);
        
        
        // No. of Days label and field
        JLabel lbldays = new JLabel("No of Days");
        lbldays.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbldays.setBounds(40, 190, 150, 20);
        add(lbldays);

        tfdays = new JTextField("1");
        tfdays.setBounds(250, 190, 200, 25);
        add(tfdays);

                                
        // AC/Non-AC label and choice
        JLabel lblac = new JLabel("AC/Non-AC");
        lblac.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblac.setBounds(40, 230, 150, 25);
        add(lblac);
        
        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250, 230, 150, 25);
        add(cac);
        
               
        // Food Included label and choice
        JLabel lblfood = new JLabel("Food Included?");
        lblfood.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblfood.setBounds(40, 270, 150, 20);
        add(lblfood);
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250, 270, 200, 25);
        add(cfood);
        
        
        
        // ID label and field
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(40, 310, 150, 20);
        lblid.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblid);

        labelid = new JLabel();
        labelid.setBounds(250, 310, 200, 25);
        add(labelid);

        
        // ID Number label and field
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblnumber.setBounds(40, 350, 150, 25);
        add(lblnumber);

        labelnumber = new JLabel();
        labelnumber.setBounds(250, 350, 150, 25);
        add(labelnumber);
        

        // Phone label and field
        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblphone.setBounds(40, 390, 150, 20);
        add(lblphone);

        labelphone = new JLabel();
        labelphone.setBounds(250, 390, 200, 25);
        add(labelphone);
        
        

        // Total Price label and field
        JLabel lbltotal = new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbltotal.setBounds(40, 430, 150, 25);
        add(lbltotal);

        labelprice = new JLabel();
        labelprice.setBounds(250, 430, 150, 25);
        add(labelprice);

        
        // Retrieve user data from the database and set to labels
        try {
            DBConn c = new DBConn();  // Create a database connection
            ResultSet rs = c.s.executeQuery("SELECT * FROM customer WHERE username = '" + username + "'");
            if (rs.next()) {
        // Retrieve data from the ResultSet and set it to the corresponding JLabels
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Check Price button
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60, 490, 120, 25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        // Book Hotel button
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBackground(Color.BLACK);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBounds(200, 490, 120, 25);
        bookhotel.addActionListener(this);
        add(bookhotel);
        
        // Back button
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340, 490, 120, 25);
        back.addActionListener(this);
        add(back);

        // Add an image to the frame
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image image = icon.getImage().getScaledInstance(450, 600, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);

        JLabel label12 = new JLabel(scaledIcon);
        label12.setBounds(530, 0, 450, 600);
        add(label12);
        
        setVisible(true);
        
    }
    
    // Action event handler for buttons
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == checkprice) {
            
            try{
                
                DBConn c = new DBConn();
                ResultSet rs = c.s.executeQuery("SELECT * FROM hotel WHERE name = '" + chotel.getSelectedItem() + "'");
            
                while (rs.next()) {
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                    int ac = Integer.parseInt(rs.getString("acroom"));
                    int food = Integer.parseInt(rs.getString("foodincluded"));


                    int persons = Integer.parseInt(tfpersons.getText());
                    int days = Integer.parseInt(tfdays.getText());

                    String acselected = cac.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();

                    if (persons * days > 0) {
                        int total = 0;
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("Yes") ? food : 0;
                        total += cost;
                        total = total * persons * days;
                        labelprice.setText("Rs " + total);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number");
                    }

                }
            }catch(Exception e) {
                e.printStackTrace();
            }
            
        } else if (ae.getSource() == bookhotel) {
                try{
                    DBConn c = new DBConn();
                    c.s.executeUpdate("insert into bookhotel value('"+labelusername.getText()+"', '"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                    JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                    setVisible(false);
                }catch (Exception e){
                    e.printStackTrace();
                }
        } else {
             setVisible(false); // Hide the frame if neither button was clicked
        }
}
    // Main method to create an instance of BookHotel
    public static void main(String[] args) {
        new BookHotel("username");
    }
    
}
