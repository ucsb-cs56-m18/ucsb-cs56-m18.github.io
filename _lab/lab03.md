---
layout: lab
num: lab03
ready: false
desc: "Testing and Sorting with Lambdas"
assigned: 2018-08-24 09:30
due: 2018-08-31 12:30
github_org: "ucsb-cs56-m18"
starter_repo: "https://github.com/ucsb-cs56-m18/STARTER_lab03"
last_before: "Midterm Exam E01"
---

In this lab:

-   using Maven instead of Ant
-   using packages
-   using lambdas to sort ArrayLists
-   writing your own JUnit tests
-   test coverage


## Working in a pair? Switch navigator/driver frequently and tradeoff who commits

If you are in your repo directory, and type git log at the command
line, you'll see a list of the commits for your repo.

Record that you are pairing on each commit message by putting the
initials of the pair partners at the start of the commit message.

E.g. If Selena Gomez is driving, and Justin Timberlake is
navigating, and you fixed a bug in your `getDanceMoves()` method, your
commit message should be `SG/JT fixed bug in getDanceMoves()`

We should see frequent switches between SG/JT and JT/SG.


Step-by-Step
============

# Step 0: Set up your repo

You may work individually or as a pair on this lab.  However, if you work as a pair, please:
* Work with someone *else* from your same team (i.e. someone else assigned to the same mentor as you)
* Work with someone *different* from who you worked with on lab02.
* Remember to name the repo correctly, and also to add your pair on Gradescope each time you submit

If there is some reason this is not feasible, please check with your mentor before starting.


Create your repo the same way you did for [lab01](/lab/lab01/) and [lab02](/lab/lab02/)
   * under the <tt>{{page.org}}</tt> organization
   * name should be <tt>{{page.num}}-githubid</tt> OR <tt>{{page.num}}-githubid1-githubid2</tt> as appropriate
   * private, and initially *empty* (no README.md, .gitignore or LICENSE).
   * add your pair partner as a collaborator
   
   

Clone this empty repo into your `~/cs56` directory, or wherever you prefer to work.

The starter code is in <{{page.starter_repo}}>.  Visit that page for the approrpiate URL to add the `starter` remote.

To add the starter as a remote, cd into the repo you cloned, then do:

<div>
<tt>git remote add starter {{page.starter_repo}} </tt>
</div>

Then do: 
```
git pull starter master
git push origin master
```

That should get you set up with the starter code.

# Step 1: Get oriented to using Maven instead of Ant

A few things to notice:

* Under `src`, there are two directory trees:
   * `src/main/java/edu/ucsb/cs56/pconrad/menuitems` contains regular Java classes.
   * `src/test/java/edu/ucsb/cs56/pconrad/menuitems` contains the test classes.
   
Don't change the package from `pconrad` to your name; the autograder is looking for the code under the `edu.ucsb.cs56.pconrad.menuitems` package.
So each source file:

* must be under that directory path when it is compiled, and 
* must have `package edu.ucsb.cs56.pconrad.menuitems;` as the first line in the file

Here are the commands you'll need as you work with the code. Try them out now.

| To do this | Type this command |
|-|-|
| compile the code | `mvn compile` |
| reset everything | `mvn clean` |
| run the tests | `mvn test` |
| generate javadoc | `mvn javadoc:javadoc site:deploy` |
| generate a report of test coverage | `mvn test jacoco:report site:deploy` |
| generate a jar file | `mvn package` |

# Step 2: Set up your github pages site

Try out the `mvn site site:deploy` command and then do a `git add` on the `docs` subdirectory
to get that into github.

Then, go to the Settings page for your repo, and turn on github pages on the `docs` subdirectory of the `master` branch.

Having that page up and working is part of your grade (one of the manually graded items worth, collectively, 20 points).

You can also set up the test case coverage report there.

You may notice, when you generate the javadoc, that there are some warnings:

```
[WARNING] Javadoc Warnings
[WARNING] /Users/pconrad/github/cs56/STARTER_lab03/src/main/java/edu/ucsb/cs56/pconrad/menuitem/MenuItem.java:26: warning: no @return
[WARNING] public String getPrice() {
[WARNING] ^
[WARNING] /Users/pconrad/github/cs56/STARTER_lab03/src/main/java/edu/ucsb/cs56/pconrad/menuitem/MenuItem.java:41: warning: no @return
[WARNING] public String getPrice(int width) {
[WARNING] ^
```

By looking at the other examples of Javadoc, and reading about how to write correct Javadoc online, you should be able to figure out how to remove these warnings.  We'll check for that when we do the "manual grading" part of the assignment.

# Step 3: Start writing code.

In this lab, you'll be implementing several methods of two classes that represent a restaurant Menu, composed of MenuItems.

A MenuItem represents an item on the menu of a restaurant.  It has three attributes:
* the menu item name, e.g. `"Small Poke Bowl"`
* the price, in cents (e.g an item that costs $1.49 is represented by the integer 149)
* a category such as `"Beverages"` or `"Poke Bowls"`

