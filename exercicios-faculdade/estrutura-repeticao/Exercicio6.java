/*
Implemente um programa que receba da entrada um n´umero
inteiro positivo n, calcule e imprima na sa´ıda o valor dos n
primeiros inteiros positivos.
*/

import java.util.Scanner;

class Exercicio6 {
  public static void main(String[] args) {
    int n, aux = 0; 

    Scanner reader = new Scanner(System.in);
    n = reader.nextInt();

    for (int i = 0; i < n; i++) {
      if(n > 0) {
        i += n;
        System.out.println(i);
      }
    }
  }
}