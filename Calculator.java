import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{
    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton addbtn,subbtn,mulbtn,divbtn,dcbtn,delbtn,eqlbtn,clrbtn;
    JButton buttons[]=new JButton[10];
    JButton opebtn[]=new JButton[8];
    double num1=0,num2=0,result=0;
    char operator;
    Font myfnt=new Font("Default", Font.BOLD, 30);

     Calculator(){
        frame =new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        textField =new JTextField();
        textField.setBounds(50, 25, 300, 50);;
        textField.setEditable(false);
        textField.setFont(myfnt);
        addbtn=new JButton("+");
        subbtn=new JButton("_");
        mulbtn=new JButton("x");
        divbtn=new JButton("/");
        dcbtn=new JButton(".");
        delbtn=new JButton("⎚");
        eqlbtn=new JButton("=");
        clrbtn=new JButton("AC");
        
        opebtn[0]=addbtn;
        opebtn[1]=subbtn;
        opebtn[2]=mulbtn;
        opebtn[3]=divbtn;
        opebtn[4]=dcbtn;
        opebtn[5]=delbtn;
        opebtn[6]=eqlbtn;
        opebtn[7]=clrbtn;
        for(int i=0;i<8;i++){
            opebtn[i].addActionListener(this);
            opebtn[i].setFocusable(false);
        }
        
        for(int i=0;i<10;i++){
            buttons[i]=new JButton(String.valueOf(i));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        delbtn.setBounds(50, 430, 145, 50);
        clrbtn.setBounds(205, 430, 145, 50);

        panel=new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.add(buttons[1]);
        panel.add(buttons[2]);
        panel.add(buttons[3]);
        panel.add(addbtn);
        panel.add(buttons[4]);
        panel.add(buttons[5]);
        panel.add(buttons[6]);
        panel.add(subbtn);
        panel.add(buttons[7]);
        panel.add(buttons[8]);
        panel.add(buttons[9]);
        panel.add(mulbtn);
        panel.add(dcbtn);
        panel.add(buttons[0]);
        panel.add(eqlbtn);
        panel.add(divbtn);


        frame.add(panel);
        frame.add(delbtn);
        frame.add(clrbtn);
        frame.add(textField);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++){
            if(e.getSource()==buttons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==dcbtn){
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource()==clrbtn){
            textField.setText("");
        }
        if(e.getSource()==addbtn){
            num1=Double.parseDouble(textField.getText());
            operator='+';
            textField.setText("");
        }
        if(e.getSource()==subbtn){
            num1=Double.parseDouble(textField.getText());
            operator='-';
            textField.setText("");
        }
        if(e.getSource()==mulbtn){
            num1=Double.parseDouble(textField.getText());
            operator='x';
            textField.setText("");
        }
        if(e.getSource()==divbtn){
            num1=Double.parseDouble(textField.getText());
            operator='/';
            textField.setText("");
        }
        if(e.getSource()==eqlbtn){
            num2=Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                result=num1+num2;    
                    break;
                case '-':
                result=num1-num2;
                break;
                case 'x':
                result=num1*num2;
                break;
                case '/':
                result=num1/num2;
                break;
            }
            textField.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==delbtn){
           String del=textField.getText();
           textField.setText("");
           for(int i=0;i<del.length()-1;i++){
            textField.setText(textField.getText()+del.charAt(i));
           }
        }
    }
    
}