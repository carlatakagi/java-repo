/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal
Apresente a média ponderada para cada um destes conjuntos de 3 valores,
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha.
Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int number;
    double teste1, teste2, teste3, total, media;

    Scanner reader = new Scanner(System.in);
    number = reader.nextInt();

    for (int i = 0; i < number; i++) {
      teste1 = reader.nextDouble();
      teste2 = reader.nextDouble();
      teste3 = reader.nextDouble();
      total = (teste1 * 2) + (teste2 * 3) + (teste3 * 5);
      media = total / 10;
      System.out.printf("%.1f\n", media);
    }
  }
}