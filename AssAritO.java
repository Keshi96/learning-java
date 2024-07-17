public class AssAritO{
    public static void main(String[] args) {
        
        byte x = 23;
        //x++;
          x += 2;
          
        byte y = x++;
        
        x++; //Independent copying of values by primitive datatype
        System.out.println(y);
        System.out.println(x);
    }
}