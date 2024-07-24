import java.util.Scanner;

public class FizzPro{
    public static void main(String[] args) {
    
    final byte firstFactor = 5;
    final byte secondFactor = 3;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    short number = scanner.nextShort();
    int x = number % firstFactor;
    int y = number % secondFactor;

    if ((x==0) && (y==0))
    System.out.println("FizzBuzz");     

    else if (y==0)
    System.out.println("Buzz");

    else if(x==0) 
    System.out.println("Fizz");

    else 
    System.out.println(number);
        
    }
}