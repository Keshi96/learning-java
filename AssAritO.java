public class AssAritO{
    public static void main(String[] args) {
        
        byte x = 23;
        //x++;
          x += 2;
          
        byte y = x++;
        
        x++; //Independent copying of values by primitive datatype

        int v = Math.pow(2,2);
        System.out.println(y);
        System.out.println(x);
    }
}