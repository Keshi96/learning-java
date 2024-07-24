public class Casting{

    public static void main(String[]args){

        byte x = 3;
        int y = x + 3; //Implicit casting

        double z = 4.1;
        int w = (int)z + 2; //Explicit casting

        String r = "2";
        int f = Integer.parseInt(r) + 4;

        System.out.println(y);
        System.out.println(w);
        System.out.println(f);
    }
}