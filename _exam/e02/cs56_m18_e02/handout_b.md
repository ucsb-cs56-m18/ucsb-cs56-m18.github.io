---
layout: examHandoutNoName
num: e01
ready: true
desc: "Handout B"
qtr: M18
---

<style>

body {
 font-size: 72%;
 line-height: 102%;
}

td  {
  padding-left:5px; padding-right: 5px;
} 
</style>


<h2 markdown="1">class `java.util.ArrayList<E>`</h2>

<div style="font-size:90%; font-family: Arial Narrow, sans-serif;">

The following excerpts from the javadoc for `java.util.ArrayList<E>` may be
helpful to you in completing this exam.

Inheritance Hierarchy (complete)

```
java.lang.Object
  java.util.AbstractCollection<E>
    java.util.AbstractList<E>
      java.util.ArrayList<E>
```

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| All Implemented Interfaces: | `Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess` |
| Direct Known Subclasses: | `AttributeList, RoleList, RoleUnresolvedList` |

</div>

## Constructors (complete)

<div markdown="1" class="hanging-indent-table">

| `ArrayList()` | Constructs an empty list with an initial capacity of ten.
| `ArrayList(Collection<? extends E> c)` | Constructs a list containing the elements of the specified collection,<br>in the order they are returned by the collection's iterator. |
| `ArrayList(int initialCapacity)` | Constructs an empty list with the specified initial capacity. |

</div>

## Most important methods, with brief description

<div markdown="1" class="hanging-indent-table">

| `boolean` | `add(E e)` | Appends the specified element to the end of this list. |
| `void` | `add(int index, E element)` | Inserts the specified element at the specified position in this list. <br>Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).<br>throws `IndexOutOfBoundsException` if `(index < 0 || index > size())`|
| `void` | `clear()` | Removes all of the elements from this list.|
| `E` | `get(int index)` | Returns the element at the specified position in this list. |
| `int` | `indexOf(Object o)` | Returns the index of the first occurrence of the specified element in this list, <br>or -1 if this list does not contain the element. |
| `boolean` | `isEmpty()` | Returns true if this list contains no elements. |
| `int`	|  `lastIndexOf(Object o)` | Returns the index of the last occurrence of the specified element in this list,<br>or -1 if this list does not contain the element. |
| `E` | `remove(int index)` | Removes the element at the specified position in this list.|
| `boolean` | `remove(Object o)` | Removes the first occurrence of the specified element from this list, if it is present. |
| `E` | `set(int index, E element)` | Replaces the element at the specified position in this list with the specified element.<br>Returns the element previously at the specified position<br> throws `IndexOutOfBoundsException` if `(index < 0 || index >= size())`|
| `int` | `size()` | Returns the number of elements in this list. |
| `void` | `sort(Comparator<? super E> c)` | Sorts this list according to the order induced by the specified `Comparator`. |

</div>

## Additional methods, listed by method signature only.

<div markdown="1" class="hanging-indent-table">

| `boolean addAll(Collection<? extends E> c)` | `boolean	addAll(int index, Collection<? extends E> c)` |
| `Object   clone()` |  `boolean  contains(Object o)` |
| `void	   ensureCapacity(int minCapacity)` | `void forEach(Consumer<? super E> action)` |
| `Iterator<E> iterator()` | `ListIterator<E>  listIterator()` |
| `ListIterator<E> listIterator(int index)` | `boolean removeAll(Collection<?> c)` |
| `boolean removeIf(Predicate<? super E> filter)` | `protected void removeRange(int fromIndex, int toIndex)` |
| `void replaceAll(UnaryOperator<E> operator)` | `boolean retainAll(Collection<?> c)` |
| `Spliterator<E>  spliterator()` | `List<E> subList(int fromIndex, int toIndex)`
| `Object[] toArray()` | `<T> T[] toArray(T[] a)` |
| `void    trimToSize()` | |

</div>

## Methods inherited from:

<div markdown="1" class="hanging-indent-table">

| `class java.util.AbstractList` | `equals, hashCode` |
| `class java.util.AbstractCollection` | `containsAll, toString` |
| `class java.lang.Object` | `finalize, getClass, notify, notifyAll, wait, wait, wait` |
| `interface java.util.List` |  `containsAll, equals, hashCode` |
| `interface java.util.Collection` |  `parallelStream, stream` |

</div>
</div>

<h2 class="page-break-before">Unit tests for LotteryPick</h2>


{% highlight java linenos %}
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LotteryPickTest {

    @Test
    public void test_sortNumbers() {
	LotteryPick lp = new LotteryPick(new int [] {15,2,7,3});
	lp.sortNumbers();
	assertEquals(new LotteryPick(new int [] {2,3,7,15}), lp);
    }
	    
    @Test
    public void test_unique_1() {
	LotteryPick lp = new LotteryPick(new int [] {3,5,3,7});
	assertFalse(lp.unique());
	assertEquals(new LotteryPick(new int [] {3,3,5,7}), lp);	
    }

    @Test
    public void test_unique_2() {
	LotteryPick lp = new LotteryPick(new int [] {3,5,2,7});
	assertTrue(lp.unique());
	assertEquals(new LotteryPick(new int [] {2,3,5,7}), lp);	
    }

    @Test
    public void test_matches_1() {
	LotteryPick lp1 = new LotteryPick(new int [] {4,15,6,21,9,11});
	LotteryPick lp2 = new LotteryPick(new int [] {17,6,3,21,13,14});
	assertEquals(2, lp1.numMatched(lp2));
    }
	    
   @Test
    public void test_matches_2() {
	    LotteryPick lp1 = new LotteryPick(new int [] {3,6,9,12,15,18});
	    LotteryPick lp2 = new LotteryPick(new int [] {2,4,8,10,14,16});
	    assertEquals(0, lp1.numMatched(lp2));
   }

    @Test
    public void test_matches_3() {
	    LotteryPick lp1 = new LotteryPick(new int [] {3,6,9,12,15,18});
	    LotteryPick lp2 = new LotteryPick(lp1); // cheating :-)
	    assertEquals(6, lp1.numMatched(lp2));
    }

}

{% endhighlight %}