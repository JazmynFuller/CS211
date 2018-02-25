/**
 * 
 * @author jazmynfuller
 *
 */
public class DateListIterator {
/** 
 * This class traverses throught the list
 */
	private DateNode node;
	
	public DateListIterator (DateNode first){
		node = first;
	}// constructor
	/**
	 * Checks if there are any other nodes in the list
	 * @return
	 */
	public boolean hasNext() {
		return (node != null);
	}
	public Date212 next() {
	      if (node == null)
	         throw new NullPointerException("Linked List is empty");
	      Date212 currentData = node.data;
	      node = node.next;
	      return currentData;
	}
}
