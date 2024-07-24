import java.util.Scanner;

public class MatC{
    public static void main(String[]Args){

       //double x = 4.2;
        int result = (int) Math.ceil(2.1);

        int value = (int) Math.round(Math.random()*100);

        //int b = (int)Math.pow(2,8);

        //double n = Math.pow(2,2);
        //int f = (int)Math.round(Math.random()*100);
       Scanner scanner = new Scanner(System.in);
       System.out.print("Value: ");
       int valueOne = scanner.nextInt();
       final boolean x = valueOne>=1000;
       final boolean y = valueOne<=1000000;
       if (x && y)
       System.out.println("Wala");

       else 
       System.out.println("Not in range");
    
    //System.out.println(result); 
    //System.out.println(value);
    
    
    //System.out.println(x);
    }
}