
package bank.management.system;

/*import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;*/
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;






public class SignupTwo extends  JFrame implements ActionListener{
   
    
    JTextField pan,adhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,income,education;
    String formno;
   public  SignupTwo( String formno){
    this.formno=formno;
       
    setLayout(null);
    JLabel AdditionalDetails=new JLabel("Page-2 Additional Details :" );
    AdditionalDetails.setFont(new Font("Releway",Font.BOLD,38));
    AdditionalDetails.setBounds(120,20,600,40);
    add(AdditionalDetails);
    
    JLabel persnol=new JLabel("Page-2: Parsonal Details ");
    persnol.setFont(new Font("Releway",Font.BOLD,14));
    persnol.setBounds(290,80,400,70);
    add(persnol);
    
    JLabel name=new JLabel("Religions:");
    name.setFont(new Font("Releway",Font.BOLD,16));
    name.setBounds(120,140,400,30);
    add(name);
    
    String a[] = {"Hindu","Muslim","Sikh","Christtion","other"};
    religion=new JComboBox(a);
    religion.setBounds(300,140,230,30);
    religion.setFont(new Font("Arial",Font.BOLD,15));
    religion.setBackground(Color.WHITE);
    add(religion);
    
    
    JLabel fname=new JLabel("category");
    fname.setFont(new Font("Releway",Font.BOLD,16));
    fname.setBounds(120,190,400,30);
    add(fname);
    
    String a2[] = {"General","OBC","SC","ST","other"};
    category=new JComboBox(a2);
    category.setBounds(300,190,230,30);
    category.setFont(new Font("Arial",Font.BOLD,15));
    category.setBackground(Color.WHITE);
    add(category);
    
    
    
    JLabel dob=new JLabel("Income:");
    dob.setFont(new Font("Releway",Font.BOLD,16));
    dob.setBounds(120,250,400,30);
    add(dob);
    
    String a3[] = {"0","1,50000","<2,00000","<5,00000","upto<10,0000"};
    income =new JComboBox(a3);
    income.setBounds(300,250,230,30);
    income.setForeground(Color.BLACK);
    income.setBackground(Color.WHITE);
    add(income);
    
  
    
    JLabel gender=new JLabel("Educational:");
    gender.setFont(new Font("Releway",Font.BOLD,16));
    gender.setBounds(120,300,400,30);
    add(gender);
    
    JLabel email=new JLabel("Qualification:");
    email.setFont(new Font("Releway",Font.BOLD,16));
    email.setBounds(120,320,230,30);
    add(email);
    
    String a4[] = {"Non-Graduation","Graduate","PostGraduation","Other"};
    education =new JComboBox(a4);
    education.setBounds(300,310,230,30);
    education.setFont(new Font("Arial",Font.BOLD,15));
    education.setBackground(Color.WHITE);
    add(education);
            
   
    
    JLabel marital=new JLabel("Occupation:");
    marital.setFont(new Font("Releway",Font.BOLD,16));
    marital.setBounds(120,370,400,30);
    add(marital);
    
    String a5[] = {"Student","Bussiness","Job","Other"};
    occupation =new JComboBox(a5);
    occupation.setBounds(300,370,230,30);
    occupation.setBackground(Color.WHITE);
    add(occupation);
    
   
    JLabel addres=new JLabel("Pan No:");
    addres.setFont(new Font("Releway",Font.BOLD,16));
    addres.setBounds(120,440,400,30);
    add(addres);
    
    pan= new JTextField();
    pan.setBounds(300,440,230,30);
    pan.setFont(new Font("Arial",Font.BOLD,15));
    add(pan);
           
    JLabel city=new JLabel("Adhar N0:");
    city.setFont(new Font("Releway",Font.BOLD,16));
    city.setBounds(120,480,400,30);
    add(city);
    
    adhar= new JTextField();
    adhar.setBounds(300,480,230,30);
    adhar.setFont(new Font("Arial",Font.BOLD,15));
    add(adhar);
    
    JLabel state=new JLabel("Senior citizen:");
    state.setFont(new Font("Releway",Font.BOLD,16));
    state.setBounds(120,520,400,30);
    add(state);
    
    syes=new JRadioButton("Yes");
    syes.setBounds(300,520,60,30);
    syes.setBackground(Color.WHITE);
    add(syes);
    
    sno=new JRadioButton("No");
    sno.setBounds(400,520,80,30);
    sno.setBackground(Color.WHITE);
    add(sno);
    
    ButtonGroup group=new ButtonGroup();
    group.add(syes);
    group.add(sno);
   
    
    JLabel pincode=new JLabel("Exisiting Account");
    pincode.setFont(new Font("Releway",Font.BOLD,16));
    pincode.setBounds(120,570,400,30);
    add(pincode);
    
    eyes=new JRadioButton("Yes");
    eyes.setBounds(300,570,60,30);
    eyes.setBackground(Color.WHITE);
    add(eyes);
    
    eno=new JRadioButton("No");
    eno.setBounds(400,570,80,30);
    eno.setBackground(Color.WHITE);
    add(eno);
    
    ButtonGroup group1=new ButtonGroup();
    group.add(eyes);
    group.add(eno);
    
    next= new JButton("Next");
    next.setBounds(430,620,100,30);
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.addActionListener(this);
    add(next);
           
           
           
           
        
        
    getContentPane().setBackground(Color.WHITE);
    setSize(850, 730);
    setLocation(350,10);
    setVisible(true);
    
    }
    
    public void actionPerformed( ActionEvent ae){
        String sreligion =(String)religion.getSelectedItem();
        String scategory =(String)category .getSelectedItem();
        String sincome=(String)income .getSelectedItem();
        String seducation =(String)education .getSelectedItem();
        String soccuption=(String)occupation.getSelectedItem();
        String seniorcitizen =null;
        if(syes.isSelected())
        {
          seniorcitizen="Yes";
        }
        else if(sno.isSelected())
        {
          seniorcitizen="No";
        }
 
        String exisitingaccount=null;
        if(eyes.isSelected())
        {
            exisitingaccount = "Yes";
        }
        else if(sno.isSelected())
        {
            exisitingaccount="No";
            
        }
        
        String span=pan.getText();
        String sadhar=adhar.getText();
       
        try{
          
                Conn c =new Conn();
                String q ="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccuption+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
                c.s.executeUpdate(q);
            
             //create object signup3
             setVisible(false);
             new SignupThree(formno).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
       
       
       
   }
    public static void main(String[] arg)
    {
        new SignupTwo("");
    }
    
}
