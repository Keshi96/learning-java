import java.text.NumberFormat;
import java.util.Scanner;

public class ProjCal{
    public static void main(String[]Args){
       
        final byte months = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: " );
        int principal = scanner.nextInt();

        
        System.out.print("Annual Interest Rate: " );
        float annualInterest = scanner.nextFloat(); 
        float monthlyInterest = (annualInterest / months) / percent;

      
        System.out.print("Period: ");
         byte years = scanner.nextByte();
        int numberOfPayment = years * months;

        double mortgage = principal * ( monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayment)) / (Math.pow(1 + monthlyInterest,numberOfPayment) - 1);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage payment: " + result);
    
    }
}
