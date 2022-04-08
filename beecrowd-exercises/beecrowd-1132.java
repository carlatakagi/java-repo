import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int X, Y, soma;

    Scanner reader = new Scanner(System.in);
    X = reader.nextInt();
    Y = reader.nextInt();
    soma = 0;

    if(X > Y) {
      for(int i = Y; i <= X; i++) {
        if(i % 13 != 0) {
          soma += i;
        }
      }
    } else {
      for(int i = X; i <= Y; i++) {
        if(i % 13 != 0) {
          soma += i;
        }
      }
    }
    System.out.println(soma);
  }
}