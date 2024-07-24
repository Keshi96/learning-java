import java.text.NumberFormat;

public class NumForm{
    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(3546374.62);
        //String result2 = currency.for

        String percent = NumberFormat.getPercentInstance().format(0.2);
        
        System.out.println(result);
        System.out.println(percent);
    }

}