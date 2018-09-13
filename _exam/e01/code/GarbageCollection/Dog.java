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
	
	Dog d1 = new Dog("Fido");
    	Dog d2 = new Dog("Ginger");
	Dog d3 = new Dog("Harry");
	Dog d4 = new Dog("Izzy");
	Dog d5 = new Dog("Jack");
	Dog d6 = d1;
	
	setBestInShow(d3);   gc(25);
	d1 = d4;             gc(26);
	d3 = d6;             gc(27);
	d1 = null;           gc(28);
	d2 = null;           gc(29);
	d3 = null;           gc(30);
	d4 = null;           gc(31);
	d5 = null;           gc(32);
	d6 = null;           gc(33);
	setBestInShow(null); gc(34);
    }


    public void finalize() {
	System.out.println("Finalizing " + this.name);
    }

    public static void gc(int i) {
	System.out.println("Line " + i);
	System.gc();
	System.runFinalization ();
	try {
	Thread.sleep(10);
	} catch (Exception e) {}
	System.gc();
	System.runFinalization ();
    }
        
}
