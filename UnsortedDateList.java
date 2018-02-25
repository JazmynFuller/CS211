
public class UnsortedDateList extends DateList {

	public void add(Date212 tempDate){
		 DateNode n = new DateNode(tempDate);
		    tail.next = n;
		    tail = n;
        
			length++;
	}

	void insert(Date212 tempDate) {
		
	}

}
