/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter( ArrayList< String> usersData) {
	super( usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
	for (int i = 1;
	     i < elements.size();
	     i++) {
	    insertOne(i);
	};
    }
    
    private void insertOne( int numSorted) {
	String valueToInsert = elements.get(numSorted);
	int indexToCompare;
	for (indexToCompare = numSorted-1;
	     indexToCompare > -1 && elements.get(indexToCompare).compareTo(valueToInsert)>0;
	     indexToCompare--) {
	    elements.set( indexToCompare+1, elements.get(indexToCompare));
	}
	elements.set( indexToCompare+1, valueToInsert);
	System.out.println( elements + " numSorted: " + (numSorted+1));
    };
}
