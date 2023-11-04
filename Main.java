
//1111111111111111111111111111111111111111111111111111111111111111111111

/*
1. Create a class called Student. Within this class,
a. Define two variables namely id and name.
b. Initialize id to 1 and name to Kamal.
c. Create an object s1
d. Access the objects through the variable.

 */
//code

/*


public class Main {

    int id;
    String name;

    public Main() {
        id = 1;
        name = "Kamal";
    }

    public static void main(String[] args) {

        Main s1 = new Main();
        System.out.println("Student ID: " + s1.id);
        System.out.println("Student Name: " + s1.name);
    }
}

 */

//2222222222222222222222222222222222222222222222222222222222222222222
/*
1. Create a class called with your name. Within this class,
        a. Get the user input for your registration no.
        b. Get the user input for your name.
        c. Merge and Display both data with the same Output.

*/

//code

/*
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your registration number: ");
        String registrationNumber = scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String mergedData = "Registration Number: " + registrationNumber + ", Name: " + name;
        System.out.println("Merged Data: " + mergedData);

        scanner.close();
    }
}

*/

//3333333333333333333333333333333333333333333333333333333333333333333333333333333333

/*
Create a class called Rectangle. Within the class,
        I. Create the variables length and width.
        II. Find the Area of the rectangle.

*/

//code

/*

public class Main {
    double length;
    double width;

    public Main(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
       Main rectangle = new Main(5.0, 4.0);
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);
    }
}


 */

//4444444444444444444444444444444444444444444444444444444444
/*
Write a Java program to calculate a bike’s average consumption from the given total
        distance (integer value) traveled (in km) and spent fuel (in liters, float number – 2 decimal point).
        Hint :- (distance/Fuel liters)
*/

//code

/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total distance traveled (in km): ");
        int distance = scanner.nextInt();

        System.out.print("Enter the spent fuel (in liters, with 2 decimal points): ");
        float fuelLiters = scanner.nextFloat();

        if (fuelLiters <= 0) {
            System.out.println("Fuel consumption cannot be calculated with zero or negative fuel input.");
        } else {
            float averageConsumption = distance / fuelLiters;
            System.out.println("Average consumption of the bike: " + String.format("%.2f", averageConsumption) + " km/l");
        }

        scanner.close();
    }
}
*/

//55555555555555555555555555555555555555555555555555555555555555555555555555555555

/*
Write a Java program to print the following characters in a reverse way.
Test Characters: 'X', 'M', 'L' -> ‘L’,’M’,’X’
 */

//code

/*

public class Main {
    public static void main(String[] args) {
        char[] characters = {'X', 'M', 'L'};

        System.out.print("Original Characters: ");
        for (char c : characters) {
            System.out.print("'" + c + "', ");
        }

        System.out.println("\nReversed Characters: ");
        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.print("'" + characters[i] + "', ");
        }
    }
}

*/

//6666666666666666666666666666666666666666666666666666666666666

/*
Write a java program to read 05 numbers from the keyboard and find their sum and average
 */

//code

/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        int count = 5;
        double sum = 0.0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }

        double average = sum / count;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}

*/

//777777777777777777777777777777777777777777777777777777777777777777777

/*
Write the java program to Print all elements of 2d array given below the numbers Using for Loop
1
-2
3
-4
-5
6
9
7
 */

//code

/*
public class Main {
    public static void main(String[] args) {
        int[][] numbers = {
                {1},
                {-2},
                {3},
                {-4},
                {-5},
                {6},
                {9},
                {7}
        };

        System.out.println("2D Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i][0]);
        }
    }
}


 */

//8888888888888888888888888888888888888888888888888888888888888888888

/*
Write the java program to print given below the patterns
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

//code

/*


public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
*/

//999999999999999999999999999999999999999999999999999999999999999999

/*

 *
 **
 ***
 ****
 *****
 ******


 */

//code
/*


public class Main {
    public static void main(String[] args) {
        int n = 6; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Two spaces for formatting
            }

            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
 */

//constactor   ...............................................................................................
//....................................................................................

