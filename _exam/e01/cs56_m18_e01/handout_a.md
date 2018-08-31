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


<h2 markdown="1" class="page-break-before">Handout A, p. 2</h2>

<h2>Useful Reference Items related to Sorting</h2>

Here are a few reminders of things we discussed in class, but that you might
reasonably need a "reference" for if you were using them in the real world.

The interface `java.util.Comparator<T>` includes the following
method signature:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `int` | `compare(T o1, T o2)` |  Compares its two arguments for order. <br>Returns a negative integer, zero, or a positive integer <br>as the first argument is less than, equal to, or greater than the second.  |

</div>

The interface `java.lang.Comparable<T>` includes the following
method signature:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `int` | `compareTo(T o)` | Compares this object with the specified object for order. <br>Returns a negative integer, zero, or a positive integer <br>as this object is less than, equal to, or greater than the specified object.|

</div>


The class `java.util.ArrayList<E>` includes this method:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `void` | `sort(Comparator<? super E> c)` | Sorts this list according to the order induced by the specified `Comparator`. |

</div>




<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

The class `java.util.Collections` contains the following static method:

|`static <T extends Comparable<? super T>> void` |  `sort(List<T> list)` | Sorts the specified list into ascending order, <br>according to the natural ordering of its elements. |

</div>

The classes `java.lang.String` and `java.lang.Double` implement `Comparable<String>` and `Comparable<Double>`, each in the
way that you would expect.

# Other potentially useful methods

In `java.lang.Integer`:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">


|`public static int` | `compare(int i1, int i2)` |  Compares the two specified int values.  <br> The sign of the int value returned <br>matches the contract of the `compare` method in `java.util.Comparator` |


</div>

## `Main.java`

<style>
div.main-dot-java {
		  font-size: 120%;
		  line-height: 110%;
}

</style>
<div class="main-dot-java" markdown="1">

{% highlight java linenos %}
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(new Student("Chris Lee",1234567,"CMPSC"));
	al.add(new Student("Chris Lee",7654321,"CMPEN"));
	al.add(new Student("Taylor Wu",2468013,"MATH"));
	al.add(new Student("Jim Cortez",2468013,"CMPSC"));
	al.add(new Student("Fred Smith",2468013,"CMPEN"));
	// etc.

	// sort by perm  FILL IN BLANK BELOW ON EXAM PAPER
	
	al.sort( __________________________________ );
	System.out.println(al);
    }
}
{% endhighlight %}

## Output of Main:

```
$ java Main
[[Chris Lee,1234567], [Taylor Wu,2468013], [Jim Cortez,2468013], [Fred Smith,2468013], [Chris Lee,7654321]]
$
```

</div>

