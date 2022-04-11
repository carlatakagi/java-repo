/*Implemente um programa que leia da entrada as notas de
prova de 12 estudantes e mostre na sa´ıda a m´edia das provas. */

import java.util.Scanner;

class Exercicio4 {
  public static void main(String[] args) {
    int nota, counter;
    double media, totalNotas = 0;

    Scanner reader = new Scanner(System.in);

    for(counter = 0; counter < 12; counter++) {
      nota = reader.nextInt();
      if(nota >= 0) {
        totalNotas = nota + totalNotas; 
      }
      
    }
    media = totalNotas / 12;
    System.out.println(media);
  }
}