import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int X;
    double Y, consumoMedio;

    Scanner reader = new Scanner(System.in);
    X = reader.nextInt();
    Y = reader.nextDouble();

    consumoMedio = X / Y;
  
    System.out.printf("%.3f km/l\n", consumoMedio);
  }
}