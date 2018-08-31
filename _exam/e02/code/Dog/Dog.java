public class Dog {
    
    private static Dog bestInShow = null;
    private String name;
    
    public static void setBestInShow(Dog b) {
	bestInShow = b;
    }
    
    public static Dog getBestInShow() {
	return bestInShow;
    }
    
    public Dog(String name) { this.name = name;}
    
    public static void main(String [] args) {
	
	Dog d1 = new Dog("Ace");
	Dog d2 = new Dog("Buddy");
	Dog d3 = new Dog("Coco");
	Dog d4 = new Dog("Daisy");
	Dog d5 = new Dog("Eddie");
	Dog d6 = d2;   gc();
	
	setBestInShow(d4);       gc();
	d4 = d1;                 gc();
	d2 = d3;                 gc();
	d6 = null;               gc();
	d5 = null;               gc();
	d4 = null;               gc();
	d3 = null;               gc();
	d2 = null;               gc();
	d1 = null;               gc();
	setBestInShow(null);     gc();
    }  
    
    
    public void finalize() {
	System.out.println("Finalizing: " + this.name);
    }
    
    public static void gc() {
	StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
	String where =
	    ste.getClassName() + " "
	    + ste.getMethodName()
	    + " " + ste.getLineNumber() + " ";
	System.out.println("Requesting gc at: " + where);
	System.gc(); System.runFinalization ();
	System.gc(); System.runFinalization ();
    
    }

}
