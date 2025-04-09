import java.util.*;

public class Main {
    public static void main(String[] args) {
      int count = 0, num = 17;
      for (int i = 2; i<=num/2; i++){
        if (num%i == 0) {
          count += 1;
        }
      }
      if (count == 0) System.out.println("Prime");
      else System.out.println("Not Prime");
  }
}
