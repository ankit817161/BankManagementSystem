
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;





public class SignupOne extends  JFrame implements ActionListener{
    long random;
    
    JTextField nameTextField,fnameTextField,emailTextField,
            cityTextField,stateTextField,addressTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,other,married ,unmarried;
    JDateChooser datechooser ;
    
    
    SignupOne()
    {
    setLayout(null);
    Random ran=new Random();
    random= Math.abs((ran.nextLong()%9000L)+1000L);
    
    JLabel formno=new JLabel("Application  form :" +random);
    formno.setFont(new Font("Releway",Font.BOLD,38));
    formno.setBounds(120,20,600,40);
    add(formno);
    
    JLabel persnol=new JLabel("Page-1: Parsonal Details ");
    persnol.setFont(new Font("Releway",Font.BOLD,14));
    persnol.setBounds(290,80,400,70);
    add(persnol);
    
    JLabel name=new JLabel("Name");
    name.setFont(new Font("Releway",Font.BOLD,16));
    name.setBounds(120,140,400,30);
    add(name);
    
    nameTextField= new JTextField();
    nameTextField.setBounds(300,140,230,30);
    nameTextField.setFont(new Font("Arial",Font.BOLD,15));
    add(nameTextField);
    
    JLabel fname=new JLabel("Father Name");
    fname.setFont(new Font("Releway",Font.BOLD,16));
    fname.setBounds(120,190,400,30);
    add(fname);
     fnameTextField= new JTextField();
    fnameTextField.setBounds(300,190,230,30);
    fnameTextField.setFont(new Font("Arial",Font.BOLD,15));
    add(fnameTextField);
    
    JLabel dob=new JLabel("Date of Birth");
    dob.setFont(new Font("Releway",Font.BOLD,16));
    dob.setBounds(120,250,400,30);
    add(dob);
    
    datechooser = new JDateChooser();
    datechooser.setBounds(300,250,230,30);
    datechooser.setForeground(Color.BLACK);
    add(datechooser);
    
    
  
    
    JLabel gender=new JLabel("Gender");
    gender.setFont(new Font("Releway",Font.BOLD,16));
    gender.setBounds(120,300,400,30);
    add(gender);
    
    male=new JRadioButton("Male");
    male.setBounds(300,300,60,30);
    male.setBackground(Color.WHITE);
    add(male);
    
    female=new JRadioButton("Female");
    female.setBounds(400,300,80,30);
    female.setBackground(Color.WHITE);
    add(female);
    
    ButtonGroup group=new ButtonGroup();
    group.add(male);
    group.add(female);
    
    
    JLabel email=new JLabel("Email");
    email.setFont(new Font("Releway",Font.BOLD,16));
    email.setBounds(120,350,230,30);
    add(email);
    
    emailTextField= new JTextField();
    emailTextField.setBounds(300,350,230,30);
    emailTextField.setFont(new Font("Arial",Font.BOLD,15));
    add(emailTextField);
    
    JLabel marital=new JLabel("Marital status");
    marital.setFont(new Font("Releway",Font.BOLD,16));
    marital.setBounds(120,400,400,30);
    add(marital);
    
    married=new JRadioButton("Married");
    married.setBounds(300,390,80,30);
    married.setBackground(Color.WHITE);
    add(married);
    
    unmarried=new JRadioButton("Unmarried");
    unmarried.setBounds(380,390,100,30);
    unmarried.setBackground(Color.WHITE);
    add(unmarried);
    
    other=new JRadioButton("Other");
    other.setBounds(480,390,100,30);
    other.setBackground(Color.WHITE);
    add(other);
    
    
    
    ButtonGroup group2=new ButtonGroup();
    group2.add(married);
    group2.add(unmarried);
    group2.add(other);
    
    
    
   
    JLabel addres=new JLabel("Addres");
    addres.setFont(new Font("Releway",Font.BOLD,16));
    addres.setBounds(120,440,400,30);
    add(addres);
    
    addressTextField= new JTextField();
    addressTextField.setBounds(300,440,230,30);
    addressTextField.setFont(new Font("Arial",Font.BOLD,15));
    add(addressTextField);
           
    JLabel city=new JLabel("City");
    city.setFont(new Font("Releway",Font.BOLD,16));
    city.setBounds(120,480,400,30);
    add(city);
    
    cityTextField= new JTextField();
    cityTextField.setBounds(300,480,230,30);
    cityTextField.setFont(new Font("Arial",Font.BOLD,15));
    add(cityTextField);
    
    JLabel state=new JLabel("State");
    state.setFont(new Font("Releway",Font.BOLD,16));
    state.setBounds(120,520,400,30);
    add(state);
    
    stateTextField= new JTextField();
    stateTextField.setBounds(300,520,230,30);
    stateTextField.setFont(new Font("Arial",Font.BOLD,15));
    add(stateTextField);
    
    JLabel pincode=new JLabel("Pin Code");
    pincode.setFont(new Font("Releway",Font.BOLD,16));
    pincode.setBounds(120,570,400,30);
    add(pincode);
    
    pincodeTextField= new JTextField();
    pincodeTextField.setBounds(300,570,230,30);
    pincodeTextField.setFont(new Font("Arial",Font.BOLD,15));
    add(pincodeTextField);
    
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
        String formno=""+ random;//long
        String name=nameTextField.getText();
        String fname=fnameTextField.getText();
        String dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
         String gender =null;
        if(male.isSelected())
        {
            gender="Male";
        }
        else if(female.isSelected())
        {
          gender="Female";
        }
        String email=emailTextField.getText();
        String marital=null;
        if(married.isSelected())
        {
            marital="Married";
        }
        else if(unmarried.isSelected())
        {
            marital="Unmarried";
            
        }
        else if (other.isShowing())
        {
            marital= "Other";     }
        String state=stateTextField.getText();
        String pincode =pincodeTextField.getText();
        String city=cityTextField.getText();
        String address=addressTextField.getText();
        try{
            if(name.equals("")){
                 JOptionPane.showMessageDialog(null,"Name has Requierd");
            } else{
                Conn c =new Conn();
                String q ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+pincode+"','"+city+"','"+state+"')";
                c.s.executeUpdate(q);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
 
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    public static void main(String[] arg)
    {
        new SignupOne();
    }

    /*private void add(JDateChooser datechooser) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    */
}
