
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Login  extends JFrame implements ActionListener{ 
    
    JButton login,sign,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login()
    {
        setLayout(null);
        setTitle("AUTOMATED TELLRE MACHIN");
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno=new JLabel("CARD NO:");
        cardno.setFont(new Font("Releway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        cardTextField= new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,15));
        add(cardTextField);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,210,250,30);
        add(pin);
        
        pinTextField= new JPasswordField();
        pinTextField.setBounds(300,210,230,30);
//      pinTextField.setFont(new Font("Arial",Font.BOLD,15));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        sign = new JButton("SIGN UP");
        sign.setBounds(300,350,230,30);
        sign.setBackground(Color.BLACK);
        sign.setForeground(Color.WHITE);
        sign.addActionListener(this);
        add(sign);
        
        
        label.setBounds(70,10,100,100);
        
        setSize(900,500);
        setVisible(true);
        setLocation(350,200);
        
        
        
    }
    public void actionPerformed(ActionEvent ae) {
        
       if(ae.getSource()==clear){
           cardTextField.setText("");
           pinTextField.setText("");   
       }
           
       
       else if(ae.getSource()==login){
           Conn c=new Conn();
           String cardnumber=cardTextField.getText();
           String pinnumber=pinTextField.getText();
           String q4="select * from login where cardnumber='"+cardnumber+"'and pin='"+pinnumber+"'";
           try{
               ResultSet rs =c.s.executeQuery(q4);
               if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null,"Incurrect Card or Pin Number");
               }
           }catch(Exception e)
           {
               System.out.println(e);
           }
       
       }
       else if (ae.getSource()==sign){
           setVisible(false);
           new SignupOne().setVisible(true);
           
       }  
      
    }
    
    public static void main(String[] arg)
    {
        new Login();
    }
    
}
