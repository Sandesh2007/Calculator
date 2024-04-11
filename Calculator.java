import javax.swing.*;

import java.awt.Frame;
// import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton buttons[]=new JButton[10];
    JButton opebtn[]=new JButton[8];

    void Claculator(){
        frame =new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}