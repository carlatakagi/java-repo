/*
Implemente um programa que receba de entrada um n´umero
inteiro x e um n´umero inteiro positivo n, calcule e mostre na
sa´ıda o valor de x^n
.
*/

import java.util.Scanner;

class Exercicio5 {
  public static void main(String[] args) {
    int x, n;

    Scanner reader = new Scanner(System.in);
    x = reader.nextInt();
    n = reader.nextInt();

    System.out.println(Math.pow(x, n));
  }
}