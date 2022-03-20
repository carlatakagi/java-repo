import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double A, B, C, triangulo, trapezio, circulo, quadrado, retangulo, pi;

    Scanner reader = new Scanner(System.in);

    A = reader.nextDouble();
    B = reader.nextDouble();
    C = reader.nextDouble();

    pi = 3.14159;
    triangulo = (A * C)/2;
    circulo = pi * (Math.pow(C, 2));
    trapezio = ((A + B)/2) * C;
    quadrado = (Math.pow(B, 2));
    retangulo = A * B;

    System.out.printf("TRIANGULO: %.3f\n", triangulo);
    System.out.printf("CIRCULO: %.3f\n", circulo);
    System.out.printf("TRAPEZIO: %.3f\n", trapezio);
    System.out.printf("QUADRADO: %.3f\n", quadrado);
    System.out.printf("RETANGULO: %.3f\n", retangulo);
  }
}