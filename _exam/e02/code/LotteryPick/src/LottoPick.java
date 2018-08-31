import java.util.ArrayList;

public class LottoPick {

    private ArrayList<Integer> picks;
    
    /**
       Initialize from another LottoPick
       Example:
       <code>LottoPick myPicks(other);</code>

       @param other Numbers to add to lottery pick
    */
    public LottoPick(LottoPick other) {
	// make sure to do a deep copy, not a shallow one
	// use one line of code
	picks = new ArrayList<Integer>(other.picks);
    }

    /**
       Initialize from int array.
       Example:
       <code>LottoPick myPicks(new int[] {12, 23, 5, 13, 9, 22})</code>

       @param nums Numbers to add to lottery pick
    */
    public LottoPick(int [] nums) {
	picks = new ArrayList<Integer>();
	for (int i: nums) {
	    picks.add(i);
	}
    }

    public ArrayList<Integer> getPicks() {
        return new ArrayList<Integer>(this.picks);
    }
    
    /** Sort the numbers in ascending order */
    public void sortNumbers() {
	// do it with one line of code,
	// taking advantage of the fact that
	// java.lang.Integer implements Comparable<Integer>
	java.util.Collections.sort(picks);       
    }

    /** Return true if there are no duplicates, and as side effect, sorts numbers */	    
    public boolean unique() {
	this.sortNumbers();
	
	for (int i=1; i<picks.size(); i++) {
	    if (picks.get(i) == picks.get(i-1))
		return false;
	}
	
	return true;
    }

    /** Return the number of values matched, and as side effect
	sorts numbers in both LottoPick objects
     @param first first LottoPick value to compare
     @param second second LottoPick value to compare
     @return number of values matched
     @throws IllegalArgumentException if either this or other contains duplicates
    */
    public static int numMatched(LottoPick first, LottoPick second) {
	if (!first.unique()) {
	    throw new IllegalArgumentException("this contains duplicates");
	}
	if (!second.unique()) {
	    throw new IllegalArgumentException("other contains duplicates");
	}

	// both now sorted; merge the two together, sort and count duplicates
	LottoPick merged = new LottoPick(first);
	merged.picks.addAll(second.picks);

	merged.sortNumbers();
	int dups = 0;
	for (int i=1; i<merged.picks.size(); i++) {
	    if (merged.picks.get(i)==merged.picks.get(i-1))
		dups ++;
	}
	return dups;
    }

    @Override
    public boolean equals(Object o) {
	if (this == o) return true;
	if (o == null) return false;
	if (getClass() != o.getClass()) return false;
	LottoPick other = (LottoPick) o;
	return picks.equals(other.picks);	
    }
    
    public int hashCode() {
	return picks.hashCode();
    }
}
