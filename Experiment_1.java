import javax.swing.*;

public class Experiment_1 
{
   public static void main(String[] args)
   {
      int someNumber;
  
      someNumber = -7;
      someNumber = (someNumber-2)/3;
      JOptionPane.showMessageDialog(null, "someNumber is " + someNumber);
         
      // just some more stuff to demo / and %
      JOptionPane.showMessageDialog(null, "-7 divided by 2 is " 
         + (-7 / 2)  );
      JOptionPane.showMessageDialog(null, "-7 mod 2 is " 
         + (-7 % 2)  );
   }
}
   