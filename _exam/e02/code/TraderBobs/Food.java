public class Food extends Product implements Edible {

    private int calories;
    private double weight;
    
    public Food(int price, String name, 
		int calories, double weight) {
	super(price, name);
	this.calories = calories;
	this.weight = weight;
    }

    public int getCalories() {return this.calories;}
    public double getWeight() {return this.weight;}
}
