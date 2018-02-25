import java.awt.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Extends JFrame to create a GUI that appends the linked lists.
 * 
 *
 */
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


@SuppressWarnings("serial")
public class DateGUI extends JFrame{
	  /**
	 * this displays all my sorted and unsorted dates read in from the file on a window
	 */
	JFrame frame;
	Container myContentPane;
	static TextArea UnsortedDateList = new TextArea();
	static TextArea SortedDateList = new TextArea();
		
	   public void addSortedDateList(TreeMap<Date212, Integer> sorted){
		   Set set = sorted.entrySet(); 
		   Iterator i = set.iterator(); 
		   Map.Entry <Date212,Integer> me;

		   while(i.hasNext()) { 
		      me = (Map.Entry)i.next(); 
		      SortedDateList.append(me.getKey() + "\n");
	   } 
		// this method uses the TreeMap to display the dates in order on my GUI
		   
	   }
	   // dates as its read in from file; appending is done here
	   public void addUnsortedDateList(DateList UnsortedDateList){
		  DateGUI.UnsortedDateList.setText(UnsortedDateList.toString());
	   }
	   // dates after it has been sorted
	   
	   

	   public DateGUI (String title, int height, int width) {
	        setTitle (title);
	        setSize (400, 200);
	        setLocation (100, 100);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        createFileMenu();
	        myContentPane = getContentPane();
	        myContentPane.setLayout(new GridLayout (1,2));
	        myContentPane.add(UnsortedDateList);
	        myContentPane.add(SortedDateList);
	        SortedDateList.setEditable(false);
	        UnsortedDateList.setEditable(false);
	        setVisible(true);
	   }
	   
	   private void createFileMenu() {
		   JMenuItem item;
		   JMenuBar menuBar  = new JMenuBar();
		   JMenu fileMenu = new JMenu("File");
		   FileMenuHandler fmh  = new FileMenuHandler(this);

		   item = new JMenuItem("Open");    //Open...
		   item.addActionListener( fmh );
		   fileMenu.add( item );
	    	
		   fileMenu.addSeparator();           //add a horizontal separator line
	    	
		   item = new JMenuItem("Quit");       //Quit
		   item.addActionListener( fmh );
		   fileMenu.add( item );
		   
		   setJMenuBar(menuBar);
		   menuBar.add(fileMenu);
	}
	   
	   // displays sorted dates in one column and unsorted in another 

	
}


	
