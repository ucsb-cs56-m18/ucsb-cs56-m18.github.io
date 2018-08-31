---
layout: lab
num: lab04
ready: false
desc: "Intro to Web Applications"
assigned: 2016-08-28 09:30
due: 2016-09-01 23:59
gauchospace_url: "https://gauchospace.ucsb.edu/courses/mod/assign/view.php?id=1463811"
---

<div style="display:none" >
Look here for formatted version: http://ucsb-cs56-m18.github.io/lab/lab03
</div>

This is an **individual** lab on the topic of Java web apps on Heroku.

You may cooperate with one or more pair partners from your team to help in debugging and understanding the lab, but each person should complete the lab separately for themselves.

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
-   For troubleshooting tips, visit: [CSIL Disk Quota Troubleshooting](topics/csil_disk_quota/)

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

Use `mvn compile` and `mvn exec:java` to try to run the code and get a web app running on localhost.

Note that in order to see this web app running, you'll need to be in a web browser on the same host that you are running your program on.  
* For example, if you are running on `csil-04.cs.ucsb.edu`, you'll need to be running your web browser on `csil-04.cs.ucsb.edu`.   
* If you are working in Phelps 3525 on `cstl-07.cs.ucs.edu`, you'll need to be running your web browser on `cstl-07.cs.ucsb.edu`.

If you are not sitting in the CSIL or CSTL lab, i.e. you are using ssh on a laptop to access CSIL, then you might need to test your webapp using a command line web client such as `curl` (curl stands for "C" the "URL").  For example, this command should show you the output from the `/` route for your webapp:

```
curl http://localhost:4567
```

And

```
curl http://localhost:4567/hello
```

would show the output from the `/hello` route.

This is not very satisfying.
* The web app is only runnning as long as your program is executing. 
* As soon as you CTRL/C the program to interrupt it, the web app is no longer available.
* The web app is only available on the machine where you are running the program; not on the public internet.

To get the web app running on the public internet, we'll need to use a cloud-computing platform such as Heroku.

# Step 3: Create a new Heroku App using the Heroku CLI

Logged into CSIL (or one of the machines in the CSTL, i.e. Phelps 3525), use this command to login to Heroku at the command line:

```
heroku login
```

Then, use this command to create a new web app running on heroku.  Substitute your github id in place of `githubid`.  Note that you should convert your githubid to all lowercase; heroku web-app names do not permit uppercase letters.

A reminder that this is an individual lab, so you should complete it for yourself, i.e. there is only one github id in the name, not a pair of github ids.

```
heroku create cs56-m18-githubid-lab03
```

# Step 4: Modify the pom.xml file to refer to your heroku app

In the `pom.xml` file, locate this section.  It is a `plugin` element, and should be located inside the `plugins` element.

```xml
  <plugin>
	<groupId>com.heroku.sdk</groupId>
	<artifactId>heroku-maven-plugin</artifactId>
	<version>2.0.3</version>
	<configuration>
          <jdkVersion>1.8</jdkVersion>
          <!-- Use your own application name -->
	  <!-- at Heroku CLI, use heroku apps to list, or use Heroku Dashboard -->
          <appName>ucsb-cs56-pconrad-08-28-18</appName> 
          <processTypes>
            <!-- Tell Heroku how to launch your application -->
            <!-- You might have to remove the ./ in front   -->
            <web>java $JAVA_OPTS -jar target/sparkjava-demo-01-1.0-jar-with-dependencies.jar</web>

          </processTypes>
	</configuration>
   </plugin>
```

The line you need to change is the one that says:

```
 <appName>ucsb-cs56-pconrad-08-28-18</appName> 
```

Change this to the name of your heroku app.  If you've forgotten it, you can locate it either by typing:

```
heroku apps
```

or by logging into the Heroku Dashboard in a web browser at <https://dashboard.heroku.com/apps>

Then, type the following to deploy your web app to Heroku:

```
mvn package heroku:deploy
```

You should see a lot of output.  At the end of this output, you should see something like this:

```
...
[INFO] remote: -----> heroku-maven-plugin app detected
[INFO] remote: -----> Installing JDK 1.8... done
[INFO] remote: -----> Discovering process types
[INFO] remote:        Procfile declares types -> web
[INFO] remote: 
[INFO] remote: -----> Compressing...
[INFO] remote:        Done: 54M
[INFO] remote: -----> Launching...
[INFO] remote:        Released v10
[INFO] remote:        https://ucsb-cs56-pconrad-08-28-18.herokuapp.com/ deployed to Heroku
[INFO] remote: 
[INFO] -----> Done
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 39.539 s
[INFO] Finished at: 2018-08-31T01:56:14-07:00
[INFO] Final Memory: 29M/268M
[INFO] ------------------------------------------------------------------------
```

