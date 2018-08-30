---
layout: examHandoutNoName
num: e01
ready: true
desc: "Handout A"
qtr: W18
---

<style>
 body { font-size: 72%;
 line-height: 102%;

}

 td  {
  padding-left:5px; padding-right: 5px;
}
</style>


##  Beverage.java
{% highlight java linenos %}
public class Beverage extends Product implements Edible {

    private int calories;
    private double fluidOunces;
    
    public Beverage(int price, String name, 
		int calories, double fluidOunces) {
	super(price, name);
	this.calories = calories;
	this.fluidOunces = fluidOunces;
    }

    public int getCalories() {return this.calories;}
    public double getFluidOunces() {return this.fluidOunces;}
}

{% endhighlight %}

## Edible.java

{% highlight java linenos %}
/** something that can be eaten */
public interface Edible {
    public int getCalories();
}
{% endhighlight %}


## Food.java

{% highlight java linenos %}
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
{% endhighlight %}


<div style="float:right; width:30%; border: 1px solid black;padding:2em; line-height:200%; text-align:center;">
<h1>Code for </h1><h1>`TraderBobs` problem</h1>
</div>

## FreeCandy.java

{% highlight java linenos %}
public class FreeCandy implements Edible {

    private int calories;
    
    public FreeCandy(int calories) { 
	this.calories = calories;
    }

    public int getCalories() {return this.calories;}
}
{% endhighlight %}



## Product.java


{% highlight java linenos %}
public abstract class Product {
    String name;
    int price;
    
    public int getPrice() { return price; } 
    public String getName() {return name;}

    public Product(int price, String name) {
	this.price = price;
	this.name = name;
    }
}
{% endhighlight %}

<h2 markdown="1" class="page-break-before">Partial source code for `Factors.java`</h2>

```java
import java.util.ArrayList;

public class Factors extends ArrayList<Integer> {

    public Factors(int [] nums) {
    

       ___________________________________________

       for (int i: nums) {

             ______________________________________

	}

       ___________________________________________
    }

    /* Precondition: this object contains a list of factors computed from some number.  
       All but the last is guaranteed to be a prime number, and the factors are in non-decreasing
       order (they stay the same, or go up, from lowest index to highest index.)   

       Postcondition: If the last element is a prime number,
        return the same ArrayList, unchanged.

       Otherwise, take the last element, factor out the lowest prime factor, and replace 
       the last element with two elements; the prime factor, and the product of the remaining
        factors. 
     */

    public void addNextFactor() {
	  int lastElement = 

		  ____________________________________
	  
	  // in special case where last element is 4, need <= lastElement/2 not < 2
	  for (int i=2; i<=lastElement/2; i++) {
	    if (lastElement % i == 0) {
	     	this.replaceLastFactor(i);
		    this.addFactor(lastElement/i);
		    return;
	    }
	  }
    }

	// NOTE: This method is complete and correct.
	// You don't need it except to understand the context of the other code
	
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

		_________________________________
    }

    /**  add factor to end of list  */
    public void addFactor(int f) {

	  _____________________________	
    }

}

```