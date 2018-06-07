---
layout: lab
num: lab00
ready: false
desc: "Getting Started"
assigned: 2018-08-06 09:30:00.00-8
due: 2018-08-09 17:00:00.00-8
submit_cs_projnum: 936
signup_app: https://ucsb-cs56-w18-signup.herokuapp.com
---

If you find typos or problems with the lab instructions, please report
them on Piazza

Step 0: Getting oriented
========================

Chances are you are already familiar with all of the following because
you already took CS courses that used this stuff (i.e. CS8, CS16,
CS24, CS32).

If not--if for example, you are a transfer student and this is your first 
CS course using the CSIL Lab resources, please let your TA know and he/she 
will help you find resources to come up to speed on these things. Or, your 
TA can assign you a pair partner that knows this stuff and doesn't mind 
helping you come up to speed.

-   knowing your College of Engineering/CSIL computer account username/password--and having an active working account.
-   knowing how to login to the systems in Phelps 3525 and the CSIL lab, and bring up both a web browser, and a terminal window.
-   knowing that "CSIL" is both a server you can log into, as well as a physical room full of computers--and knowing where to find that physical room, and what hours it is open.
-   knowing how to use a **basic text editor such as emacs or vim** to edit files on the Linux systems in Phelps 3525 and CSIL.
-   knowing basic Unix/Linux commands to create directories, change directory, manipulate files, etc., e.g. mkdir, cd, pwd, mv, rm, ls.

The rest of these instructions will assume you know all of the
above. If not, then let your TA know, and we'll point you to resources
where you can come up to speed.


As a separate item, you should also know how to connect to CSIL from your own computer (PC/Mac/Linux)

-   Windows: Putty, optionally with XMing. See for example: [CSIL Access:Windows](https://foo.cs.ucsb.edu/56wiki/index.php/CSIL_Access:Windows).   Note that a better option than PuTTY/XMing may be [MobaXTerm](http://mobaxterm.mobatek.net/), since it integrates ssh and X11 access into a single free tool.
-   Mac/Linux: `ssh` `-Y` `username@csil.cs.ucsb.edu`, [CSIL Access:Mac and Linux](https://foo.cs.ucsb.edu/56wiki/index.php/CSIL_Access:Mac_and_Linux).

But, you don't need that for today's lab---so let's continue.

The rest of the lab: Step-by-Step
=================================


Here is an overview of the remaining steps in the lab:

0. If you didn't already do it:
    - Create a github.com account
    - Make sure your `umail.ucsb.edu` email address is 
       registered as one of the emails associated with your github.com account.
    - Register your account using the web app at: <{{page.signupapp}}>
    
1. Also visit <https://github.ucsb.edu> and login with your CSIL account, to establish your github.ucsb.edu account.   We may or may not use that account this quarter, but we want to be sure that you've established that account in case we need it.

2. Login to your CSIL account, and create a ~/cs56 subdirectory.

3. In that directory, use your favorite text editor to create a file containing
 the following code.  Call the file `HelloWorld.java`.  Put your name instead of `Your Name Here`.

```java

/**
  @author Your Name Here
*/

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }

}
```

4. Compile the file with the command `javac HelloWorld.java`

5. Run the file with the command `java HelloWorld`

6. Navigate to <https://gradescope.com>.   

7. Find the class {{site.submit_cs_course}}.  If you are not enrolled in the class, contact one of the course
   staff (your instructor, or a TA or an undergrad mentor) to get enrolled.

8. The next step is to upload your work to Gradescope.com for grading.  

9. Once you see that you have a score of 100 for the lab, you are *done* with lab00.  
