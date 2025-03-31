import java.util.*;

public class Main {
    public static void count_digit(int num){
      int count = 0;
      while (num > 0){
        count += 1;
        num /= 10;
      }
      System.out.println("Number of Digits are: "+count);
    }
    
    public static void main(String[] args) {
      count_digit(100000);
  }
}
