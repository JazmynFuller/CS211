/**
 * 
 * @author jazmynfuller
 * 
 */
import java.util.Comparator;


public class DateComparator implements Comparator<Date212> {
	public int compare(Date212 date1, Date212 date2) {
		return date1.compareTo(date2);
	} // Tells the TreeMap to compares dates 
}
