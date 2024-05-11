package com.mycompany.test;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class LoginPage implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== exit ){
                System.exit(0);
            }else if (e.getSource()==login) {
                String x = JOptionPane.showInputDialog("Enter username:");
                String y = JOptionPane.showInputDialog("Enter password:"); 
                if(x.equals("admin")&&y.equals("123")){
                    window.setVisible(false);
                    Test.y.window.setVisible(true);
                }else if(x.equals("customer")&&y.equals("999")){
                    window.setVisible(false);
                     Test.z.window.setVisible(true);
                } else{ 
                }      JOptionPane.showMessageDialog(window,"Wrong username or password!");
            }
        }
        Button login;
        Button exit;
        JFrame window;
        public LoginPage(){
            window = new JFrame();
            window.setSize(100,100);
            window.setLocation(1000,200);
            window.setLayout(new FlowLayout());
            login = new Button("Login");
            exit = new Button ("Exit");
            login.addActionListener(this);
            exit.addActionListener(this);
            window.add (login);
            window.add (exit);
            window.setVisible(true);
        }
        
        
        
        
}

