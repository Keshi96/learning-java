import java.text.NumberFormat;
import java.util.Scanner;

public class ProjTwo{
    public static void main(String[] args) {
        //Updated Mortgage Calcuator Using Flow Control for error handling
        final byte months = 12;
        final byte percent = 100;

        
        
       Scanner scanner = new Scanner (System.in);
       int principal = 0;
       float annualInterest = 0;
       byte years = 0;

        while (true) 
        {
        System.out.print("Principal ($1k - $1M): " );
        principal = scanner.nextInt();
            
        if ((principal<1000) || (principal>1000000))
        System.out.println("Enter a number between 1000 and 1,000,000.");
        if ((principal<1000) || (principal>1000000))
        continue;

        if ((principal>=1000) && (principal<=1000000))
             break;
        } 
        
        
        
        System.out.print("Annual Interest Rate: " );
        //float annualInterest = scanner.nextFloat();
        while (true)
        { 
        annualInterest = scanner.nextFloat();
        if ((annualInterest>0) && (annualInterest<=30))
        break;
        System.out.println("Enter a number that is greater 0 and lesser than 30.");
        System.out.print("Annual Interest Rate: ");
        }
       float monthlyInterest = (annualInterest / months) / percent;
        
        System.out.print("Period: ");
        while (true)
        {
        years = scanner.nextByte();
        if((years>=1) && (years<=30))
        break;
        System.out.println("Enter a value from 1 and 30");
        }
        int numberOfPayment = years * months;

        double mortgage = principal * ( monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayment)) / (Math.pow(1 + monthlyInterest,numberOfPayment) - 1);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage payment: " + result);

    }   
}