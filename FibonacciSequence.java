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

    int firstInt, secondInt, sum = 0;
    fibCount();

    for(int i = 0; i == count; i++) {
      firstInt = i;
      secondInt = firstInt + 1;
      sum = firstInt + secondInt;
      System.out.println(firstInt + " + " + secondInt + " = " + sum);
      firstInt = secondInt;
      secondInt = sum;
      if (sum == count) {
        System.exit(0);
      }
    }

  }

}