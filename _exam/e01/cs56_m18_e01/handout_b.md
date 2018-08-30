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

<h2 class="page-break-before">Java concepts related to sorting</h2>

<h2>Handout B, p. 1: Useful Reference Items</h2>

Here are a few reminders of things we discussed in class, but that you might
reasonably need a "reference" for if you were using them in the real world.

The interface `java.util.Comparator<T>` includes the following
method signature:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `int` | `compare(T o1, T o2)` | Compares this object with the specified object for order. <br>Returns a negative integer, zero, or a positive integer <br>as this object is less than, equal to, or greater than the specified object. |

</div>

The interface `java.lang.Comparable<T>` includes the following
method signature:

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| `int` | `compareTo(T o)` |  Compares its two arguments for order. <br>Returns a negative integer, zero, or a positive integer <br>as the first argument is less than, equal to, or greater than the second. |

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

