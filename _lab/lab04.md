---
layout: lab
num: lab04
ready: false
desc: "Intro to Web Applications"
assigned: 2016-08-28 09:30
due: 2016-09-01 23:59
---

<div style="display:none" >
Look here for formatted version: http://ucsb-cs56-m18.github.io/lab/lab03
</div>

This is an individual lab on the topic of Java web apps on Heroku.

Step 0: Understanding what we are trying to do
----------------------------------------------

### What are we trying to accomplish again in this lab?

-   In this lab, we will <em>create a basic "Hello, World" type web app in Java"</em>
-   A web app is a piece of Java code that takes HTTP request messages as input, and responds with HTTP response objects as output.
-   Heroku is a platform where we can host a Java web app.

### Why use Heroku?

-   Web applications run on the "server" side of the web architecture, not the client side.
-   So to test a web application, we need to set up a web server that can run Java code.
-   Configuring a web server for Java is challenging. But, fortunately, we don't have to.
-   Heroku.com offers "platform as a service" cloud computing for Java web applications.
-   We'll use the "free plan" that they offer for folks just getting started with learning Heroku.
-   This puts your application "on the web", for real, so that anyone in the world can access it 24/7

To run a servlet locally on your own machine, you could also use a servlet container such as Tomcat, Jetty, or Resin. Configuring those to run servlets locally on your own machine is not too bad, but configuring those to run on a shared hosting environment such as CSIL can be quite painful, so we are just going to avoid that altogether.

### Limitations of the free plan of Heroku

-   If no-one has accessed your web app for a while, it "goes to sleep", so to speak.
    -   The first time someone tries to access it after it has gone to sleep, there is a <em>noticable</em> delay in the response, perhaps several seconds or even up to a minute.
-   If too many people try to access your service per hour, eventually, you'll run out of "free resources".
    -   That is <em>very unlikely to happen</em> unless you make a web app that somehow attracts the attention of a very large audience.
    -   I suggest you try to avoid doing that with the web apps you develop for this class.
    -   I suggest you avoid doing that in general, unless/until you have some plan for how to make money off your web app to pay for the server resources. (With a credit card, you can set up Heroku to have higher usage limits, and to keep your app running so that response time is fast. But you should NOT need that for this course.)

### Web Apps vs. Static Web Pages

You may already have some experience with creating static web pages, and/or with creating web applications (e.g. using PHP, Python (Django or Flask) or Ruby on Rails.) If so, then the "Learn More" section will be basic review.

If you are new to writing software for the web, you are <em>strongly encouaged</em> to read the background information at the "learn more" link below.
-   [Web Pages vs. Web Apps](http://pconrad-webapps.github.io/topics/webpage_vs_webapp/)

### What are we trying to accomplish again in this lab?

If you just did a deep dive into the article [Web Pages vs. Web Apps](http://pconrad-webapps.github.io/topics/webpage_vs_webapp/), it may be helpful to again review what we are trying to accomplish in this lab:

-   In this lab, we will <em>create a basic "Hello, World" type web app in Java"</em>
-   To test that, we need to run that on a server somewhere.
-   Configuring a web server for Java is challenging. But, fortunately, we don't have to.
-   Heroku.com offers "platform as a service" cloud computing for Java web applications.
    -   We'll use the "free plan" that they offer for folks just getting started with learning Heroku.
    -   This puts your application "on the web", for real, so that anyone in the world can access it 24/7

### Disk Quota

IMPORTANT: if you are working on CSIL, and at some point things just "stop working":

-   You get odd error messages, especially "cannot write file", or "disk quota exceeded"
-   You cannot log in---it takes your user name and password on the machines in Phelps 3525 or CSIL, but then just logs you out immediately.

Then you probably have a disk quota problem.

-   The best way to troubleshoot this, if you cannot log in, is to ask someone else that CAN log in to allow you to use a terminal window on their screen.
    -   Use `ssh yourusername@csil.cs.ucsb.edu` to get into your account from their terminal session.
-   For troubleshooting tips, visit: [CSIL Disk Quota Troubleshooting](https://foo.cs.ucsb.edu/56wiki/index.php/CSIL#CSIL_disk_quota_Troubleshooting)

# Step 1: Create a Heroku Account associated with your umail.ucsb.edu

If you do not already have a Heroku account associated with your umail.ucsb.edu account, navigate to <https://www.heroku.com/> and click the "Sign up for Free" link.

![Heroku Signup](HerokuSignup.png)

You'll be asked for:

-   First Name
-   Last Name
-   Email—use your @umail.ucsb.edu account.
    -   If you are a student registered for CMPSC 56 at UCSB, we need this association with your identity as a UCSB student in this course to give you credit for the work.
    -   But, if you are just doing this lab "for the experience" and don't care about credit, you can use any email you like.
-   Company (you may leave this blank).
-   Preferred Development Language: We suggest you select "Java" if you are currently enrolled in CMPSC 56
    -   (Don't worry; this doesn't prevent you from using the account with other languages later.)

<div style="clear:both;">
</div>


# Step 2: Fork the sparkjava_01 tutorial repo

Fork the sparkjava_01 tutorial repo into a public copy under your own github account.

Use `mvn compile` and `mvn exec:java` to try to run the code and get a web app running on localhost (as shown in lecture).

# Step 3: Create a new Heroku App using the Web Interface

(Note: Some tutorials suggest downloading the "Heroku Toolbelt".   We are going to try to work without doing that, because getting it to 
work in a shared hosting environment such as CSIL is somewhat painful.)

Create a new Heroku App.  Call it <tt>cs56-{{site.qtr}}-{{page.num}}-yourname</tt>




