import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;
        
        do
        {
            displayMenu();
            choice = input.nextInt();
            
            switch (choice)
            {
                //Addition
                case 1:
                    System.out.print("Enter first number: ");
                    double add1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double add2 = input.nextDouble();
                    double sum = addition(add1, add2);
                    System.out.print("Result " + sum);
                    break;
                    
                //Substraction
                case 2:
                    System.out.print("Enetr first number");
                    double sub1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double sub2 = input.nextDouble();
                    double difference = subtraction(sub1, sub2);
                    System.out.println("Result: " + difference);
                    break;
                    
                //Multiplication
                case 3:
                    System.out.print("Enter first number: ");
                    double mul1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double mul2 = input.nextDouble();
                    double product = multiplication(mul1, mul2);
                    System.out.println("Result: " + product);
                    break;
                    
                //Division
                case 4:
                    System.out.print("Enter numerator: ");
                    double div1 = input.nextDouble();
                    System.out.print("Enter denominator: ");
                    double div2 = input.nextDouble();
                    if (div2 != 0)
                    {
                        double quotient = division(div1, div2);
                        System.out.println("Result: " + quotient);
                    }
                    else
                    {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                    
                //Power
                case 5:
                    System.out.print("Enter base: ");
                    double base = input.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = input.nextDouble();
                    double powerResult = power(base, exponent);
                    System.out.println("Result: " + powerResult);
                    break;
                    
                //Square Root
                case 6:
                    System.out.print("Enter number: ");
                    double sqrtNum = input.nextDouble();
                    if (sqrtNum >= 0) 
                    {
                        double sqrtResult = squareRoot(sqrtNum);
                        System.out.println("Result: " + sqrtResult);
                    } else
                    {
                        System.out.println("Negative number has no real square root.");
                    }
                    break;
                    
                //Area of circle
                case 7:
                    System.out.print("Enter radius: ");
                    double radius = input.nextDouble();
                    double areaCircle = areaOfCircle(radius);
                    System.out.println("Area of circle: " + areaCircle);
                    break;
                    
                //Circumferance of cicrle
                case 8:
                    System.out.print("Enter radius: ");
                    double radCirc = input.nextDouble();
                    double circumference = circumferenceOfCircle(radCirc);
                    System.out.println("Circumference: " + circumference);
                    break;
                    
                //Area of rectangle
                case 9:
                    System.out.print("Enter length: ");
                    double length = input.nextDouble();
                    System.out.print("Enter width: ");
                    double width = input.nextDouble();
                    double areaRect = areaOfRectangle(length, width);
                    System.out.println("Area of rectangle: " + areaRect);
                    break;
                    
                //Factorial
                case 10:
                System.out.print("Enter a positive integer: ");
                    int num = input.nextInt();
                    if (num >= 0) 
                    {
                        long factorialResult = factorial(num);
                        System.out.println("Factorial: " + factorialResult);
                    } else
                    {
                        System.out.println("Factorial is undefined for negative numbers.");
                    }
                    break;
                    
                //Exit
                case 0:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }while (choice != 0);
        input.close();
    }
    
    


//Subroutine methods

    public static void displayMenu()
    {
        System.out.println("Math Menu");
        System.out.println("1) Addition");
        System.out.println("2) Substraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Power");
        System.out.println("6) Square Root");
        System.out.println("7) Area of Circle");
        System.out.println("8) Circumference of circle");
        System.out.println("9) Area of Rectangle");
        System.out.println("10) Factorial");
        System.out.println("0) Exit");
        System.out.println("Enetr choice: ");
    }

    public static double addition(double a, double b)
    {
        return a + b;
    }
    public static double subtraction(double a, double b)
    {
        return a - b;
    }
    public static double multiplication(double a, double b)
    {
        return a * b;
    }
    public static double division(double a, double b)
    {
        return a / b;
    }
    public static double power(double base, double exp)
    {
        return Math.pow(base, exp);
    }
    public static double squareRoot(double num)
    {
        return Math.sqrt(num);
    }
    public static double areaOfCircle(double radius)
    {
        return Math.PI * radius * radius;
    }
    public static double circumferenceOfCircle(double radius)
    {
        return 2 * Math.PI * radius;
    }
    public static double areaOfRectangle(double length, double width)
    {
        return length * width;
    }
    public static long factorial(int num)
    {
        long result = 1;
        for (int i = 1; i <= num; i++)
        {
            result *= i;
        }
        return result;
    }
}