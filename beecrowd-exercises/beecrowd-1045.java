import java.io.IOException;
import java.util.Scanner;


public class Main {
  
  public static void main(String[] args) throws IOException {
    double A, B, C, auxiliar;
    
    Scanner reader = new Scanner(System.in);
    A = reader.nextDouble();
    B = reader.nextDouble();
    C = reader.nextDouble();
    
    // resolução baseada em https://github.com/eduardo-mior/URI-Online-Judge-Solutions/blob/master/Iniciante/URI%201045.java
      if (B > A && B > C) {
        auxiliar = A;
        A = B;
        B = auxiliar;
      } else if (C > A) {
        auxiliar = A;
        A = C;
        C = auxiliar;
      }
      
      if (A >= (B + C)) { 
        System.out.println("NAO FORMA TRIANGULO");
      } else {
        if (A*A == (B*B) + (C*C)) System.out.println("TRIANGULO RETANGULO");
        if (A*A > (B*B) + (C*C)) System.out.println("TRIANGULO OBTUSANGULO");
        if (A*A < (B*B) + (C*C)) System.out.println("TRIANGULO ACUTANGULO");
        if (A == B && A == C) System.out.println("TRIANGULO EQUILATERO");
        if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) System.out.println("TRIANGULO ISOSCELES");
      }

    }
}