import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EditMenuHandler implements ActionListener {
	JFrame jframe; 
	
	public EditMenuHandler (JFrame jf) {
		jframe = jf;
	}

	   public void FileMenuHandler (JFrame jf) {
	      jframe = jf;
	   }
	   public void actionPerformed(ActionEvent event) {
	      String menuName = event.getActionCommand();
	      if (menuName.equals("Find"))
	         JOptionPane.showMessageDialog(null,"You clicked on Open"); 
	      else if (menuName.equals("Replace"))
	          JOptionPane.showMessageDialog(null,"You clicked on Quit"); 
	   } //actionPerformed
	
//	DateGUI dGUI;
//	
//	public EditMenuHandler (DateGUI d) {
//	      dGUI = d;;
//	}
//
//	public void FileMenuHandler (DateGUI d) {
//	      dGUI = d;
//	   }
//	   public void actionPerformed(ActionEvent event) {
//	      String menuName = event.getActionCommand();
//	      if (menuName.equals("Open"))
//	         JOptionPane.showMessageDialog(null,"You clicked on Open"); 
//	      else if (menuName.equals("Quit"))
//	          JOptionPane.showMessageDialog(null,"You clicked on Quit"); 
//	   } //actionPerformed
//	   
	  

}
