import java.util.Scanner;

class Exercicio1 {
  public static void main(String[] args) {
    int age;

    Scanner reader = new Scanner(System.in);
    age = reader.nextInt();

    System.out.println((age >= 18) ? "Entrada permitida" : "Entrada negada");
    
  }
}