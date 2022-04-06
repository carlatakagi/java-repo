import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int N, X;
    
    Scanner reader = new Scanner(System.in);
    N = reader.nextInt();

    for(int counter = 0; counter < N; counter++) {
        X = reader.nextInt();
      if(X == 0) {
        System.out.println("NULL");
      } else if (X % 2 == 0 && X < 0) {
        System.out.println("EVEN NEGATIVE");
      } else if (X % 2 == 0 && X > 0) {
        System.out.println("EVEN POSITIVE");
      } else if (X % 2 != 0 && X > 0) {
        System.out.println("ODD POSITIVE");
      } else if (X % 2 != 0 && X < 0) {
        System.out.println("ODD NEGATIVE");
      }
    }
}