A Menu is simply an encapsulated list of MenuItems.  What Menu adds over ArrayList is the ability to sort the menu in various ways
that might be useful in producing formatted menus.

Note that the starter code:
* Has stubs for SOME of the needed methods, but NOT ALL of them
* Has unit tests for SOME of the needed methods, but NOT ALL of them

So you'll need to do a bit more work than you may be used to.

I suggest that you work in this order:
* <b>First, Add stubs for all of the methods that don't have them yet.</b>  
   * Until you do this, you won't be able to run any of the instructor unit tests on Gradescope.
   * The reasons is that the instructor tests won't compile against your code unless and until you have those methods.
* <b>Then, try submitting on Gradescope</b>
   * At this point, you should have a clean compile for both the student and instructor code, though you won't be passing most of the unit tests.
* Then, one at a time, work on each method
   * If the method doesn't have a unit test yet, <b>write the test first and see it fail</b>.
   * Then make the test pass.
   * Then submit on Gradescope and see if the test for that method passes on Gradescope
   * Continue until all of your methods work.

I suggest getting the `toString()` of the `MenuItem` class to work before trying the `csv()` method of `Menu` or any of the extended versions of that method that require sorting.

# Details about methods of MenuItem

The constructor has the signature:
```
public MenuItem(String name,
                int priceInCents,
                String category)
```

Here are the instance methods you'll need to implement for `MenuItem`

| Modifier and Type	| Method | Description |
|-|-|
|String	| getCategory() | Returns the category of the menu item |
|String	| getName() | Returns the name of the menu item |
|String	| getPrice() | Returns the price, formatted as a string with a $.
|String	| getPrice(int width) | Returns the price, formatted as a string with a $, right justified in a field with the specified width. |
| int	| getPriceInCents() | get the price in cents only |
| String	| toString() | return a string in csv format, in the order name,price,cateogry. <br> For example: `"Small Poke Bowl,1049,Poke Bowls"`<br>In this case, the price is unformatted; just an integer number of cents. |

There is also a class `Menu`, which wraps an `ArrayList<MenuItem>`.

The constructor takes no arguments, and simply initializes an empty ArrayList. (It is given in the starter code.)

# Details about methods of Menu


The methods for `Menu` are as follows:

| Modifier and Type	| Method | Description |
|-|-|
|void	add(MenuItem mi) | add a menu item to the menu (to the wrapped ArrayList)|
|String|	csv() | Produce a listing of each item in csv format, with newlines between each item.  Order is whatever order the items are currently in the ArrayList |
|String|	csvSortedByName() | same as `csv()`, but the items should be sorted in lexicographic order by name. |
|String|	csvSortedByCategoryThenName() | same as `csv()`, but the items should be sorted by category.  With the same category, the items should be sorted by name.  |
|String|	csvSortedByCategoryThenPriceDescendingThenByName() | same as `csv()`, but the items should be sorted by category.  With the same category, the items should be sorted by name. |
|String|	csvSortedByPriceThenName() | |

# When all your tests pass

* Be sure that you've added your pair partner to your submissions on Gauchospace
* Check your test coverage:
   * Run: `mvn test jacoco:report site:deploy`
   * Run: `git add docs; git commit -m "publish docs"; git push origin master`
   * Be sure that you've set up your repo settings to publish the `docs` directory of the `master` branch to github pages
   * Put a link to your github pages site in your README.md (e.g. <tt>https://ucsb-cs56-m18.github.io/{{page.num}}-githubid1-githubid2</tt>)
   * Visit the link <tt>https://ucsb-cs56-m18.github.io/{{page.num}}-githubid1-githubid2/jacoco/index.html</tt> or just click the "jacoco-test-coverage" link on your page.
   
Some of the points in the manual inspection may be awarded on the basis of having good test coverage.  While 100% test coverage is not always the goal, in this particular exercise, it *should be possible*.    So if you see that you don't have 100% test coverage, go back and write some additional unit tests.

## How to read the test coverage reports

* If any line of code is red, that means it is not tested at all&mdash;it is being missed by *line coverage*
* If a line of code is yellow, it means there are multiple ways to execute the line.
   * it may have an if/else, or a boolean expression involving `&&` or `||`, and thus there are multiple paths through the code (multiple branches).  
   * Yellow means it is being missed by *branch coverage*; some branches are covered, and others are not.   
   * Think about the multiple paths through the code and be sure your tests are coverage all of them.

# An important point about academic honesty

Yes, I am aware that it is possible to "cheat" on this lab by looking at the jacoco reports of other students and pairs to access their source code.   Even though the repos are private, the jacoco test coverage reports are public, and you can browse the source code.   I strongly encourage you to NOT do that.

Ultimately, I'd like to find a way to easily obtain test coverage reports without leaking the source code.  But in the meantime, I'm simply relying on your sense of ethics and honor to NOT LOOK.    I decided the educational value of introducing test-coverage outweighed the risk from potential academic dishonesty.

If you do copy code from other students by looking at their test coverage report, it will be pretty obvious.   And, the biggest problem is that you'll miss the learning opportunity in this assignment, which will help you prepare for the exam next Thursday.

# End of description for {{page.num}}
