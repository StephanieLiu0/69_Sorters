/**
  Implement a selection sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter( ArrayList< String> usersData) {
	super( usersData);
    }


    /**
      precondition: given an ArrayList of Strings

      for elements at 0 to n-2 in the ArrayList,
      swap the element at the current index and
      the smallest element in the unsorted region

      postcondition: the ArrayList of Strings is sorted
     */
    public void mySort() {
	for (int i = 0;
	     i < elements.size()-1;
	     i++) {
	    elements.set( i,
			  elements.set( dweebIndex( i)
					, elements.get( i))
			  );
	    System.out.println( elements);
	}
    }

    private int dweebIndex( int startIndex) {
	int dweebAt = startIndex;
        String dweeb = elements.get( dweebAt);

	for (int i = startIndex;
	     i < elements.size();
	     i++) {
	    if (elements.get(i).compareTo(dweeb)<0) {
		dweeb = elements.get(i);
		dweebAt = i;
	     }
	}
	return dweebAt;
    }
}
