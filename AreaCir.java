import java.util.Scanner;

public class AreaCir {
    public static void main(String[] args) {
        final float pi = 3.142F;
        final byte square = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        float radius = scanner.nextFloat();

        float result = pi * ((int)Math.pow(radius,square));


        System.out.println("Area of Circle is " + result);

        
    }
}
