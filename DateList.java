/**
 * 
 * @author jazmynfuller
 * This class is responsible for append, insert and toString methods
 * only validated dates are being passed in
 */

public abstract class DateList{
	// declare first and last node, and length
	DateNode dl = new DateNode(null);
	protected DateNode head = null;
	protected DateNode tail = null;
	protected int length;
	
	public DateList() {
	    head = tail = new DateNode(null);
	    length = 0;
	}
	// Constructor
	
	public int getLength(){
		return length;
	}
	
	abstract void add(Date212 tempDate);
	
	abstract void insert(Date212 tempDate);
	
	
	public String toString(){
	      DateNode p = head.next;
	      String returnString = "";
	      while (p!=null){
	         returnString+=p.data + "\n";
	         p = p.next;
	      }
	      return returnString;
	}
	// puts dates in a string to be displayed and called on in DateGUI
	
	public DateListIterator reset () {
		return new DateListIterator(head.next);
	}
}