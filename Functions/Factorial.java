import java.util.*;

public class Main {
    public static void fact(int a){
      int count = 1;
      for (int i = 1; i <= a; i++){
        count = count * i;
      }
      System.out.println("Factorial is: "+count);
    }
  
    public static void main(String[] args) {
      fact(6);
}
}
