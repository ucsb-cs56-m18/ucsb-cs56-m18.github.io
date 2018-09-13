public class TraderBobs {

    public static void TB11 () {
        Product p11 = new Product(199,"Bandaids");
        System.out.println("p11: " + p11.getPrice());
    }

    public static void TB12 () {
	Product p12 = new Beverage(399,"Root Beer",200,12.0);
        System.out.println("p12: " + p12.getCalories());
    }

    public static void TB13 () {
        Edible e13 = new FreeCandy(15);
        System.out.println("e13: " + e13.getCalories());
    }

    public static void TB14 () {
        Edible e14 = new Food(249,"Cottage Cheese",240,8.0);
        System.out.println("e14: " + e14.getWeight());
    }

    public static void TB15 () {
        Edible e15 = new Food(249,"Cottage Cheese",240,8.0);
        System.out.println("e15: " + e15.getWeight());
    }

    public static void TB16 () {
	Edible e16 = new Food(349,"Dill Pickles",100,16.0);
        System.out.println("e16: " + e16.getCalories());
    }

    public static void TB17 () {
	Edible e17 = new Edible() {
		public int getCalories() { return 10;}
	    };      
        System.out.println("e17: " + e17.getCalories());
    }

    public static void TB18 () {
        Food f18 = new Food(249,"Cottage Cheese",240,8.0);
        System.out.println("f18: " + f18.getName());
    }

    public static void TB19 () {
        Edible e19 = () -> 25;
        System.out.println("e19: " + e19.getCalories());
    }

    public static void main (String [] args) {
	System.out.println("TB11");TB11();
	System.out.println("TB12");TB12();
	System.out.println("TB13");TB13();
	System.out.println("TB14");TB14();
	System.out.println("TB15");TB15();
	System.out.println("TB16");TB16();
	System.out.println("TB17");TB17();
	System.out.println("TB18");TB18();
	System.out.println("TB18");TB18();
    } 
} 
