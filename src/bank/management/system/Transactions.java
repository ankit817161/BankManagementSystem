
package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener{
    JButton deposite,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    public Transactions(String pinnumber){
        this.pinnumber=pinnumber;
       setLayout(null);
       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
       Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       JLabel image =new JLabel(i3);
       image.setBounds(0,0,900,900);
       add(image);
        
       JLabel text =new JLabel("Pelese select your Trascation ");
       text.setBounds(250,300,700,35);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("Releway",Font.BOLD,16));
       image.add(text);
       
       deposite = new  JButton("Deposite");
       deposite.setBounds(170,415,150,30);
       deposite.addActionListener(this);
       image.add(deposite);
       
       withdrawl = new  JButton("Withdrawl");
       withdrawl.setBounds(350,415,150,30);
       withdrawl.addActionListener(this);
       image.add(withdrawl);
       
       fastcash = new  JButton("Fast Cash ");
       fastcash.setBounds(170,450,150,30);
       fastcash.addActionListener(this);
       image.add(fastcash);
       
       ministatement = new  JButton("Mini Statement");
       ministatement.setBounds(350,450,150,30);
       ministatement.addActionListener(this);
       image.add(ministatement);
       
       pinchange = new  JButton("Pin change");
       pinchange.setBounds(170,485,150,30);
       pinchange.addActionListener(this);
       image.add(pinchange);
       
       balanceenquiry = new  JButton(" Balance Enquiry");
       balanceenquiry.setBounds(350,485,150,30);
       balanceenquiry.addActionListener(this);
       image.add( balanceenquiry);
       
       exit = new  JButton("Exit");
       exit.setBounds(350,520,150,30);
       exit.addActionListener(this);
       image.add(exit);
       
       setSize(900,900);
       setLocation(300,0);
       setUndecorated(true);
       setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit)
        {
          System.exit(0);
        }else if(ae.getSource()== deposite){
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
        }else if (ae.getSource()== withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String[] arg)
    {
        new Transactions("");
    }
    
}
