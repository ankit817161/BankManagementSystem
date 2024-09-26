package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cencel;
    String formno;

    public SignupThree(String formno) {
        this.formno = formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page-3 Account Detail");
        l1.setBounds(280, 40, 600, 40);
        l1.setFont(new Font("Releway", Font.BOLD, 38));
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setBounds(100, 140, 200, 30);
        type.setFont(new Font("Releway", Font.BOLD, 18));
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100, 180, 150, 30);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setBounds(350, 180, 200, 30);
        r2.setBackground(Color.WHITE);
        add(r2);

        r3 = new JRadioButton("Currrent Account");
        r3.setBounds(100, 220, 150, 30);
        r3.setBackground(Color.WHITE);
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setBounds(350, 220, 200, 30);
        r4.setBackground(Color.WHITE);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card No");
        card.setBounds(100, 300, 200, 30);
        card.setFont(new Font("Releway", Font.BOLD, 22));
        add(card);
        JLabel carddetail = new JLabel("Your 16 Digit Card No");
        carddetail.setBounds(100, 320, 200, 30);
        carddetail.setFont(new Font("Releway", Font.BOLD, 12));
        add(carddetail);

        JLabel number = new JLabel("XXXX-XXXX-4123");
        number.setBounds(330, 300, 200, 30);
        number.setFont(new Font("Releway", Font.BOLD, 22));
        add(number);

        JLabel pin = new JLabel("PIN");
        pin.setBounds(100, 350, 200, 30);
        pin.setFont(new Font("Releway", Font.BOLD, 22));
        add(pin);

        JLabel pindetail = new JLabel("Your 4 Digit Pin No.");
        pindetail.setBounds(100, 370, 200, 30);
        pindetail.setFont(new Font("Releway", Font.BOLD, 12));
        add(pindetail);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setBounds(330, 350, 200, 30);
        pnumber.setFont(new Font("Releway", Font.BOLD, 22));
        add(pnumber);

        JLabel services = new JLabel("Services Required");
        services.setBounds(100, 420, 200, 30);
        services.setFont(new Font("Releway", Font.BOLD, 22));
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setBounds(100, 450, 200, 30);
        c1.setFont(new Font("Releway", Font.BOLD, 16));
        add(c1);

        c2 = new JCheckBox("Internet banking");
        c2.setBackground(Color.WHITE);
        c2.setBounds(350, 450, 200, 30);
        c2.setFont(new Font("Releway", Font.BOLD, 16));
        add(c2);

        c3 = new JCheckBox("Mobile banking");
        c3.setBackground(Color.WHITE);
        c3.setBounds(100, 480, 200, 30);
        c3.setFont(new Font("Releway", Font.BOLD, 16));
        add(c3);

        c4 = new JCheckBox("Email & SMS ");
        c4.setBackground(Color.WHITE);
        c4.setBounds(350, 480, 200, 30);
        c4.setFont(new Font("Releway", Font.BOLD, 16));
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setBounds(100, 510, 200, 30);
        c5.setFont(new Font("Releway", Font.BOLD, 16));
        add(c5);
        c6 = new JCheckBox("E Statement");
        c6.setBackground(Color.WHITE);
        c6.setBounds(350, 510, 200, 30);
        c6.setFont(new Font("Releway", Font.BOLD, 16));
        add(c6);

        c7 = new JCheckBox("I hereby declares that above entered detaild are correct to the best knowledge ");
        c7.setBackground(Color.WHITE);
        c7.setBounds(100, 550, 600, 30);
        c7.setFont(new Font("Releway", Font.BOLD, 12));
        add(c7);
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(220, 600, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cencel = new JButton("Cencel");
        cencel.setBackground(Color.BLACK);
        cencel.setForeground(Color.WHITE);
        cencel.setBounds(400, 600, 100, 30);
        cencel.addActionListener(this);
        add(cencel);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (r1.isSelected()) {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed deposite Account";
            } else if (r3.isSelected()) {
                accountType = "current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring deposite Accunt";
            }
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 900L) + 1000L);
            String facility = "";
            if (c1.isSelected()) {
                facility = facility + "ATM Card";
            } else if (c2.isSelected()) {
                facility = facility + "Internet banking";
            } else if (c3.isSelected()) {
                facility = facility + "Mobile banking";
            } else if (c4.isSelected()) {
                facility = facility + "Cheque Book";
            } else if (c5.isSelected()) {
                facility = facility + "Email & SMS";
            } else if (c6.isSelected()) {
                facility = facility + "E Statement";
            }
            try {
                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type not Empty");
                } else {
                    Conn c = new Conn();
                    String q1 = "insert into signupthree values('" + formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                    String q2 = "insert into login values('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                    c.s.executeUpdate(q1);
                    c.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                }
            } catch (Exception e) {
                System.out.println(e);

            }
        } else if (ae.getSource() == cencel) {

        }

    }

    public static void main(String[] arg) {
        new SignupThree(" ");
    }

}
