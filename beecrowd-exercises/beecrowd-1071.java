/*
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. 
Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int X, Y, sum;

    Scanner reader = new Scanner(System.in);
    X = reader.nextInt();
    Y = reader.nextInt();

    sum = 0;

    if (X < Y) { 
      for(int counter = X + 1; counter < Y; counter ++) {
        if(counter % 2 != 0){
          sum += counter;
        }
      }
    } else {
      for(int counter = Y + 1; counter < X; counter ++) {
        if(counter % 2 != 0){
          sum += counter;
        }
    }
    
      System.out.println(sum);
    }
  }
}