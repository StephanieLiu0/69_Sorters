/**
  Represent a subsort then merge operation for lists,
 */
import java.util.ArrayList;

public class SubSortThenMerge_Sorter extends Sorter {

    /**
      Construct an instance from a list of data
      which is to be subsorted then merged.
     */
    public SubSortThenMerge_Sorter ( ArrayList<String> list) {
        super(list);
    }

    public void mySort() {
	sortRange( 0, elements.size());
    }
    
    public void sortRange( int start, int end) {
	int boundary = (start+end+1)/2;

	if (boundary < end) {
	    sortRange( start, boundary);
	    sortRange( boundary, end);
	    new Merger( elements).merge( start, boundary, end);
	}
    }
}
