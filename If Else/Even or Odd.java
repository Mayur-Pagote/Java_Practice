package javaInput;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    num = sc.nextInt();
    if (num % 2 == 0) System.out.println("Even");
    else System.out.println("Odd");
  }

}
