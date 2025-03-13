import java.util.*;

public class Main {
    public static void combination (int a, int b){
      int n = 1, r = 1, com = 1, diff = a-b;
      
      for (int i = 1; i<= a; i++){
        n = n * i;
      }
      
      for (int i = 1; i<= b; i++){
        r = r * i;
      }
      
      for (int i = 1; i<= diff; i++){
        com = com * i;
      }
      
      int res = n / (r * com);
      System.out.print(res);
    }
  
    public static void main(String[] args) {
      combination(5,2);
  }
}
