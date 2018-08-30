---
layout: examHandoutNoName
num: e01
ready: true
desc: "Handout A"
qtr: M18
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

<h2 markdown="1" class="page-break-before">Handout A, Page 2</h2>

