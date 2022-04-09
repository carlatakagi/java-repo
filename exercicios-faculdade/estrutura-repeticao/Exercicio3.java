/* Implemente um programa que leia da entrada 10 n´umeros
inteiros e mostre na sa´ıda quantos s˜ao negativos. */
import java.util.Scanner;

class Exercicio3 {
  public static void main(String[] args) {
    int num, counter, aux = 0;

    Scanner reader = new Scanner(System.in);

    for (counter = 0; counter < 10; counter++) {
      num = reader.nextInt();
      if (num < 0) {
        aux = aux + 1;
        System.out.println(aux);
      }
    }
  }
}