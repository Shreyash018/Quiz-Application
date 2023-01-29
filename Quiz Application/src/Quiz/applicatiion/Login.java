package Quiz.applicatiion;


import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    // Jframe class is extended by using inheritence method and j frame clas comes from swing package
    // here we are implementing an interface it comes from AWT event package that is action listener
    // ActionListener is an unimplemented interfacing abstract methodd in java , ther eare lot of unimplemented things, thats why we have to overide this
    JButton rules;
    JButton back;
    JTextField tfname;

    Login() {
        this.getContentPane().setBackground(Color.WHITE);// background color comes from AWT package
        this.setLayout((LayoutManager)null); // this default layout we have to make it null we will use our layout


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500); // here is the layout that image will place on frame
        this.add(image);// here we have to add image on frame thats why we use add() we have o add object of imgae bt here we cant pass i1 directly in add(),
        // thats why we create object of Jlable class here we pass i1 there and after that we pass Jlable object to add().

        // Jlabble work as we can write anything on frame by using jLable
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", 1, 40));
        heading.setForeground(new Color(30, 144, 254)); // this is a font color
        this.add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", 1, 18));
        name.setForeground(new Color(30, 144, 254));
        this.add(name);

        this.tfname = new JTextField(); // by using JTextField we can make text box
        this.tfname.setBounds(735, 200, 300, 25);
        this.tfname.setFont(new Font("Times New Roman", 1, 20));
        this.add(this.tfname);

        this.rules = new JButton("Rules"); // here we are going to make button
        this.rules.setBounds(735, 270, 120, 25);
        this.rules.setBackground(new Color(30, 144, 254));
        this.rules.setForeground(Color.WHITE); // font color
        this.rules.addActionListener(this); // we have to perform action on this button,we have to perform click event on this button
                                                // what action will take after click event it will define in actionperformer class
        this.add(this.rules);

        this.back = new JButton("Back");
        this.back.setBounds(915, 270, 120, 25);
        this.back.setBackground(new Color(30, 144, 254));
        this.back.setForeground(Color.WHITE);
        this.back.addActionListener(this); // we have to perform action on this button,we have to perform click event on this button
                                             // what action will take after click event it will define in actionperformer class
        this.add(this.back);

        this.setSize(1200, 500);// size of frame
        this.setLocation(200, 150);// location of frame
        this.setVisible(true); // Jframe is bydefualt invisible we have to make it visible
    }
// Actionlistener is overided here
    public void actionPerformed(ActionEvent ae) {
        // here it will differentiate click on and which button and wht to perform
        if (ae.getSource() == this.rules) { // if user will click on Rules this frame will be close and new frame will be open we have to create new frame named as Rules
            String name = this.tfname.getText();
            this.setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == this.back) {
            this.setVisible(false); // when user will click on back button frame will invisible
        }

    }

    public static void main(String[] args) {
        new Login();
    }


    }
