import javax.swing.*;
import java.awt.*;
   
public class Transporter 
{
   public static void main(String[] args)
   {
      // establish main frame in which program will run
      JFrame frmMyWindow = new JFrame("Transporter Room");
      frmMyWindow.setSize(300, 200);
      frmMyWindow.setLocationRelativeTo(null);
      frmMyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // set up layout which will control placement of buttons, etc.
      FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 5, 20);   
      frmMyWindow.setLayout(layout);
      
      // 3 controls: a label, a text field and a button
      JLabel lblMyLabel = new JLabel("Friend's Name: ");
      JTextField txtMyTextArea = new JTextField(10);
      JButton btnMyButton = new JButton("Press Here to See Friend");

      // place your 3 controls into frame
      frmMyWindow.add(lblMyLabel);
      frmMyWindow.add(txtMyTextArea);
      frmMyWindow.add(btnMyButton);

      // show everything to the user
      frmMyWindow.setVisible(true);
   }
}