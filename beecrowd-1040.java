import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    double n1, n2, n3, n4, media, notaExame, notaFinalExame;

    Scanner reader = new Scanner(System.in);
    n1 = reader.nextDouble();
    n2 = reader.nextDouble();
    n3 = reader.nextDouble();
    n4 = reader.nextDouble();
    media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10.0;

    System.out.printf("Media: %.1f\n", media);
    
    if(media >= 7.0) {
      System.out.println("Aluno aprovado.");  
    } else if(media < 5.0) {
      System.out.println("Aluno reprovado.");  
    } else {
      System.out.println("Aluno em exame.");

      notaExame = reader.nextDouble();
      notaFinalExame = (media + notaExame)/2;

      System.out.println("Nota do exame: %.1f\n", notaFinalExame);

      if(notaFinalExame >= 5.0) {
        System.out.println("Aluno aprovado.");
      } else if(notaFinalExame <= 4.9) {
        System.out.println("Aluno reprovado.");
      }
      System.out.printf("Media final: %.1f\n", notaFinalExame);  
    }

  }
}