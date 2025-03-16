import java.util.*;

public class Main {
    public static void sum_till(int num){
      int count = 0;
      for (int i =1; i<=num; i++){
        count += i;
      }
      System.out.println("Sum is: "+count);
    }
    
    public static void main(String[] args) {
      sum_till(10);
  }
}
