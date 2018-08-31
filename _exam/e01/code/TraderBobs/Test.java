public class Test {

	public static void main(String [] args) {
		Edible e  =  ()->200 ;

		Edible f = new Edible() {
				public int getCalories() { return 200; }
			};

	}

}
