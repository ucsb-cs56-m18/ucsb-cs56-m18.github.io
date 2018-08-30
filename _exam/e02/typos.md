---
layout: defaultWithClock
<<<<<<< HEAD
num: e03
desc: "Midterm Exam typos/corrections/clarifications"
exam_date: 2018-03-21 12:00-8
exam_end: "2018-03-21 15:00-8"
---


{% include exam_clock.html %}

<div style="display:none; clear:both;">
http://ucsb-cs56-w18.github.io/exam/e03/typos/
</div>

## Typos:

* *p. 4, question 5, 1st paragraph*: ... you should refer to page <s>1</s> <b>2</b> of handout A...
* *p. 4, question 5, 2nd paragraph*: ... The both try to represent a set of <s>set of</s> numbers ...
* *p. 7, question 11, instructions*: "Fill in the code for this constructor from <s><tt>LotteryPick</tt></s> <tt>LottoPick</tt>
* *Handout A, p. 2*, Constructor for `LottoPick`: should be `LottoPick(int [] nums` NOT `Lotto(int [] nums)`

## Hints/Clarifications:

* Questions 7 and 10 are worth 4 pts each.  (There is an awkward line break that makes that hard to see.)
* *p. 9, question 14*: Immediately after `LottoPick merged=______`, yes, that is a second line of code right after it.
   So, these are two *separate* lines in which you may enter code:
   ```
   LottoPick merged = ______________________; // note added semicolon
   
   _________________________________________;
   ```
* `java.lang.Comparable<T>` is the interface that requires a class to implement `public int compareTo(T o)`
* `java.util.Comparator<T>` is the interface that requires a class to implement `public int compare(T o1, T o2)`
* `java.util.Collections.sort(List<T> list)` sorts according to "natural ordering".


## Notices

* YOU MAY RIP OFF HANDOUTS
* You may use **one sheet of notes** as usual.  Please write your name on it
* **No talking** during the exam.  Please put all questions in writing on the green sheet.

