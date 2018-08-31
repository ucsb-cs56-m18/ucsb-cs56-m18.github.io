import java.util.ArrayList;

public class Factors extends ArrayList<Integer> {

    public Factors(int [] nums) {
	for (int i: nums) {
	    this.add(i);
	}
    }
    
    /* Precondition: this object contains a list of factors
       computed from some number.  All but the last is guaranteed
       to be a prime number.

       Postcondition: If the last element is a prime number,
        return the same ArrayList, unchanged.

       Otherwise, take the last element, factor out one prime factor,
       and replace the last element with two elements; the prime
       factor, and the product of the remaining factors. 
     */
    
    public void addNextFactor() {
	int lastElement = 
	    this.get(this.size() - 1);
	// in special case where last element is 4, need <= lastElement/2 not < 2
	for (int i=2; i<=lastElement/2; i++) {
	    if (lastElement % i == 0) {
		this.replaceLastFactor(i);
		this.addFactor(lastElement/i);
		return;
	    }
	}
    }

    public static Factors primeFactors(int num) {
	Factors f = new Factors(new int []{num});
	int prevSize = 0;
	while ( f.size() != prevSize) {
	    prevSize = f.size();
	    f.addNextFactor();
	}
	return f;
    }

    /** replace last factor with the value i */
    public void replaceLastFactor(int i) {
	this.set(this.size()-1,i);
    }

    /**  add factor to end of list  */
    public void addFactor(int f) {
	this.add(f);
    }

    public static void main(String [] args) {
	int num=1;
	if (args.length < 1) {
	    System.err.println("Usage: java Factors num");
	    System.exit(1);
	}
	try {
	    num = Integer.parseInt(args[0]);
	} catch (NumberFormatException nfe) {
	    System.err.println("Oops, could not convert " + args[0]);
	    System.exit(1);
	}

	Factors f = primeFactors(num);
	System.out.println(f);
	
    }
}
