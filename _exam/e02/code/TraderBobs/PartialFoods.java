public class PartialFoods {
    public static void main (String [] args) {

	/* [  ] */ Beverage a = new Beverage(99,"Coke",150,12.0);
	/* [  ] */ Edible b = new Beverage(89,"Diet Coke",0,12.0);
	/* [  ] */ Food c = new Food(249,"Kind Bar",200,1.4);
	/* [  ] */ //Edible d = new Edible(199,"Gummi Bears",520,5);
	/* [  ] */ FreeCandy e = new FreeCandy(25);
	/* [  ] */ Edible f = new FreeCandy(30);
	/* [  ] */ //Product g = new Product(299,"Ziploc Bags");
	/* [  ] */ //Product h = new FreeCandy(30);
	/* [  ] */ //Product i = new Product(299,"Ziploc Bags");
	/* [  ] */ Product j = new Beverage(79,"Pepsi",150,12.0);
	/* [  ] */ Product k = new Food(125,"Doritos",260,1.7);

	/* [  ] */ System.out.println("a: " + a.getCalories());
	/* [  ] */ //System.out.println("b: " + b.getPrice());
	/* [  ] */ //System.out.println("c: " + c.getFluidOunces());
	/* [  ] */ //System.out.println("d: " + d.getCalories());
	/* [  ] */ System.out.println("e: " + e.getCalories());
	/* [  ] */ //System.out.println("f: " + f.getName());
	/* [  ] */ //System.out.println("g: " + g.getName());
	/* [  ] */ //System.out.println("h: " + h.getPrice());
	/* [  ] */ //System.out.println("i: " + i.getName());
	/* [  ] */ //System.out.println("j: " + j.getCalories());
	/* [  ] */ //System.out.println("k: " + k.getWeight());
    }
}
