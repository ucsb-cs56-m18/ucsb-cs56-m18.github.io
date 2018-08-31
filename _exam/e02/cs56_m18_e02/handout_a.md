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
<h1 markdown="1" class="page-break-before">LotteryPick and LottoPick</h1>

The classes LotteryPick and LottoPick are both used to represent a set of numbers that
someone might choose for a lottery where numbered balls are chosen (e.g. 5 or 6 balls numbered 1-40, for example), and you win money depending on how many balls your picks match.

<h2 markdown="1">class `LotteryPick`</h2>

The class `LotteryPick` uses inheritance (extending `java.util.ArrayList<Integer>` to
implement the constructors and methods shown below in the excerpt of the javadoc.

(Contrast this with `LottoPick`, which uses composition instead, and is discusssed on the bottom
half of this page).

<div style="font-size:90%; font-family: Arial Narrow, sans-serif;">

Inheritance Hierarchy (complete)

```
java.lang.Object
  java.util.AbstractCollection<E>
    java.util.AbstractList<E>
      java.util.ArrayList<java.lang.Integer>
        LotteryPick
```

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| All Implemented Interfaces: | `java.io.Serializable, java.lang.Cloneable, java.lang.Iterable<java.lang.Integer>, java.util.Collection<java.lang.Integer>, java.util.List<java.lang.Integer>, java.util.RandomAccess` |

</div>

## Constructors (complete)

<div markdown="1" class="hanging-indent-table">

| `LotteryPick(int[] nums)` | Initialize from `int` array. |
| `LotteryPick(LotteryPick other)` | Initialize from another `LotteryPick`.<br> Example: `LotteryPick myPicks(otherPicks);` |



</div>

## Most important methods, with brief description

<div markdown="1" class="hanging-indent-table">

|`int`| `numMatched(LotteryPick other)` | Return the number of values matched, and as side effect sorts both this LotteryPick and the other passed as a param |
|`void`|`sortNumbers()` | Sort the numbers in ascending order |
|`boolean` | `unique()` | Return true if there are no duplicates, and as side effect, sorts numbers |

# Important Note

A Be aware that this class inherits from `java.util.ArrayList<Integer>`.  You have a summary of the javadoc for `java.util.ArrayList<Integer>` available to you on [Handout B](../handout_b)
</div>

<hr>
<hr>
<hr>

<h2  markdown="1">class `LottoPick`</h2>

The class `LottoPick` uses composition (it "has-a" `java.util.ArrayList<Integer>` as a private
data member)  to implement the constructors and methods shown below in the excerpt of the javadoc.

<div style="font-size:90%; font-family: Arial Narrow, sans-serif;">

Inheritance Hierarchy (complete)

```
java.lang.Object
  LottoPick
```

There are no implemented interfaces listed in the javadoc.


## Constructors (complete)

<div markdown="1" class="hanging-indent-table">

| `Lotto(int[] nums)` | Initialize from `int` array. |
| `LottoPick(LottoPick other)` | Initialize from another `LottoPick`.<br> Example: `LottoPick myPicks(other);` |



</div>

## Most important methods, with brief description

<div markdown="1" class="hanging-indent-table">


|`boolean`|`equals(java.lang.Object o)`|Override equals to compare picks.  Uses the implementation of `equals` from `java.util.ArrayList<Integer>`, thus order will matter. |
|`java.util.ArrayList<java.lang.Integer>`|`getPicks()`|return copy of wrapped `ArrayList<Integer> (not reference to original)`|
|`int`|`hashCode()`| returns `hashCode` value of wrapped `ArrayList` |
|`static int`|`numMatched(LottoPick first, LottoPick second)`|Return the number of values matched, and as side effect sorts numbers in both LottoPick objects|
|`void`|`sortNumbers()`|Sort the numbers in ascending order|
|`boolean`|`unique()` | Return true if there are no duplicates, and as side effect, sorts numbers |

# Important Note

Pay attention to the fact that the `numMatched` method is `static` in `LottoPick`. 
