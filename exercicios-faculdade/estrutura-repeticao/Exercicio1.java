/*Implemente um programa que mostre na sa´ıda os m´ultiplos de
4 compreendidos entre 1 e 100. */

class Exercicio1 {
  public static void main(String[] args) {
    int num;

    for (num = 1; num < 100; num ++) {
      if (num % 4 == 0) {
        System.out.println(num);
      }
    }
  }
}