//11111111111111111111111111111111111111111111111111

/*
a. Create the class Student including the attributes number, namen marks for three subjects,
total, average and grade.
b. Create a constructor and initialize the student obejcts with the input data values (Number,
name and three marks).
c. A method to calculate the total. Average amd grade (pass or fail).
d. A method to display the calculations with the student number and name.
e. Create one object.

 */

//code

/*


public class Main {
    private int number;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private int total;
    private double average;
    private String grade;

    // Constructor to initialize the student object with input data
    public Main(int number, String name, int mark1, int mark2, int mark3) {
        this.number = number;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        calculateTotal();
        calculateAverage();
        calculateGrade();
    }

    // Method to calculate the total marks
    private void calculateTotal() {
        total = mark1 + mark2 + mark3;
    }

    // Method to calculate the average marks
    private void calculateAverage() {
        average = total / 3.0;
    }

    // Method to calculate the grade (pass or fail)
    private void calculateGrade() {
        if (average >= 50) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Number: " + number);
        System.out.println("Student Name: " + name);
        System.out.println("Marks: Subject 1 - " + mark1 + ", Subject 2 - " + mark2 + ", Subject 3 - " + mark3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        // Create a Student object
        Main student = new Main(1, "John Doe", 80, 70, 60);

        // Display student information
        student.displayStudentInfo();
    }
}
*/

//22222222222222222222222222222222222222222222222222222222222222222222222

/*

a. Create the class Employee with the attributes employee number, basic salary, allowance
and net salary.
b. Create a construtor and initialize the employee object with the input data values
(Employee number and basic salary).
c. Included the methods to do the following.
• Calculation() – To calculate the net salary with the following contions.
Basic salary > 100, 000
Allowance – 10%
Basic salary <= 100, 000
• Display() – to display the calculation with employee number
d. Create one object.
e. Bring the main method to a separate class TestEmployee.

 */

//code

/*
class Employee {
    private int employeeNumber;
    private double basicSalary;
    private double allowance;
    private double netSalary;

    // Constructor to initialize the employee object with employee number and basic salary
    public Employee(int employeeNumber, double basicSalary) {
        this.employeeNumber = employeeNumber;
        this.basicSalary = basicSalary;
    }

    // Method to calculate the net salary
    public void calculateNetSalary() {
        if (basicSalary > 100000) {
            allowance = 0.10 * basicSalary;
        } else {
            allowance = 0;
        }
        netSalary = basicSalary + allowance;
    }

    // Method to display the employee's details
    public void display() {
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowance: $" + allowance);
        System.out.println("Net Salary: $" + netSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(12345, 120000); // Employee number and basic salary

        // Calculate net salary
        employee.calculateNetSalary();

        // Display employee details
        employee.display();
    }
}


 */


//Java Overloading and GUI..............................................................................
//........................................................................................................

//111111111111111111111111111111111111111111111111111111111111

/*

1. Write a program to find the maximum between two numbers.
a. Define the main class for the program
b. Define the main method
c. Define the attributes of the class
d. A method to findMax() that find the maximum between two integer numbers (int
data type)
2. Modify the above program to find the maximum values for the following.
a. A method to find the maximum between two floating point numbers (float data
type)
b. A method to find the maximum between the doubles (double data type)

 */

// code

/*


public class Main {
    // Method to find the maximum between two integer numbers
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    // Method to find the maximum between two floating point numbers
    public static float findMax(float a, float b) {
        return (a > b) ? a : b;
    }

    // Method to find the maximum between two double numbers
    public static double findMax(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        // Find the maximum between two integers
        int maxInt = findMax(10, 20);
        System.out.println("Maximum integer value: " + maxInt);

        // Find the maximum between two floating point numbers
        float maxFloat = findMax(10.5f, 20.7f);
        System.out.println("Maximum float value: " + maxFloat);

        // Find the maximum between two double numbers
        double maxDouble = findMax(10.123, 20.456);
        System.out.println("Maximum double value: " + maxDouble);
    }
}


 */

