
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class Deposite  extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton deposite,back;
    String pinnumber;
    
    public Deposite(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
    
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        JLabel text= new JLabel("Enter the amount you want deposite ");
        text.setBounds(170, 300,400, 30);
        text.setFont(new Font("Releway",Font.BOLD,16));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        amount = new JTextField();
        amount.setBounds(170,350,350,25);
        add(amount);
        
        deposite= new JButton("Deposite");
        deposite.setBounds(410,450,100,30);
        deposite.addActionListener(this);
        image.add(deposite);
        
        back = new JButton("Back");
        back.setBounds(410,485,100,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(350,0);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposite)
        {
            String number=amount.getText();
            Date date=new Date();
            if(number.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the amount  you want deposite");
            }else {
                try{
                Conn c=new Conn();
                String q5 ="insert into bank values('"+pinnumber+"','"+date+"','Deposite','"+number+"')";
                c.s.executeUpdate(q5);
                JOptionPane.showMessageDialog(null,"Rs"+number+"Deposited successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                }catch(Exception e){
                    System.out.print(e);
                }
                
            }
            
        }else if (ae.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
            
        }
        
    }
     public static void main(String[] arg)
    {
        new Deposite("");
    }
    
}
