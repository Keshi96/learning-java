//Customised Wrapper Class for queues and stacks

class Maximum {
   private int maxi = 0;
   private int size = 0;

    public void insert (int x){
        this.size++;
        if(x <= this.maxi)
        return;
        this.maxi=x;
   }  
public int top() {return this.maxi;}

public int numberElement(){return this.size;}
}
public class Wrap{
public static void main(String[] args) {
      
Maximum x = new Maximum();
x.insert(8);
x.insert(6);
x.insert(9);
x.insert(2);
x.insert(10);
System.out.println("The maximum number is: " + x.top());
System.out.println("The number of entries is: " + x.numberElement());
}
}
