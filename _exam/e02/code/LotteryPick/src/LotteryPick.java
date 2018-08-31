import java.util.ArrayList;

public class LotteryPick extends ArrayList<Integer> {


    /**
       Initialize from another LotteryPick
       Example:
       <code>LotteryPick myPicks(otherPicks);</code>

       @param other Numbers to add to lottery pick
    */
    public LotteryPick(LotteryPick other) {
	// use superclass constructor
	// in form ArrayList(Collection<? extends E> c) 
	super(other); 
    }

    /**
       Initialize from int array.
       Example:
       <code>LotteryPick myPicks(new int[] {12, 23, 5, 13, 9, 22})</code>

       @param nums Numbers to add to lottery pick
    */
    public LotteryPick(int [] nums) {
	for (int i: nums) {
	    this.add(i);
	}
    }

    /** Sort the numbers in ascending order */
    public void sortNumbers() {
	// do it with one line of code,
	// taking advantage of the fact that
	// java.lang.Integer implements Comparable<Integer>
	java.util.Collections.sort(this);       
    }

    /** Return true if there are no duplicates, and as side effect, sorts numbers */	
    public boolean unique() {
	this.sortNumbers();
	
	for (int i=1; i<this.size(); i++) {
	    if (this.get(i) == this.get(i-1))
		return false;
	}
	
	return true;
    }

    /** Return the number of values matched, and as side effect
	sorts both this LotteryPick and the other passed as a param
     @param other Another LotteryPick value
     @return number of values matched
     @throws IllegalArgumentException if either this or other contains duplicates
    */
    public int numMatched(LotteryPick other) {
	if (!this.unique()) {
	    throw new IllegalArgumentException("this contains duplicates");
	}
	if (!other.unique()) {
	    throw new IllegalArgumentException("other contains duplicates");
	}

	// both now sorted; merge the two together, sort and count duplicates
	LotteryPick merged = new LotteryPick(this);
	merged.addAll(other);

	merged.sortNumbers();
	int dups = 0;
	for (int i=1; i<merged.size(); i++) {
	    if (merged.get(i)==merged.get(i-1))
		dups ++;
	}
	return dups;
    }
}
