
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dog extends JFrame
{
    String breed;
    String tagNumber;
    String color;
    
    JButton okButton = new JButton();
    JButton exitButton = new JButton();
    
    JLabel firstLabel = new JLabel();
    JLabel secondLabel = new JLabel();
    JLabel thirdLabel = new JLabel();
    
    JTextField firstTextField = new JTextField();
    JTextField secondTextField = new JTextField();
    JTextField thirdTextField = new JTextField();
    
    public Dog (){
        setTitle("Dog Information");
        
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();
        
        okButton.setText("Ok");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 4;
        getContentPane().add(okButton, gridConstraints);
        
        okButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            okButtonActionPerformer(e);
            };
        });
        
        exitButton.setText("Exit");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 4;
        getContentPane().add(exitButton, gridConstraints);
        
        exitButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           exitButtonActionPerformer(e);
           };
        });
        
        firstLabel.setText("Breed");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        getContentPane().add(firstLabel, gridConstraints);
        
        secondLabel.setText("Tag Number");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        getContentPane().add(secondLabel, gridConstraints);
        
        thirdLabel.setText("Color");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        getContentPane().add(thirdLabel, gridConstraints);
        
        firstTextField.setText("");
        firstTextField.setColumns(10);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        getContentPane().add(firstTextField, gridConstraints);
        
        secondTextField.setText("");
        secondTextField.setColumns(3);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        getContentPane().add(secondTextField, gridConstraints);
      
        thirdTextField.setText("");
        thirdTextField.setColumns(10);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        getContentPane().add(thirdTextField, gridConstraints);
        
        addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            exitForm(e);   
         }  
        });
        pack();
    }
    
    private void exitForm(WindowEvent e){
      JFrame f = new JFrame();
      System.exit(0);
    }
    
    private void okButtonActionPerformer(ActionEvent e){
      JFrame f = new JFrame();
      breed = firstTextField.getText();
      tagNumber = secondTextField.getText();
      color = thirdTextField.getText();
      JOptionPane.showMessageDialog(f,"Breed: "+breed+"\nTag Number: "+tagNumber+"\nColor: "+color);
    }
    
    private void exitButtonActionPerformer(ActionEvent e){
      JFrame f = new JFrame();
      JOptionPane.showMessageDialog(f,"Exiting");
      System.exit(0);
    } 
   
    public static void main(String[] args){
        new Dog().show();
    }
}
