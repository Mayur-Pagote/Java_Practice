import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter starting number: ");
      int start = sc.nextInt();
      
      System.out.println("Enter ending number: ");
      int end = sc.nextInt();
      
      for (int i = start; i<=end; i++){
        System.out.println(i);
      }
      
  }
}
