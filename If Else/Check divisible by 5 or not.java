package javaInput;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    num = sc.nextInt();
    if (num % 5 == 0) System.out.println("Divisible by 5");
    else System.out.println("Not Divisible by 5");
  }

}
