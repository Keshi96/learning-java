import java.util.Arrays;

public class Ref{
    public static void main(String[] args){
        
        int [] [] matrix = {{2,3,4},{5,6,7}};
        int [] numbers = {3,5,2,4,6,1};
      
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(matrix));
    }
}