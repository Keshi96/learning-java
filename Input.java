import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:" );
        Byte result = scanner.nextByte();

        Scanner scan = new Scanner(System.in);
        System.out.print("Name:" );
        String result2 = scan.nextLine();

        System.out.println("You are " + result + " years old");
        System.out.println("And your Name is " + result2);
    }
}