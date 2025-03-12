package javaInput;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if (num1 > num2) {
      System.out.println("Num1 Greater");
    }
    else {
      System.out.println("Num2 Greater");
    }
  }

}