The line that you are looking for is this one:

```
[INFO] remote:        https://ucsb-cs56-pconrad-08-28-18.herokuapp.com/ deployed to Heroku
```

That is the URL where you should now be able to see your webapp running.  This URL should be accessible from any web browser connected to the internet.

# What if it doesn't work?

If it doesn't work, try these things before asking a mentor, TA, or instructor for help.

1. Make sure you are logged into Heroku at CLI with `heroku login`.  If you exited your CSIL shell (logged out) and logged back in again, you have to login to Heroku again.  Then repeat the commands.
2. Try, try running `heroku apps`.  Make sure the `<appname>app-name-goes-here</appname>` element in the `heroku-maven-plugin` section of your `pom.xml` matches the name of your heroku app exactly.
3. If it does, try `heroku logs --app appname` (substitute the name of your app where you see `appname`).  You'll see the log output of that app on Heroku.   
   * You may find it helpful to open a second Terminal, login to CSIL and the Heroku CLI, and use `heroku logs --app appname --tail`, which keeps the log output running continously.
   * You can also see your logs in a web browser at: <https://dashboard.heroku.com/apps/app-name/logs> (note that you need to put your `app-name` in the URL instead of `app-name`.  
   * You can navigate to this from <https://dashboard.heroku.com/> by selecting your app, clicking on it,  selecting the `More` menu at upper right, and the selecting `Logs`.

# Step 5: Changing what is shown on the page

Go into the Java source code under `src` and locate the file `src/main/java/edu/ucsb/cs56/pconrad/SparkDemo01.java` 

In this file, locate the line of code that says:

```java
spark.Spark.get("/", (req, res) -> "<b>Hello World!</b>\n");
```

As you can see, the method call `spark.Spark.get takes two parameters:
* The first is a **route** such as "/"
* The second is is a [lambda expression](https://ucsb-cs56-pconrad.github.io/topics/java_lambda_expressions/) that:
   * takes two parameters, `req` and `res` (which stand for **request** and **response**), and
   * returns the HTML that will be returned to the web client (i.e. your browser).

Our first step is going to be to modify what is returned by the browser for the "/" route, which is the root of the web page.

Before this line of code, add the following.  Be sure to replace `mygithubid` with your own github id:

```
String html = "<h1><a href='/hello'>Hello</a> World!</h1>\n" +
    "<p>This web app is powered by \n" +
    "<a href='https://github.com/mygithubid/sparkjava-01'>this github repo</a></p>\n";
```

Then, change the line of code 
```
spark.Spark.get("/", (req, res) -> "<b>Hello World!</b>\n");
```

To read:

```
spark.Spark.get("/", (req, res) -> html);
```

Then:
* use `mvn compile` to make sure your code still compiles
* (optional, but suggested in case you need to debug)
   * use `mvn exec:java` to test locally, perhaps with `curl http://localhost:4567`
* use `mvn package heroku:deploy` to push these changes to your running Heroku app

If it works, then the word "Hello" and the words "this repo" should become clickable links.  
* The words "this repo" should link to your github repo
* However, the word "Hello" will be a dead link.

Next, let's fix that by adding this line of code:

After:
```
spark.Spark.get("/", (req, res) -> html);
```

Add this:

```
spark.Spark.get("/hello", (req, res) -> "<p><b>Hello, World!</b>  You just clicked the first link on my web app.</p>);
```

Deploy this code to Heroku in the same way you did with the other code.  Make sure both links now work.

Ok, so far, we haven't really done anything we couldn't have done with a static web page.  But we have gotten a working Java web app running on Heroku, so it's start we can build on.  

That's all for the *graded* part of this lab, but there is much more to learn.   Let's get this submitted for a grade first, but then the lab is NOT OVER.  There is a part that is not graded, but is super important as a means to learn the skills we'll need to build real webapps using Heroku, and you are encouraged to stay and work on that.  For that part, you are encouraged to work in pairs or even in groups of three or more with folks from your team.

# Step 6: Submitting your work for grading

When you have a running web app, visit <{{page.gauchospace_url}}> and make a submission.

In the text area, enter something like this, substituting your repo name and your Heroku app name:

```
repo name: https://github.com/chrislee123/sparkjava-01
on heroku: https://cs56-m18-chrislee123-lab03.herokuapp.com
```

Then, **and this is super important**, please make both of those URLs **clickable urls**.

The instructions for doing so are here: <https://ucsb-cs56-pconrad.github.io/topics/gauchospace_clickable_urls/>

When you've submitted for a grade, move on to the ungraded, but NOT OPTIONAL part of the lab where we explore an important SparkJava tutorial.

# Step 7: SparkJava tutorial

TBD



