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
                DataIO.writeData();
                System.exit(0);
            }else if (e.getSource()==login) {
                String x = JOptionPane.showInputDialog("Enter username:");
                String y = JOptionPane.showInputDialog("Enter password:"); 
                if(x.equals("admin")&&y.equals("123")){
                    window.setVisible(false);
                    Test.y.window.setVisible(true);
                } else{ 
                    Customer found = null;
                    for(int i=0; i<DataIO.all.size(); i++){
                    Customer c = DataIO.all.get(i);
                    if(c.username.equals(x)){
                        found = c;
                        break;
                    }
                }
             
                if(found == null)   {
                    JOptionPane.showMessageDialog(window,"Wrong username!");
                }else {
                    int password = Integer.parseInt(y);
                    if(found.password == password ){
                        window.setVisible(false);
                        Test.z.window.setVisible(true);
                    }else { 
                    JOptionPane.showMessageDialog(window,"Wrong password!");
                    }
                }
            }
 //               else if(x.equals("customer")&&y.equals("999")){
  //                  window.setVisible(false);
 //                   Test.z.window.setVisible(true);
  //              } else{ 
  //              }      JOptionPane.showMessageDialog(window,"Wrong username or password!");
            }else if (e.getSource()== register){
                String name= JOptionPane.showInputDialog("Enter your username:");
                Customer found = DataIO.checkUsername(name);
                if (found != null){
                    JOptionPane.showInputDialog(window,"The username has been registered!");
                }else {
                    int password = Integer.parseInt(JOptionPane.showInputDialog("Enter your password:"));
                    Customer c = new Customer(name,password);
                    DataIO.all.add(c);
                    DataIO.writeData();
                }
            }
        }
        Button register;
        Button login;
        Button exit;
        JFrame window;
        public LoginPage(){
            window = new JFrame();
            window.setSize(100,100);
            window.setLocation(1000,200);
            window.setLayout(new FlowLayout());
            register =  new Button("Register");
            login = new Button("Login");
            exit = new Button ("Exit");
            register.addActionListener(this);
            login.addActionListener(this);
            exit.addActionListener(this);
            window.add(register);
            window.add (login);
            window.add (exit);
            window.setVisible(true);
        }
        
        
        
        
}

