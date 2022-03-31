import java.util.Scanner;

class Exercicio4 {
  public static void main(String[] args) {
    int a, b;

    Scanner reader = new Scanner(System.in);
    a = reader.nextInt();
    b = reader.nextInt();

    System.out.println((a % b == 0) ? "a é divisível por b" : "a não é divisível por b");
  }
}