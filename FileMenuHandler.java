import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.*;
import java.io.*;
import java.util.TreeMap;
/** 
 * @author jazmynfuller
 *
 */
public class FileMenuHandler implements ActionListener{
	// private static final int height = 0;
	// private static final int width = 0;

	DateGUI dGUI;
	// instatiate GUI
	
	/**
	 * Pass in DateGUI object so it can access public methods
	 */

	   public FileMenuHandler (DateGUI d) {
	      dGUI = d;
	   }
	   
	   public void actionPerformed(ActionEvent event) {
	      String menuName = event.getActionCommand();
	      if (menuName.equals("Open")){
	    	  openFile();
	      }   
	      else if (menuName.equals("Quit"))
	          System.exit(0); 
	   } //actionPerformed
	   
	   private void openFile(){
		      JFileChooser chooser = new JFileChooser();
		      FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt"); // filter to only .txt files 
		      chooser.setFileFilter(filter);
		      int returnVal = chooser.showOpenDialog(null);
		      if(returnVal == JFileChooser.APPROVE_OPTION) // if condition set by filter is met
		      readSource(chooser.getSelectedFile()); // read file
		      
	   } // openFile method
	   
	   /************************************************************************************************
	    * Read in from text file and add them to respective lists (sorted and unsorted).
	    * @param selectedFile
	    */
	   public void readSource(File selectedFile) {

	        // The name of the file to open.
	       String fileName = selectedFile.getName();

	        // This will reference one line at a time
	       String line = null;
	        try {
	            // FileReader reads text from the file
	            FileReader fileReader = new FileReader(fileName);

	            BufferedReader bufferedReader =  new BufferedReader(fileReader);
	            TreeMap<Date212, Integer> map = new TreeMap (new DateComparator()); //treeMap to Sort Dates
	            DateList unsorted = new UnsortedDateList(); // LinkedList for unsorted dates
	            
	            	 while((line = bufferedReader.readLine()) != null) {
	                 	String[] splited = line.split(",");
	                     for (String date : splited) {
	                      // if (Date212.check(date)) {	 
	                     	if (Date212.check(date)) {	
	                     		try {
	                     			Date212 tempDate = new Date212(date);
	                     			unsorted.add(tempDate);
	                     			map.put(tempDate, 1);
	                     		//passing validated dates from 212 into the linked list DateList and TreeMap
	                     		} // try
	                     		catch (IllegalDate212Exception e) {
	                     			System.err.println(e.toString() + "Invalid Dates");
	                     		}// catch
	                     	} // if
	                     } // for
	                 } // while
	                 
	                 dGUI.addSortedDateList(map);
	                 dGUI.addUnsortedDateList(unsorted);
	                 bufferedReader.close();
	                 // sends list to be displayed in the GUI 
	          } 
	        catch(FileNotFoundException ex) {
	        	JOptionPane.showMessageDialog(null, "Unable to open " + fileName+ ".");
	            System.out.println("Unable to open file '" + fileName + "'");                
	        }
	        catch(IOException ex) {
	        	JOptionPane.showMessageDialog(null, "Unable to read " + fileName + "!");
	            System.out.println("Error reading file '" + fileName + "'");                  
	        }
	    }
}
