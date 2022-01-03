//Reference:https://www.geeksforgeeks.org/gui-application-for-the-student-management-system/
package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;
import javafx.print.Printer;
import java.io.*;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
 
//ABSTRACT CLASS (i.e also a principle) inherithing components from java swing/AWT
//----------------------------------------------------------------------------
abstract class TOUR extends Frame{
    abstract void recipt();  //abstract method
}
//CLASS A INHERITS ABSTRACT CLASS (INHERITENCE i.e another principle)
//------------------------------------------------------------------


class TRAVELLING extends TOUR{
   //encapsulating swings components by declearing them private
    //(ENCAPSULATION i.e third principle)
    //---------------------------------------------------------
   
    private JLabel l1, l2, l3, l4,l5, l6, l7, l8,l9, l10, l12, l13,l14, l11;
    private JTextField tf1, tf2, tf3,tf4, tf5, tf6,tf7;
    private JTextArea area2, area1;
    private JRadioButton rb1, rb2, rb3,rb4;
    private JComboBox cb1,cb2;
   
   
   //OVERRIDING METHOD (POLYMORPISM i.e 4th principle)
  //--------------------------------------------------
       
    @Override
    void recipt(){
       
l1 = new JLabel("@@@@@@@@@@@@---TRAVEL MANAGEMENT SYSTEM---@@@@@@@@@@@@"); //MAIN LABEL
l1.setBounds(350, 100, 500, 50);

l2 = new JLabel("FIRST NAME :");          //WRITE FIRST NAME
l2.setBounds(50, 150, 250, 20);
tf1 = new JTextField();
tf1.setBounds(250, 150, 250, 20);    //BOUNDS OF INPUT BOX

tf1.addKeyListener(new KeyAdapter(){ //validation
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isLetter(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "ONLY LETTERS ARE ALLOWED!");
                    tf1.setText(" ");
                }
            }
});


l3 = new JLabel("SECOND NAME :");       //ENTER SECOND NAME
l3.setBounds(50, 200, 250, 20);  
tf2 = new JTextField();              
tf2.setBounds(250, 200, 250, 20);     //BOUNDS OF INPUT BOX

tf2.addKeyListener(new KeyAdapter(){ //validation
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isLetter(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "ONLY LETTERS ARE ALLOWED!");
                    tf2.setText(" ");
                }
            }
});

l4 = new JLabel("CNIC NO :");       //ENTER POST CODE
l4.setBounds(50, 250, 250, 20);
tf3 = new JTextField();
tf3.setBounds(250, 250, 250, 20);      //BOUNDS OF INPUT BOX

tf3.addKeyListener(new KeyAdapter(){ //validation
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "ONLY NUMBERS ARE ALLOWED!");
                    tf3.setText(" ");
                }
            }
});

l5 = new JLabel("EMAIL ID :");       //LABEL FOR EMAIL ID
l5.setBounds(50, 300, 250, 20);
tf4 = new JTextField();
tf4.setBounds(250, 300, 250, 20);        //BOUNDS OF INPUT BOX

l6 = new JLabel("CONTACT NUMBER :");
l6.setBounds(50, 350, 250, 20);          //LABEL OF CONTACT NUMBER
tf5 = new JTextField();
tf5.setBounds(250, 350, 250, 20);     //BOUNDS OF INPUT BOX

tf5.addKeyListener(new KeyAdapter(){ //validation
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "ONLY NUMBERS ARE ALLOWED!");
                    tf5.setText("");
                }
            }
});

l7 = new JLabel("ADDRESSE :");       //LABEL FOR ADDRESS
l7.setBounds(50, 400, 250, 20);            
area1 = new JTextArea();                
area1.setBounds(250, 400, 250, 30);        //BOUNDS OF TEXTAREA BOX


l9 = new JLabel("TICKET :");            //LABEL FOR TICKET
l9.setBounds(50, 500, 250, 20);

JRadioButton r5= new JRadioButton("SINGLE TICKET ");              // SELECTING SINGLE OR RETURN TICKET
JRadioButton r6= new JRadioButton("RETURN TICKET");

