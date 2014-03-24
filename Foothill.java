import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   
public class Foothill 
{
 
   public static void main(String[] args)
   {
      // establish main frame in which program will run
      TranspoFrame myTranspoFrame 
            = new TranspoFrame("Transporter Room");
      myTranspoFrame.setSize(300, 200);
      myTranspoFrame.setLocationRelativeTo(null);
      myTranspoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // show everything to the user
      myTranspoFrame.setVisible(true);
   }
}

// TranspoFrame class is derived from JFrame class
class TranspoFrame  extends JFrame
{
   private JButton btnMyButton;
   private JTextField txtMyTextArea;
   private JLabel lblMyLabel;
   
   // TranspoFrame constructor
   public TranspoFrame(String title)
   {
      // pass the title up to the JFrame constructor
      super(title);
      
      // set up layout which will control placement of buttons, etc.
      FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 5, 20); 
      setLayout(layout);
      
      // 3 controls: a label, a text field and a button
      lblMyLabel = new JLabel("Friend's Name: ");
      txtMyTextArea = new JTextField(10);
      btnMyButton = new JButton("Press Here to See Friend"); 
      add(lblMyLabel);
      add(txtMyTextArea);
      add(btnMyButton);
      btnMyButton.addActionListener( new SeeFriendListener() );
   }
   
   // inner class for JButton Listener
   class SeeFriendListener implements ActionListener
   {
      // event handler for JButton
      public void actionPerformed(ActionEvent e)
      {
         String strFriendName;
         
         strFriendName = txtMyTextArea.getText();
         if (strFriendName != null && strFriendName.length() >=2)
         {
            char first = strFriendName.charAt(0);
            if (Character.isLetter(first))
            {
               // good friend's name.  Now confirm
               JOptionPane.showMessageDialog(null, 
                  "Please wait while we locate " + strFriendName);
               return;
            }
         }
         
         // if we fall through they have unacceptable friend's name
         JOptionPane.showMessageDialog(null, 
            "Name must be at least two chars and start with letter.");
         return;
      }
   } // end inner class SeeFriendListener
} // end class TranspoFrame
