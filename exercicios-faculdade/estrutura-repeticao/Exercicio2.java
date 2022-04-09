// Implemente um programa que mostre na sa´ıda todos os núumeros pares de 2 a 50.

class Exercicio2 {
  public static void main(String[] args) {
    int numero;

    for(numero = 2; numero < 50; numero++) {
      if(numero % 2 == 0) {
        System.out.println(numero);
      }
    }
}