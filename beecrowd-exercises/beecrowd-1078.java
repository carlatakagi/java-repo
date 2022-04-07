import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      int N, xablau;

      Scanner reader = new Scanner(System.in);
      N = reader.nextInt();

      for (int i = 1; i <= 10; i += 1) {
        xablau = (N * i);
        System.out.println(i +" x " + N + " = " + xablau);
      }
  }
}