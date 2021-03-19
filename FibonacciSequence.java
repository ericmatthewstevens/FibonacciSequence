import java.util.Scanner;
public class FibonacciSequence {

  public static int count;

  public static int fibCount() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("How many intervals would you like to view in the sequence?");
    count = scanner.nextInt();

    scanner.close();
    return count;
  }

  public static void fibSequence(int count) {

    int firstInt = 0;
    int secondInt = 1;
    int sum = 0;

    for(int i = 0; sum <= count; i++) {
      sum = firstInt + secondInt;
      System.out.println(firstInt + " + " + secondInt + " = " + sum);
      firstInt = secondInt;
      secondInt = sum;
    }

  }

}
