---
layout: examHandoutNoName
num: e01
ready: true
desc: "Handout D"
qtr: W18
---

<style>
 body { font-size: 70%;
 line-height: 101%;

}

 td  {
  padding-left:5px; padding-right: 5px;
}
</style>

<h2>LotteryPick.java with blanks</h2>

<b> NOTE: ANSWER ON THE EXAM PAPER, NOT THIS SHEET! </b>

{% highlight java linenos %}
import java.util.ArrayList;

public class LotteryPick extends ArrayList<Integer> {

    public LotteryPick(LotteryPick other) {
	// use superclass constructor
	// in form ArrayList(Collection<? extends E> c) 
	_____________________________
    }

    public LotteryPick(int [] nums) {
        ____________________________
	for (int i: nums) {
	    __________________
	}
	_______________________
    }

    public void sortNumbers() {
	// do it with one line of code,
	// taking advantage of the fact that
	// java.lang.Integer implements Comparable<Integer>

        ___________________________________
    }

    public boolean unique() {
	this.sortNumbers();
	
	for (__________; ___________; ________) {
	    if (this.get(i) == this.get(i-1))
	       __________________
	}
	
	_______________
    }

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
	
        _______________
	for (int i=1; i<merged.size(); i++) {
	    if (merged.get(i)==merged.get(i-1))
		dups ++;
	}

        _______________
    }
}

{% endhighlight %}

<h2 class="page-break-before" markdown="1">LottoPick.java with blanks</h2>

{% highlight java linenos %}
import java.util.ArrayList;
public class LottoPick {

    private ArrayList<Integer> picks;
    
    public LottoPick(LottoPick other) {
	// make sure to do a deep copy, not a shallow one
	// use one line of code
        _____________________________________________
    }

    public LottoPick(int [] nums) {
        ______________________________
	for (int i: nums) {	
	    ____________________
	}
        ________________________
    }

    public ArrayList<Integer> getPicks() {
        return new ArrayList<Integer>(this.picks);
    }
    
    public void sortNumbers() {
	// do it with one line of code,
	// taking advantage of the fact that
	// java.lang.Integer implements Comparable<Integer>
        ___________________________________________
    }

    public boolean unique() {
	_______.sortNumbers();
	for (int ______; _________; ________) {
	    if (picks.get(i) == picks.get(i-1))
		_________________
	}
	_______________
    }

    public static int numMatched(
    	   LottoPick first,
    	   LottoPick second) {
	if (!first.unique()) {
	    throw new IllegalArgumentException
	    	  ("this contains duplicates");
	}
	if (!second.unique()) {
	    throw new IllegalArgumentException
	    	  ("other contains duplicates");
	}

	// both now sorted; merge the two together, sort and count duplicates
	// HINT: LOOK AT THE IMPLEMENTATION in LotteryPick
	
	LottoPick merged = ______________
        _________________________________;

	merged.sortNumbers();
        __________________
	for (int i=1; i<merged.picks.size(); i++) {
	    if (merged.picks.get(i)==merged.picks.get(i-1))
		dups ++;
	}
        ____________________
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
{% endhighlight %}