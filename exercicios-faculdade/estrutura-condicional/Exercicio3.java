import java.util.Scanner;

class Exercicio3 {
  public static void main(String[] args) {
    int X;

    Scanner reader = new Scanner(System.in);
    
    X = reader.nextInt();   
    reader.close();
    
    if(X == 0) {
      System.out.println("o número é nulo");
    } else if (X % 2 == 0) {
      System.out.println("o número é par");
    } else {
      System.out.println("o número é ímpar");
    }
  }
}