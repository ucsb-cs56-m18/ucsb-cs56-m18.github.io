---
layout: examHandoutNoName
num: e01
ready: true
desc: "Handout B"
qtr: W18
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

<h2 class="page-break-before">Code for Factors problems</h2>

<table>
<tr>
<td markdown="1" colspan="2">

## Contents of `AllFactors.java`

```java
public class AllFactors {
    public static void main(String [] args) {
	for (int i=1;i<=50;i++) {
	    Factors f = Factors.primeFactors(i);
	    System.out.println("i: " + i + " factors: " + f); 
	}
    }
}
```

</td>
</tr>

<tr>
<td markdown="1">

## Output of `main` from class `AllFactors`

```
i: 1 factors: [1]
i: 2 factors: [2]
i: 3 factors: [3]
i: 4 factors: [2, 2]
i: 5 factors: [5]
i: 6 factors: [2, 3]
i: 7 factors: [7]
i: 8 factors: [2, 2, 2]
i: 9 factors: [3, 3]
i: 10 factors: [2, 5]
i: 11 factors: [11]
i: 12 factors: [2, 2, 3]
i: 13 factors: [13]
i: 14 factors: [2, 7]
i: 15 factors: [3, 5]
i: 16 factors: [2, 2, 2, 2]
i: 17 factors: [17]
i: 18 factors: [2, 3, 3]
i: 19 factors: [19]
i: 20 factors: [2, 2, 5]
i: 21 factors: [3, 7]
i: 22 factors: [2, 11]
i: 23 factors: [23]
i: 24 factors: [2, 2, 2, 3]
i: 25 factors: [5, 5]
i: 26 factors: [2, 13]
i: 27 factors: [3, 3, 3]
i: 28 factors: [2, 2, 7]
i: 29 factors: [29]
i: 30 factors: [2, 3, 5]
i: 31 factors: [31]
i: 32 factors: [2, 2, 2, 2, 2]
i: 33 factors: [3, 11]
i: 34 factors: [2, 17]
i: 35 factors: [5, 7]
i: 36 factors: [2, 2, 3, 3]
i: 37 factors: [37]
i: 38 factors: [2, 19]
i: 39 factors: [3, 13]
i: 40 factors: [2, 2, 2, 5]
i: 41 factors: [41]
i: 42 factors: [2, 3, 7]
i: 43 factors: [43]
i: 44 factors: [2, 2, 11]
i: 45 factors: [3, 3, 5]
i: 46 factors: [2, 23]
i: 47 factors: [47]
i: 48 factors: [2, 2, 2, 2, 3]
i: 49 factors: [7, 7]
i: 50 factors: [2, 5, 5]
```

</td>
<td markdown="1">

<!-- <h2 markdown="1" class="page-break-before">Handout B Page 2</h2> -->

## Contents of `FactorsTest.java`

```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorsTest {

    @Test
    public void test_rlf() {
	Factors f = new Factors(new int [] {2,15});
	f.replaceLastFactor(3);
	assertEquals(new Factors(new int [] {2,3}), f);
    }
	    
    @Test
    public void test_af() {
	Factors f = new Factors(new int [] {2,3});
	f.addFactor(5);
	assertEquals(new Factors(new int [] {2,3,5}), f);
    }

    
    @Test
    public void test1() {
	Factors f = new Factors(new int [] {60});
	Factors expected = new Factors(new int [] {2,30});
	f.addNextFactor();
	assertEquals(expected, f);
    }

    @Test
    public void test2() {
	Factors f = new Factors(new int [] {2,30});
	Factors expected = new Factors(new int [] {2,2,15});
	f.addNextFactor();
	assertEquals(expected, f);
    }

    @Test
    public void test3() {
	Factors f = new Factors(new int [] {2,2,15});
	Factors expected = new Factors(new int [] {2,2,3,5});
	f.addNextFactor();
	assertEquals(expected, f);
    }

    @Test
    public void test4() {
	Factors f = new Factors(new int [] {2,2,3,5});
	Factors expected = new Factors(new int [] {2,2,3,5});
	f.addNextFactor();
	assertEquals(expected, f);
    }

    @Test
    public void test5() {
	Factors f = Factors.primeFactors(60);
	Factors expected = new Factors(new int [] {2,2,3,5});
	assertEquals(expected, f);
    }	    
}

```

</td>
</tr>
</table>