r5.setBounds(250, 500, 150, 30);
r6.setBounds(400, 500, 150, 30);           //BOUNDS OF RADIO BUTTONS

ButtonGroup bg = new ButtonGroup();      
bg.add(r5);                        //ADDING BUTTONS INTO FRAME
bg.add(r6);

l10 = new JLabel("NATIONALITY :");         //LABEL FOR NATIONALITY
l10.setBounds(50, 550, 250, 20);        
tf6 = new JTextField();
tf6.setBounds(250, 550, 250, 20);     //BOUNDS OF INPUT BOX

tf6.addKeyListener(new KeyAdapter(){ //validation
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isLetter(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "ONLY LETTERS ARE ALLOWED!");
                    tf6.setText(" ");
                }
            }
});



l11 = new JLabel("DEPARTURE POINT :");   //SELECTING DEPARTURE PLACE
l11.setBounds(50, 600, 250, 20);

String departure[]= { "EAST TERMINAL", "CHAKLALA AIRPORT", "ISLAMABAD INTERNATIONAL AIRPORT",
    "ALLAMA IQBAL INTERNATIONAL AIRPORT","JINNAH INTERNATIONAL AIRPORT" };    

cb1= new JComboBox(departure);
cb1.setBounds(250, 600, 290, 20);


l12 = new JLabel("DESTINATION :");   //SELECTING PLACE FOR TOUR
l12.setBounds(50, 650, 250, 20);

String destination[]= { "PAKISTAN-4 DAYS IN MURREE","PAKISTAN-5 DAYS IN AZAD KASHMIR",
    "PAKISTAN-6 DAYS IN SWAT","PAKISTAN-5 DAYS IN HUNZA" };
cb2 = new JComboBox(destination);
cb2.setBounds(250, 650, 290, 20);

l13 = new JLabel("NO OF PEOPLE :");   //ENTER NUMBER OF PEOPLE
l13.setBounds(50, 700, 250, 20);
tf7 = new JTextField();               //BOUNDS OF INPUT BOX
tf7.setBounds(250, 700, 250, 20);

tf7.addKeyListener(new KeyAdapter(){ //validation
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "ONLY NUMBERS ARE ALLOWED!");
                    tf7.setText("");
                }
            }
});

l14 = new JLabel("BOOKING DATE :");        //WRITE DATE
l14.setBounds(50, 750, 250, 20);
JFormattedTextField tf8 = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));

tf8.setValue(new Date());
//tf8 = new JTextField();                       //BOUNDS OF INPUT BOX
tf8.setBounds(250, 750, 250, 20);

ImageIcon i2 = new ImageIcon("2.png");
JLabel l15= new JLabel("", i2, JLabel.CENTER);


l8 = new JLabel("@@@@@@@@@@@@--TAXES--@@@@@@@@@@@@@@@");   //SELECT NO. OF PEOLE
l8.setBounds(50, 800, 400, 20);

rb1 = new JRadioButton("AIR TAX PAID");
rb1.setBounds(50, 850, 200, 20);   //TAX

rb2 = new JRadioButton("AIR MILES OVER");
rb2.setBounds(250, 850, 250, 20);   //TAX

ButtonGroup bg1 = new ButtonGroup();

bg1.add(rb1);           //ADDING BUTTONS TO FRAME FOR TAX
bg1.add(rb2);

rb3 = new JRadioButton("TRAVELING INSURANCE PAID");
rb3.setBounds(50, 900, 200, 20);

rb4 = new JRadioButton("EXTRA LUGGAGE");
rb4.setBounds(250, 900, 250, 20);

ButtonGroup bg2 = new ButtonGroup();
bg2.add(rb3);            
bg2.add(rb4);


JButton Receipt= new JButton("Generate Receipt"); //THIS BUTTON GENERATES RECEIPT
Receipt.setBounds(600, 250, 150, 30);
JButton b2 = new JButton("Reset");      //RESET BUTTON WILL RESET FORM
b2.setBounds(750, 250, 150, 30);
JButton Print = new JButton("Print");  //PRINT BUTTON WILL PRINT YOUR GENERATED RECEIPT
Print.setBounds(900, 250, 150, 30);

