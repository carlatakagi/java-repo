import java.util.Scanner;

class Exercicio2 {
  public static void main(String[] args) {
    int X;

    Scanner reader = new Scanner(System.in);
    
    X = reader.nextInt();   
    reader.close();
    
    if(X > 0) {
      System.out.println("positivo");
    } else if (X < 0) {
      System.out.println("negativo");
    } else {
      System.out.println("nulo");
    }
  }
}