//2222222222222222222222222222222222222222222222222222222222222222222222222222222

/*

Write a java program to the scenario described below using method overloading and inheritance
in java.
1. Implement method overloading with the name – method ( )
2. Declare three classes with names A, B and C that form a hierarchy where A is the super
class, B is the sub class of A and C is the sub class of B.
3. In class A, a method named method () is implemented without parameters.
4. In class B, the method named method () is implemented with one parameter of type int.
5. In class C, the method named method () is implemented with one parameter of type double

 */

// code

/*


class A {
    void method() {
        System.out.println("Class A's method without parameters");
    }
}

class B extends A {
    void method(int value) {
        System.out.println("Class B's method with int parameter: " + value);
    }
}

class C extends B {
    void method(double value) {
        System.out.println("Class C's method with double parameter: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        A objectA = new A();
        B objectB = new B();
        C objectC = new C();

        objectA.method(); // Calls method in class A
        objectB.method(); // Calls method in class A (inherited)
        objectB.method(10); // Calls method in class B
        objectC.method(); // Calls method in class A (inherited)
        objectC.method(20); // Calls method in class B (inherited)
        objectC.method(3.14); // Calls method in class C
    }
}


 */

// Abstraction in Java.....................................................................................
//  ....................................................................................................

//11111111111111111111111111111111111111111111111111111111

/*
1. Write a program using abstraction in java.
a. Create an abstract class – Animal.
b. Create an abstract method – animalSound ( ).
c. Define a regular method – sleep ( ).
d. Create a subclass – Cow by inheriting the Animal class and define the methods.
e. Create the main class, create the object and call the methods.
f. Try to create an object for the Animal class and discuss the output.

 */

// code

/*


abstract class Animal {
    // Abstract method
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Animal sleeps");
    }
}

// Subclass Cow
class Cow extends Animal {
    // Implementation of the abstract method
    public void animalSound() {
        System.out.println("Cow says 'Moo'");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the Cow class
        Cow cow = new Cow();

        // Call methods on the Cow object
        cow.animalSound(); // Calls the overridden method in Cow
        cow.sleep(); // Calls the inherited method from Animal class

        // You cannot create an object of an abstract class
        // Animal animal = new Animal(); // This will result in a compilation error
    }
}


 */

// 22222222222222222222222222222222222222222222222222222

/*

1. Write a program to calculate the area of the shapes given.
a. Create an abstract class called ObjectArea with the abstract method area ( ).
b. Create a subclass Square which extends the ObjectArea class and perform the area
calculation of square.
c. Create a subclass Triangle which extends the ObjectArea class and perform the
area calculation of triangle.
d. Next, create the AreaTest class with the main method. Within this class,
i. Create the objects sqr and tri for Square and Triangle respectively.
ii. By passing the values for each shape created, perform the area calculation and
call the method

 */

// Abstract class ObjectArea

/*
abstract class ObjectArea {
    public abstract double area();
}

// Subclass Square
class Square extends ObjectArea {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

// Subclass Triangle
class Triangle extends ObjectArea {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Main class AreaTest
public class Main {
    public static void main(String[] args) {
        // Create objects for Square and Triangle
        Square sqr = new Square(5.0);
        Triangle tri = new Triangle(4.0, 3.0);

        // Calculate and display the areas
        System.out.println("Area of Square: " + sqr.area());
        System.out.println("Area of Triangle: " + tri.area());
    }
}


 */

// 33333333333333333333333333333333333333333333333333333333333333333333333333

/*

1. Write a program to perform mathematical operation.
a. Create an abstract class called Calculation with the abstract method calculate().
b. Create a subclass Addition which extends the Calculation class and perform the
addition operation.
c. Create a subclass Subtraction which extends the Calculation class and perform the
subtraction operation.
d. Create a subclass Multiplication which extends the Calculation class and perform
the multiplication operation.
e. Create a subclass Division which extends the Calculation class and perform the
division operation.
f. Next, create the Calculation class with the main method. Within this class,
i. Create the objects add, subt, mult and div for Addition, Subtraction,
Multiplication and Division respectively.
ii. By passing the values for each object created, perform the mathematical
operations.

 */