area2 = new JTextArea();              //AREA WHERE RECEIPT WILL BE PRINTED
area2.setBounds(600, 290, 560, 340);

//ADDING ALL THINGS INTO RECEIPT
//-------------------------------
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);    
add(l11);
add(l12);
add(l13);
add(l14);
add(tf1);
add(tf2);
add(tf3);
add(tf4);
add(tf5);
add(tf6);
add(tf7);
add(tf8);
add(area1);
add(area2);
add(l15);
add(rb1);
add(rb2);
add(rb3);
add(rb4);
add(r5);
add(r6);
add(cb1);
add(cb2);
add(Receipt);
add(b2);
add(Print);



// Reset the text fields
b2.addActionListener(
new ActionListener() {
public void actionPerformed(
ActionEvent e)
{
area2.setText("");
area1.setText(" ");
tf1.setText("");
tf2.setText("");
tf3.setText("");
tf4.setText("");
tf5.setText("");
tf6.setText("");


                                     
                                       
}
});

// Implementing the Print action
Print.addActionListener(
new ActionListener() {
public void actionPerformed(ActionEvent e){
    try {
        area2.print();
    }
    catch (java.awt.print.PrinterException a) {
        System.err.format("NoPrinter Found",a.getMessage());
    }
}});

// Generating the receipt
Receipt.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){
        area2.setText("------------------------------------"+ "-----------TOUR RECEIPT--------"+ "----------------------------------"+ "----------------------------------"+ "------------------------------\n");
        area2.setText(area2.getText()
                + "FIRST NAME : "
                + tf1.getText()
                + "\n");
        area2.setText(area2.getText()
                + "SECOND NAME : "
                + tf2.getText()
                + "\n");
        area2.setText(area2.getText()
                + "CNIC NO : "
                + tf3.getText()
                + "\n");
        area2.setText(area2.getText()
                + "EMAIL ID : "
                + tf4.getText()
                + "\n");
        area2.setText(area2.getText()
                + "CONTACT NUMBER : "
                + tf5.getText()
                + "\n");
        area2.setText(area2.getText()
                + "NATIONALITY : "
                + tf6.getText()
                + "\n");
        area2.setText(area2.getText()
                + "DEPARTURE : "
                + cb1.getSelectedItem()
                + "\n");
        area2.setText(area2.getText()
                + "DESTINATION : "
                + cb2.getSelectedItem()
                + "\n");
        area2.setText(area2.getText()
                + "AMOUNT SHOULD BE PAID : "
                +Integer.parseInt(tf7.getText())* 50000
                + "\n");
        area2.setText(area2.getText()
                + "BOOKING DATE : "
                + tf8.getText()
                + "\n");
       
        if (rb1.isSelected()) {
            area2.setText(area2.getText() + "TAXES PAID : "+ "AIRPORT TAX PAID \n");
        }
        if (rb2.isSelected()) {
            area2.setText(area2.getText()+ "TAXES PAID : "+ "AIR MILES OVER 2000 \n");
        }
        if (rb3.isSelected()) {area2.setText(area2.getText()+ "MORE TAXES : "+ "TRAVELING INSURANCE PAID \n");
        }
        if (rb4.isSelected()) {
            area2.setText(area2.getText()+ "MORE TAXES : "+ "EXTRA LUGGAGE \n");
        }
        if (e.getSource() == Receipt) {
            try {
                FileWriter fw= new FileWriter("java.txt", true);
                fw.write(area2.getText());
                fw.close();
            }
            catch (IOException ae) {
                System.out.println(ae);
            }
        }
        JOptionPane.showMessageDialog(area2, "DATA SAVED SUCCESSFULLY");
    };
});
addWindowListener(new WindowAdapter() {
    //WONDOW WILL BE CLOSED ON EXITED
    @Override
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
});
setSize(1200, 1200);
setLayout(null);
setVisible(true);
setBackground(Color.LIGHT_GRAY);
}    
    public static void main(String[] args){
        TRAVELLING t = new TRAVELLING();
        t.recipt();
    }
}
