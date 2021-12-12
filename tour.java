package travel;

//USEFUL IMPORTS
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;
import javafx.print.Printer;
import java.io.*;
import java.io.IOException;
 
//ABSTRACT CLASS (i.e also a principle) inherithing components from java swing/AWT
//----------------------------------------------------------------------------
abstract class travel extends Frame{
    abstract void recipt();  //abstract method
}
//CLASS A INHERITS ABSTRACT CLASS (INHERITENCE i.e another principle)
//------------------------------------------------------------------


class A extends travel{
   //encapsulating swings components by declearing them private
    //(ENCAPSULATION i.e third principle)
    //---------------------------------------------------------
   
    private JLabel l1, l2, l3, l4,
l5, l6, l7, l8,
l9, l10, l12, l13,
l14, l11, l15;

private JTextField tf1, tf2, tf3,
tf4, tf5, tf6,
tf7, tf8, tf9,
tf10;

private JTextArea area2, area1;

private JRadioButton rb1, rb2, rb3,
rb4, rb5, rb6,
rb7;

private JFileChooser f1;
        JComboBox cb1,cb2,cb;

   //OVERRIDING METHOD (POLYMORPISM i.e 4th principle)
  //--------------------------------------------------
       
    @Override
    void recipt(){
       
l1 = new JLabel("=========TRAVEL MANAGEMENT SYSTEM==============="); //MAIN LABEL
l1.setBounds(350, 100, 450, 50);

l2 = new JLabel(
"FIRST NAME :");          //WRITE FIRST NAME
l2.setBounds(50, 150, 250, 20);

tf1 = new JTextField();
tf1.setBounds(250, 150, 250, 20);    //BOUNDS OF INPUT BOX

l3 = new JLabel(
"SECOND NAME :");       //ENTER SECOND NAME
l3.setBounds(50, 200, 250, 20);  

tf2 = new JTextField();              
tf2.setBounds(250, 200, 250, 20);     //BOUNDS OF INPUT BOX

l4 = new JLabel("POST CODE :");       //ENTER POST CODE
l4.setBounds(50, 250, 250, 20);

tf3 = new JTextField();
tf3.setBounds(250, 250, 250, 20);      //BOUNDS OF INPUT BOX

l5 = new JLabel("EMAIL ID :");       //LABEL FOR EMAIL ID
l5.setBounds(50, 300, 250, 20);

tf4 = new JTextField();
tf4.setBounds(250, 300, 250, 20);        //BOUNDS OF INPUT BOX

l6 = new JLabel("CONTACT NUMBER :");
l6.setBounds(50, 350, 250, 20);          //LABEL OF CONTACT NUMBER


tf5 = new JTextField();
tf5.setBounds(250, 350, 250, 20);     //BOUNDS OF INPUT BOX

l7 = new JLabel("ADDRESSE :");       //LABEL FOR ADDRESS
l7.setBounds(50, 400, 250, 20);            

area1 = new JTextArea();                
area1.setBounds(250, 400, 250, 90);        //BOUNDS OF TEXTAREA BOX

l9 = new JLabel("TICKET :");            //LABEL FOR TICKET
l9.setBounds(50, 500, 250, 20);

JRadioButton r5                      // SELECTING SINGLE OR RETURN TICKET
= new JRadioButton("SINGLE ");
JRadioButton r6
= new JRadioButton("RETURN ");

r5.setBounds(250, 500, 100, 30);
r6.setBounds(350, 500, 100, 30);           //BOUNDS OF RADIO BUTTONS

ButtonGroup bg = new ButtonGroup();      
bg.add(r5);                        //ADDING BUTTONS INTO FRAME
bg.add(r6);

l10 = new JLabel("NATIONALITY :");         //LABEL FOR NATIONALITY
l10.setBounds(50, 550, 250, 20);        

tf6 = new JTextField();
tf6.setBounds(250, 550, 250, 20);     //BOUNDS OF INPUT BOX

l11 = new JLabel("DEPARTURE POINT :");   //SELECTING DEPARTURE PLACE
l11.setBounds(50, 600, 250, 20);

String language[]= { "EAST TERMINAL", "CHAKLALA AIRPORT", "ISLAMABAD INTERNATIONAL AIRPORT",
    "ALLAMA IQBAL INTERNATIONAL AIRPORT","JINNAH INTERNATIONAL AIRPORT" };    

cb1= new JComboBox(language);

cb1.setBounds(250, 600, 290, 20);
    // cb1 = new JTextField();
//cb1.setBounds(250, 550, 250, 20);

l12 = new JLabel("DESTINATION :");   //SELECTING PLACE FOR TOUR
l12.setBounds(50, 650, 250, 20);

String languagess[]= { "PAKISTAN-4 DAYS IN MURREE","PAKISTAN-5 DAYS IN AZAD KASHMIR",
    "PAKISTAN-6 DAYS IN SWAT","PAKISTAN-5 DAYS IN HUNZA" };

l13 = new JLabel("CNIC NUMBER :");   //ENTER CNIC NUMBER
l13.setBounds(50, 700, 250, 20);

tf7 = new JTextField();               //BOUNDS OF INPUT BOX
tf7.setBounds(250, 700, 250, 20);

l14 = new JLabel("BOOKING DATE :");        //WRITE DATE
l14.setBounds(50, 750, 250, 20);

tf8 = new JTextField();                       //BOUNDS OF INPUT BOX
tf8.setBounds(250, 750, 250, 20);

ImageIcon i2 = new ImageIcon("2.png");
JLabel l15= new JLabel("", i2, JLabel.CENTER);

cb2 = new JComboBox(languagess);

cb2.setBounds(250, 650, 290, 20);
l8 = new JLabel("NO OF PEOPLE :");   //SELECT NO. OF PEOLE
l8.setBounds(800, 150, 250, 20);

rb1 = new JRadioButton("ATP");
rb1.setBounds(550, 150, 100, 30);   //TAX

rb2 = new JRadioButton("AOV");
rb2.setBounds(650, 150, 100, 30);   //TAX

ButtonGroup bg1 = new ButtonGroup();

bg1.add(rb1);           //ADDING BUTTONS TO FRAME FOR TAX
bg1.add(rb2);

rb3 = new JRadioButton("TIP");
rb3.setBounds(550, 200, 100, 30);

rb4 = new JRadioButton("EL");
rb4.setBounds(650, 200, 120, 30);

ButtonGroup bg2 = new ButtonGroup();
bg2.add(rb3);            
bg2.add(rb4);

String languages[]= { "2", "4", "6","8", "12" };  
final JComboBox cb= new JComboBox(languages);  //SELECT NUMBER OF PEOPLE
cb.setBounds(800, 200, 90, 20);

final JLabel label= new JLabel();
label.setBounds(600, 430, 500, 30);      
JButton b = new JButton("SHOW");      //SHOW BUTTON
b.setBounds(1000, 300, 80, 30);

final DefaultListModel<String> li1= new DefaultListModel<>();

li1.addElement("2(1, 50, 000)");       //TOTAL AMOUNTS AS PER PERSONS
li1.addElement("4(3, 00, 000)");
li1.addElement("6(4, 50, 000)");
li1.addElement("8(6, 00, 000)");
li1.addElement("12(7, 50, 000)");

final JList<String> list1
= new JList<>(li1);

list1.setBounds(600, 300, 125, 125);

DefaultListModel<String> li2
= new DefaultListModel<>();

li2.addElement("2 SHARE(75,000)");    //SHARE PER PERSON
li2.addElement("4 SHARE(37,500)");  
li2.addElement("6 SHARE(25,000)");
li2.addElement("8 SHARE(16,750)");
li2.addElement("12 SHARE(12,500)");
li2.addElement("NONE(0,0)");

final JList<String> list2= new JList<>(li2);
list2.setBounds(800, 300, 125, 125);
JButton Receipt= new JButton("Generate Receipt"); //THIS BUTTON GENERATES RECEIPT
Receipt.setBounds(600, 490, 150, 30);
JButton b2 = new JButton("Reset");      //RESET BUTTON WILL RESET FORM
b2.setBounds(750, 490, 150, 30);
JButton Print = new JButton("Print");  //PRINT BUTTON WILL PRINT YOUR GENERATED RECEIPT
Print.setBounds(900, 490, 150, 30);

area2 = new JTextArea();              //AREA WHERE RECEIPT WILL BE PRINTED
area2.setBounds(600, 540, 560, 340);


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
add(cb);
add(cb1);
add(cb2);
add(list1);
add(list2);
add(b);
add(label);
add(Receipt);
add(b2);
add(Print);

b.addActionListener(new ActionListener() {

// Method to display the data
// entered in the text fields
@Override
//DEAILS WILL BE SHOWEN WHEN CLICKED ON SHOW
public void actionPerformed(ActionEvent e){
    String data = "";
    if (list1.getSelectedIndex() != -1) {
        data = "NO OF PEOPLE SELECTED :"+ list1.getSelectedValue();
        label.setText(data);
    }
    if (list2.getSelectedIndex() != -1) {
        data += " AND TRAVEL "+ "CHARGES OF: ";
        for (Object frame :list2.getSelectedValues()) {
            data += frame + " ";
        }
    }
    label.setText(data);
}
}
);
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
                + "POST CODE : "
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
                + "CNIC NUMBER : "
                + tf7.getText()
                + "\n");
        area2.setText(area2.getText()
                + "BOOKING DATE : "
                + tf8.getText()
                + "\n");
        area2.setText(area2.getText()
                + "NO OF PEOPLE : "
                + cb.getSelectedItem().toString()
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
        area2.setText(area2.getText()+ "PRICES : "+ list1.getSelectedValue().toString()+ "\n");
        area2.setText(area2.getText()+ "PRICES : "+ list2.getSelectedValue().toString()+ "\n");
        int index2 = list2.getSelectedIndex();
        if (index2 == 0) {
            area2.setText(area2.getText()+ "TAXES INCLUDE/DETECTED :\n"+ "TOTAL AMOUNT TO BE "+ "PAID IS 2 LAKHS \n");
        }
        if (index2 == 1) {
            area2.setText(area2.getText()+ "TAXES INCLUDE/DETECTED :\n"+ "TOTAL AMOUNT TO BE "+ "PAID IS 3,34,000 \n");
        }
        if (index2 == 2) {
            area2.setText(area2.getText()+ "TAXES INCLUDE/DETECTED :\n"+ "TOTAL AMOUNT TO BE PAID IS "+ "470,000 \n");
        }
        if (index2 == 3) {
            area2.setText(area2.getText()+ "TAXES INCLUDE/DETECTED :\n"+ "TOTAL AMOUNT TO BE PAID "+ "IS 612,500 \n");
        }
        if (index2 == 4) {
            area2.setText(area2.getText()+ "TAXES INCLUDE/DETECTED :\n"+ "TOTAL AMOUNT TO BE PAID "+ "IS 7,60,000 \n");
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
setBackground(Color.lightGray);
}    
    public static void main(String[] args){
        A a = new A();
        a.recipt();
    }

   
    }
