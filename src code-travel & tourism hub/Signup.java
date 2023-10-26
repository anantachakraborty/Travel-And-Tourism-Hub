package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Signup extends JFrame implements ActionListener {
    
    // Defining Globally
    JButton create, back;
    JTextField tfname, tfusername, tfpassword, tfanswer;
    Choice security;

    // Constructor for the Signup class
    Signup() {
        // Set the window's position and dimensions
        setBounds(200, 150, 900, 400);
        // Set the background color of the window
        getContentPane().setBackground(Color.WHITE);
        // Disable any layout manager to allow manual positioning of components
        setLayout(null);

        // Create a panel for the left side of the window
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        // Add a label and text field for the Username
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblusername.setBounds(50, 20, 125, 20);
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(190, 20, 180, 20);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        // Add a label and text field for the Name
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblname.setBounds(50, 60, 125, 20);
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(190, 60, 180, 20);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        // Add a label and text field for the Password
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblpassword.setBounds(50, 100, 125, 20);
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(190, 100, 180, 20);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        // Add a label and dropdown (Choice) for the Security Question
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblsecurity.setBounds(50, 140, 125, 20);
        p1.add(lblsecurity);

        security = new Choice();
        security.add("Name of Your Crime Partner?");
        security.add("Your Lucky No?");
        security.add("Your Fav Actor/Actress?");
        security.add("Your Fav Character of Any Show?");
        security.add("Your Fev Teacher?");
        security.add("Your First Pet's Name?");
        security.setBounds(190, 140, 180, 20);
        p1.add(security);

        // Add a label and text field for the Security Question's Answer
        JLabel lblanswer = new JLabel("Your Answer");
        lblanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblanswer.setBounds(50, 180, 125, 20);
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(190, 180, 180, 20);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        // Create Back and Create buttons
        back = new JButton("Back");
        back.setBackground(new Color(133, 193, 233));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        back.setBounds(80, 250, 100, 30);
        back.addActionListener(this);
        p1.add(back);

        create = new JButton("Create");
        create.setBackground(new Color(133, 193, 233));
        create.setForeground(Color.WHITE);
        create.setFont(new Font("Tahoma", Font.BOLD, 14));
        create.setBounds(280, 250, 100, 30);
        create.addActionListener(this);
        p1.add(create);

        // Add an image to the right side of the window
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(570, 40, 250, 250);
        add(image);

        // Make the window visible
        setVisible(true);
    }
    // Action performed when the "Back" button is clicked
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
            
        // Retrieve user input values    
        String username = tfusername.getText();
        String name = tfname.getText();
        String password = tfpassword.getText();
        String question = security.getSelectedItem();
        String answer = tfanswer.getText();
        
        // Create an SQL query to insert data into the database
        String query = "insert into account values('"+username+"' , '"+name+"' , '"+password+"' , '"+question+"' , '"+answer+"')" ;
        try{
            // Establish a database connection and execute the query
           DBConn c = new DBConn();
           c.s.executeUpdate(query);
           
           JOptionPane.showMessageDialog(null, "Account Created Successfully");
           
           setVisible(false);
           new Login();
           
           
        } catch (Exception e){
            e.printStackTrace();
        }
        
        }else if(ae.getSource() == back){
        // Return to the Login screen when the "Back" button is clicked   
          setVisible(false);
          new Login();
          
        }
    }
    
    // The main method that initializes and shows the frame
    public static void main(String[] args) {
        // Create an instance of the Signup class to display the window
        new Signup();
    }
}
