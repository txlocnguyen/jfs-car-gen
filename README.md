# <a href="https://github.com/txlocnguyen/jfs-car-gen/tree/main/src">jfs-car-gen</a>
Finished. View code <a href="https://github.com/txlocnguyen/jfs-car-gen/tree/main/src">here</a><br/>
Practice exercise to create a Car App in Java
OVERVIEW & PURPOSE
You will create a Car App that utilizes the Java skills you have learned thus far and push your code to GitHub.
ACTIVITY
Open Intellij, click new project.
Select Java and your Project SDK, click Next.
Make sure "Create project from template" is unchecked and click Next.
Name your project jfs-car-gen and click “Finish” (Take note of where you are creating your project by looking at your project location, are you in your desktop or somewhere else).
Right click on project name and select "Add Framework Support". Select Maven and click ok.
Click on src, main, right click on java and click on New -> Package. Name package: com.example.car_gen.
Right click on the package you just created and click on New -> Java Class. Name it Main. This will be the entry point for your application.
Open your Main Class and create a main method.
Right click on the package you just created and click on New -> Java Class. Name it Car. This is where we will write all of our methods for dealing with our Car class.
Right click on the package you just created and click on New -> Java Class. Name it Toyota. (This class should extend your Car class)
Right click on the package you just created and click on New -> Java Class. Name it Lexus. (This class should extend your Car class)
Right click on the package you just created and click on New -> Java Class. Name it Honda. (This class should extend your Car class)


*** Make all your instance fields private and all your classes and methods public 
Your Car class should have the following instance fields. Do not set any values unless noted.
Type String with the name color
Type int with the name year
Type int with the name speed (initial value 0)
Type int with the name maxSpeed
Type boolean with the name isElectric
Your Lexus class should have an instance field of type boolean with the name hasLeatherSeats. Do not set a value here.
Your Honda class should have an instance field of type boolean with the name isTurboCharged. Do not set a value here.
Your Toyota Class should have an instance field of type boolean with the name greatGasMileage. Do not set a value here.
In your Car class, create a constructor which takes in the following parameters(String color, int year, int maxSpeed)
In your Lexus class, create a constructor which takes in the  parameters from the parent class and boolean hasLeatherSeats
In your Honda class, create a constructor which takes in the parameters from the parent class and boolean isTurboCharged
In your Toyota class, create a constructor which takes in the parameters from the parent class and boolean greatGasMileage
Properly implement a super() method in each child class constructor
In your Car class, create getters and setters for each instance field. Do the same within your Toyota, Lexus, and Honda classes.
 Test your Classes. Over in your Main Class::
Create an  instance of your Honda Class and call it civic. 
Create an instance of your Lexus Class and name it rx350. 
Create an instance of your Toyota Class and name it supra. 
Use System.out.println() to print out the value of the color for each instance you’ve created. For example, System.out.println(civic.getColor());

In your Car class, create a method and name it accelerateSpeed. This method should have a return type of int and should return the speed value. This method should increase the car speed by five MPH. Make sure the speed doesn’t go above the vehicle's maxSpeed value.
*** Test your method. Over in your Main Class, call your accelerateSpeed() method on one of your Car objects and view the results. (You can use System.out.println() to see the results from the method call.)
In your Car class, create a method and name it decelerateSpeed. This method should have a return type of int and should return the speed value. This method should decrease the car speed by five MPH. Make sure the speed doesn’t go below 0 MPH.
*** Test your method. Over in your Main Class, call your decelerateSpeed() method on one of your Car objects and view the results. (You can use System.out.println() to see the results from the method call.)
In your Car class, create a method and name it convertToElectric. This method should have a return type of boolean and should return the isElectric value. This method should change the value of isElectric to true. If the value of this field is already set to true the method should display a message to the user stating that the Car is already electric.
*** Test your method. Over in your Main Class, call your convertToElectric() method on one of your Car objects and view the results. (You can use System.out.println() to see the results from the method call.)
Write unit tests using JUnit
Right click on the java folder in the test directory and click Create Package. Name your package com.example.car_gen.
Right click on your package and click New Java Class. Name it CarTest
Create a testAccelerateSpeed() method with return type void and no parameters with the @Test annotation.
Adding @Test annotation to your method should give you the option to import JUnit. Click on add JUnit to classpath.
If you don't see option to import JUnit, you can get it from MVNRepository: https://mvnrepository.com/
Search Google for "JUnit maven" and what you are looking for should be the top result. Go to mvnrepository and select version 4.12 (Not beta).

Copy the <dependency> and go back to your pom.xml file and paste it after <version></version> and before <properties></properties> (See below)
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

Right click on your pom.xml file and go to "Maven" and then "reload project".
Inside of your CarTest class, create an instance of your Honda class called civic.
Within your testAccelerateSpeed() method, use Assert.assertEquals() to test your civic.accelerateSpeed().
You will need to import Assert into CarTest.java. Right click on Assert.assertEquals() to do this.
Pass in your expected value as the first parameter of assertEquals() and a call to your accelerateSpeed() method as your second parameter.
Run your test method by pressing the green button to the left of your test method name.
 Once you have your test passing add tests for your other methods.
Create a new repository in your GitHub and name it jfs-car-gen. Make it public.
From your terminal, cd into your jfs-car-gen project and execute the following:
git init
git add .
git commit -m “First Commit”
Go to the repository you just created in GitHub and get the url from the green code button. Finally execute the following:
git remote add origin urlYoucopiedGoesHere
git push -u origin main
Go to your GitHub repository. You should see your code.

*** If you finish early, consider adding some additional functionality of your own. Be creative. 
