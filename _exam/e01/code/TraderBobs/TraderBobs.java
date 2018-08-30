public class TraderBobs {
	
	public static void TB01 () {
		Beverage b1 = new Beverage(89,"Diet Coke",0,12.0);
		System.out.println("b1: " + b1.getCalories());
	}
	
	public static void TB02 () {
		Product p2 = new Beverage(99,"Coke",150,12.0);
		System.out.println("p2: " + p2.getName());
	}
	
	public static void TB03 () {
		Product p3 = new Beverage(199,"Milk",130,6.75);
		System.out.println("p3: " + p3.getCalories());
	}

	public static void TB04 () {
	  FreeCandy fc4 = new FreeCandy(25);
	  System.out.println("f4: " + f4.getCalories());
	}

	public static void TB05 () {
	  Edible e5 = new FreeCandy(10);
	  System.out.println("e5: " + e5.getCalories());
	}

	
	public static void TB05 () {
	  Edible e5 = new Edible(149);
	  System.out.println("e5: " + e5.getCalories());
	}

	public static void TB06 () {
       Food f6 = new Food(99,"Almonds",100,0.63);
       System.out.println("f6: " + r.getName());
	}

	public static void TB07 () {
       Edible e7 = new Food(249,"Kind Bar",200,1.4);
       System.out.println("e7: " + e7.getName());
	}

	public static void TB08 () {
		Food f8 = new Edible(199,"Gummi Bears",520,5);
		System.out.println("f8: " + f8.getPrice());
	}

	public static void TB09 () {
		Product p9 = new Product(299,"Ziploc Bags");
		System.out.println("p9: " + u.getPrice());
	}
	
	public static void TB10 () {
		Edible e10 = new Edible(){
				public int getCalories() { return 300; }
			};
		System.out.println("e10: " + e10.getCalories());     
	}

  public static void main (String [] args) {
	  System.out.println("TB01");TB01();
	  System.out.println("TB02");TB02();
	  System.out.println("TB03");TB03();
	  System.out.println("TB04");TB04();
	  System.out.println("TB05");TB05();
	  System.out.println("TB06");TB06();
	  System.out.println("TB07");TB07();
	  System.out.println("TB08");TB08();
	  System.out.println("TB09");TB09();
	  System.out.println("TB10");TB10();
  } 
} 
