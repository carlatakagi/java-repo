import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    DecimalFormat decimalNumber = new DecimalFormat(".0");

    double n1, n2, n3, n4, media, notaExame, notaFinalExame;

    Scanner reader = new Scanner(System.in);
    n1 = reader.nextDouble();
    n2 = reader.nextDouble();
    n3 = reader.nextDouble();
    n4 = reader.nextDouble();
    media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / 10.0;

    System.out.println("Media: " + decimalNumber.format(media));
    
    if(media >= 7.0) {
      System.out.println("Aluno aprovado.");  
    } else if(media < 5.0) {
      System.out.println("Aluno reprovado.");  
    } else {
      System.out.println("Aluno em exame.");

      notaExame = reader.nextDouble();
      notaFinalExame = (media + notaExame)/2.0;

      System.out.println("Nota do exame: " + decimalNumber.format(notaExame));

      if(notaFinalExame >= 5.0) {
        System.out.println("Aluno aprovado.");
      } else if(notaFinalExame <= 4.9) {
        System.out.println("Aluno reprovado.");
      }
      System.out.println("Media final: " + decimalNumber.format(notaFinalExame));  
    }

  }
}