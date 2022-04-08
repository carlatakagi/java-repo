import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int password;

    Scanner reader = new Scanner(System.in);
    password = reader.nextInt();

    while (password != 2002) {
      System.out.println("Senha Invalida");
      password = reader.nextInt();
    } 
      System.out.println("Acesso Permitido");
  }
}