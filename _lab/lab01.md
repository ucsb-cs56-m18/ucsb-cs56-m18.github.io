---
layout: lab
num: lab01
ready: true
desc: "Tools for java development"
assigned: 2018-08-10 09:30
due: 2018-08-23 23:59
org: ucsb-cs56-m18
herokuapp: "https://ucsb-cs-github-linker.herokuapp.com/"
---

If you find typos or problems with the lab instructions, please report them on Piazza

Overview of this lab
====================

1. Work in your pair partnership on this project.  Don't start working unless you are sitting together.  This should be a true pair partner assignment.    In true pairing, every line of code goes through the minds of two programmers.  Please read this [blog post from the well-known Agile Coach LLewellen Falco](http://llewellynfalco.blogspot.com/2014/06/llewellyns-strong-style-pairing.html) that explains the idea of **strong-style pairing**.

1. Login at github.com.  Click on the drop down menu at left where your username appears, and ensure that <tt>{{page.org}}</tt> appears    among your organizations in the drop down menu.    (Note: The image might have ucsb-cs56-w18, but your page should have {{site.github-org-name}} instead.   The URL for that org is <{{site.github-org-url}}>, and if you followed the steps in lab00, you should have an invitiation to join that org.

    <img src="https://docs.google.com/drawings/d/e/2PACX-1vQVGuD1Wui6_-LvNFBuGDA7qj9IMr9lU5mtx9MmXxnxJdlCpwUk1B5UZ3oRWgWkf93F7Eh4XmZSN14v/pub?w=371&amp;h=346">

    If not:
   - Be sure that you've registered for the course at <{{page.herokuapp}}>.  (If that application is not working, ask your mentor to invite you to the organization manually.)
       * MENTORS: If you invite a student to the organization manually, please note this on the instructor Slack channel, including the student's github_id and umail address.
   - Be sure that you've accepted the invitation to the organization <tt>{{page.org}}</tt> by visiting <https://github.com/{{page.org}}>
   - If you find that you STILL do NOT have the <tt>{{page.org}}</tt> organization available, consult with your mentor before proceeding.

1. Repeat the previous step if needed for BOTH pair partners.  Each one should verify that they have access to creating repos in the <tt>{{page.org}}</tt> organization.  If necessary, allow the pair partner that is not currently logged in to use an "Incognito Window" or the equivalent in your browser.


1. Now, one of the two of you: create a *private* repo for {{page.num}} under the {{site.github-org-name}} organization on <github.com>
    - It should be called <b>{{page.num}}-githubid1-githubid2</b> where githubid1 and githubid2 are your the githubids of you and your pair partner IN ALPHABETICAL ORDER.
    - (NOTE: yes, hyphens not underscores.  Conrad may have showed underscores during lecture, but he goofed.)
    - It should be <b>private</b>, not public.
    - The owner should be the <b>{{page.org}}</b> organization as the owner, not your own github id.
    - This time, DO NOT add a .gitignore or README.md file.  You want a blank empty repo.

        ![creating](gh1.png)

    - The result should look like this.   (Note: **Ignore** the instructions labelled "... or create a new repository at the command line" that show up on that web page&mdash;they've been cropped out for a reason.  We are going to do something slightly different, so **follow the instructions below** instead.)

        ![result](gh2.png)
	
2.  The person that created the repo should add their pair partner as a [collaborator on the github repo](https://ucsb-cs56-pconrad.github.io/topics/github_add_collaborator/).   
    - You will need their github id in order to do that.
    - The pair partner that was added needs to accept the invitation in order to get the access (see the linked article for details.)
	
2.  Configure your CSIL account for git
    - [Detailed Instructions](https://ucsb-cs56-pconrad.github.io/topics/csil_git_configuration/)

    
2.  Configure your CSIL account's ssh keys for git
    - Detailed instructions: [Configuring your ssh key for Github.com](https://ucsb-cs56-pconrad.github.io/topics/github_ssh_keys/)


3.  At the shell prompt on any of the csil machines, type the following command:
    ```
    ssh-keygen -f ~/.ssh/known_hosts -R csil.cs.ucsb.edu
    ```
    
    - You need to do this because CSIL had new hardware installed over the summer, which caused the host key to change. 
    - If you get a "no such file or directory" error, then you can skip this step

4.  Review a few basic facts about git, github.com and github.ucsb.edu
    - detailed information [here](https://ucsb-cs56-pconrad.github.io/topics/git_overview/)

5.  cd into your ~/cs56 directory on CSIL and create a directory called lab01.
   cd into that directory and type `git init` to turn it into a git repository.

6.  We are now going to add TWO remotes to this repo.
    * The following command adds a remote that you can use to get the starter code
        * `git remote add starter git@github.com:ucsb-cs56-m18/STARTER_lab01.git`
    * The following command adds a remote called `origin` that refers to the repo on github.com.  Instead of the URL below, use the URL for YOUR repo, i.e. substitute your github ids in place of `cgaucho01` and ldelplaya99`.
        * `git remote add origin git@github.com:ucsb-cs56-m18/lab01-cgaucho01-ldelplaya99.git`

7.  Now, pull the starter code into your repo with this command

    ```
    git pull starter master
    ```

    This should pull in [the starter code for lab01](https://github.com/ucsb-cs56-m18/STARTER_lab01), which is very similar (though not identical) to the code in step 8 of the  [Rational Tutorial](https://ucsb-cs56-pconrad.github.io/tutorials/rational/).
   
8.  Now, do a `git push origin master` to push this code back to your own
    private repo.

9.  Now, let's get your javadoc set up.  Try doing `ant javadoc` at the command    line.  This should create javadoc in the `docs/javadoc` subdirectory.

    Do a `ls` to verify that it got created.

10. To put in online, go to your repo on github.com, and under Settings
   for your repo, find the section for Github Pages, and select the
   master branch and `docs` folder as shown here:

    ![docs folder](gh3.png)
    
   Visit the url shown there.  You may have to add `/javadoc` at the end of the URL.
   
   Edit the README.md for your repo and put the correct javadoc link into the README.md in place of the one that
   you see in the placeholder text there.   While you are there, read through the README.md that came with the starter
   code, and make other adjustments as indicated.

9.  You are now ready to work on the programming part of the lab.

    - For that, you'll need the basic git workflow, explained [here](https://ucsb-cs56-pconrad.github.io/topics/git_basic_workflow/)

    -  Follow the detailed instructions below to complete the programming part of the assignment.

11. When you are finished, be sure you have
    * done an `ant compile`, `ant test`, `ant javadoc` on the final version.
    * done a `git status` to see if any changes (e.g. changes to code, build.xml, javadoc) need to be added, committed and pushed)
    * done a final `git push origin master` to push your changes to github.
    
    Then, you can download a .zip version of your assignment from github, rename it to `lab01.zip`, and 
    submit via submit.cs at this link: <{{page.submit_cs}}> 

    * NOTE: When you download the `.zip` file, try to do so in a way
        that does NOT automatically unzip it as you download it.  If
        you do this, and then "rezip" it before submitting, it can
        mess up the structure of the file in a way that causes it to
        fail the tests on submit.cs.

Detailed Instructions for Programming Assignment
================================================

* To the `Rational` class, add both tests and correct implementations of the methods listed below.
* Note that for each method, you should add a reasonable number of tests.  The exact number is left to you to determine, but it should be no less than three for each method.


| method                                    | explanation                     |
|-------------------------------------------|---------------------------------|
| `public static int lcm(int a, int b)` | returns least common multiple of a and b. See [wikipedia discussion](https://en.wikipedia.org/wiki/Least_common_multiple#Computing_the_least_common_multiple) |
| `public Rational plus(Rational r)` | returns sum of this number plus r |
| `public static Rational sum(Rational a, Rational b)` | returns a+b |
| `public Rational minus(Rational r)` | returns this number minus r |
| `public static Rational difference(Rational a, Rational b)` | returns a-b |
| `public Rational reciprocalOf()`   | returns reciprocal (swap numerator and denominator).  If numerator if zero, throws an instance of [`java.lang.ArithmeticException`](https://docs.oracle.com/javase/8/docs/api/java/lang/ArithmeticException.html). To review exceptions, see [cs56-rational-ex07](https://github.com/UCSB-CS56-pconrad/cs56-rational-ex07) |
| `public Rational dividedBy(Rational r)` | returns this number divided by r |
| `public static Rational quotient(Rational a, Rational b`) | returns a divided by b |

Some hints to make things easier:

* (a - b) is equivalent to (a + (-1 * b))
* (a / b) is equivalent to (a * reciprocal(b))

Suggested test cases:
* What happens when you create the rational with `Rational(6,-3)` or `Rational(-6,3)`?
* What about the rational `Rational(3,-7)`, `Rational(-3, 7)`, or `Rational(-3,-7)`?

So, don't repeat yourself:
* Multiplication and gcd are already defined for you in the example code.
* You need lcm to find a common denominator to add two rationals, so define lcm before addition.
* The lcm can be defined in terms of gcd and absolute value&mdash;see [wikipedia discussion](https://en.wikipedia.org/wiki/Least_common_multiple#Computing_the_least_common_multiple). Absolute value is predefined `public int Math.abs(int a)`
* Define addition before subtraction, and then define subtraction in terms of addition and multiplication.
* Define reciprocal before division, then define division as multiplication by the reciprocal.

# Grading:

* Submit on Gradescope.  Part of your grade is determined by the automatic points assigned  on Gradescope for automated tests.
* The remainder is determined by manual grading using the following rubric:
   * (25 pts) Did you follow the instructions for setting up your repo? (naming, making it private, pulling in starter code,
     adding partner as collaborator)
   * (25 pts) Did you publish your javadoc correctly, link to it from your README, and in general, tidy up your README as indicated?