// Abstract class Calculation

/*
abstract class Calculation {
    public abstract double calculate(double num1, double num2);
}

// Subclass Addition
class Addition extends Calculation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

// Subclass Subtraction
class Subtraction extends Calculation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

// Subclass Multiplication
class Multiplication extends Calculation {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}

// Subclass Division
class Division extends Calculation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
    }
}

// Main class Calculation
public class Main {
    public static void main(String[] args) {
        // Create objects for Addition, Subtraction, Multiplication, and Division
        Addition add = new Addition();
        Subtraction subt = new Subtraction();
        Multiplication mult = new Multiplication();
        Division div = new Division();

        // Perform mathematical operations and display results
        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Addition: " + add.calculate(num1, num2));
        System.out.println("Subtraction: " + subt.calculate(num1, num2));
        System.out.println("Multiplication: " + mult.calculate(num1, num2));
        System.out.println("Division: " + div.calculate(num1, num2));
    }
}


 */

//Interface in Java ...................................................................................
// ................................................................................................

//1111111111111111111111111111111111111111111111111111111

/*
Create a simple interface – Cricketer with a final variable - Id and abstract method – bowl. Then
create a class that implements the interface. Implement the capabilities of the interface and test the
program with a driver code.


 */
// code

/*


interface Cricketer {
    final int Id = 10; // Final variable

    void bowl(); // Abstract method
}

// Create a class that implements the Cricketer interface
class CricketPlayer implements Cricketer {
    @Override
    public void bowl() {
        System.out.println("Cricket player is bowling.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the class that implements the Cricketer interface
        Cricketer cricketer = new CricketPlayer();

        // Access the final variable and call the abstract method
        System.out.println("Cricketer ID: " + Cricketer.Id);
        cricketer.bowl();
    }
}


 */

//222222222222222222222222222222222222222222222222222222222222222222222222

/*

Create an interface – Vehicle that interfaces the vehicles such as bicycle and car and put all their
common functionalities together

 */
//code

/*


interface Vehicle {
    void changeGear(int newGear); // Abstract method to change the gear
    void speedUp(int increment); // Abstract method to speed up
    void applyBrakes(int decrement); // Abstract method to apply brakes
}

// Implement the Bicycle class based on the Vehicle interface
class Bicycle implements Vehicle {
    private int gear;
    private int speed;

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void displayInfo() {
        System.out.println("Bicycle - Gear: " + gear + ", Speed: " + speed);
    }
}

// Implement the Car class based on the Vehicle interface
class Car implements Vehicle {
    private int gear;
    private int speed;

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void displayInfo() {
        System.out.println("Car - Gear: " + gear + ", Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bicycle();
        Vehicle car = new Car();

        bike.changeGear(3);
        bike.speedUp(20);
        bike.applyBrakes(5);

        car.changeGear(4);
        car.speedUp(60);
        car.applyBrakes(10);

        ((Bicycle) bike).displayInfo();
        ((Car) car).displayInfo();
    }
}

*/

//33333333333333333333333333333333333333333333333333333333333333333333

/*
Write a program to develop an interface Drawable.
a. Your interface should include
i. Method draw();
ii. And a default method message() to display the message “Welcome to
Interface in Java”
b. Next create a class Rectangle that implements the Drawable interface.
i. Include a method draw () and display the message “Draw a Rectangle”.
c. Finally create a TestInterface class with the main () method. Within this class,
i. Create an object rect.
ii. Call the methods draw () and message () for the object created.

 */

//code

/*


interface Drawable {
    void draw(); // Abstract method
    default void message() {
        System.out.println("Welcome to Interface in Java");
    }
}

// Implement the Rectangle class based on the Drawable interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}

// Main class TestInterface
public class Main {
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle rect = new Rectangle();

        // Call the methods from the interface and the class
        rect.draw(); // Calls the Rectangle class's draw() method
        rect.message(); // Calls the default method from the interface
    }
}


 */