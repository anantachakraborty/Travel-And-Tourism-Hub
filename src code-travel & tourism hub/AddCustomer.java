package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener {

    // Declaring Globally
    JLabel Labelusername, Labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphone;
    JRadioButton rmale, rfemale, rothers;
    JButton add, back;

    // Constructor
    AddCustomer(String username) {
        setBounds(220, 110, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Labels and Combobox for user input
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);

        Labelusername = new JLabel();
        Labelusername.setBounds(220, 50, 150, 25);
        add(Labelusername);

        // ID ComboBox
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);

        comboid = new JComboBox(new String[]{"Passport", "Aadhar Card", "Pan Card", "Ration Card", "Govt. Issued Photo Id"});
        comboid.setBounds(220, 90, 150, 25);
        comboid.setBackground(Color.WHITE);
        add(comboid);

        // Number Input
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 130, 150, 25);
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);

        // Name Label
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 170, 150, 25);
        add(lblname);

        Labelname = new JLabel();
        Labelname.setBounds(220, 170, 150, 25);
        add(Labelname);

        // Gender Selection
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 210, 150, 25);
        add(lblgender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(220, 210, 70, 25);
        rmale.setBackground(Color.WHITE);
        add(rmale);

        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300, 210, 70, 25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);

        rothers = new JRadioButton("Others");
        rothers.setBounds(380, 210, 70, 25);
        rothers.setBackground(Color.WHITE);
        add(rothers);

        // Group Radio Buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        bg.add(rothers);

        // Country Input
        JLabel lblcountey = new JLabel("Country");
        lblcountey.setBounds(30, 250, 150, 25);
        add(lblcountey);

        tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);

        // Address Input
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30, 290, 150, 25);
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(220, 290, 150, 25);
        add(tfaddress);

        // Email Input
        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(30, 330, 150, 25);
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(220, 330, 150, 25);
        add(tfemail);

        // Phone Input
        JLabel lblphone = new JLabel("Phone No. with Country Code");
        lblphone.setBounds(30, 370, 190, 25);
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(220, 370, 150, 25);
        add(tfphone);

        // Add and Back Buttons
        add = new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70, 430, 100, 25);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(270, 430, 100, 25);
        back.addActionListener(this);
        add(back);

        // Load and display user information
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.png"));
        Image i2 = il.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 40, 350, 420);
        add(image);

        try {
            DBConn c = new DBConn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '" + username + "'");
            while (rs.next()) {
                Labelusername.setText(rs.getString("username"));
                Labelname.setText(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    // ActionPerformed method for button actions
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            // Get user inputs
            String username = Labelusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = Labelname.getText();

            String gender = null;
            if (rmale.isSelected()) {
                gender = "Male";
            } else if (rfemale.isSelected()) {
                gender = "Female";
            } else {
                gender = "Others";
            }

            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();

            try {
                DBConn c = new DBConn();
                String query = "insert into customer values ('" + username + "', '" + id + "', '" + number + "', '" + name + "', '" + gender + "', '" + country + "', '" + address + "','" + phone + "','" + email + "')";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

     // Entry point of the program
    public static void main(String[] args) {
        new AddCustomer("username");
    }
}
