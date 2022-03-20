import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int numero, nota, quantMin, numeroAtual;

    Scanner reader = new Scanner(System.in);

    numero = reader.nextInt();
    System.out.println(numero);

    numeroAtual = numero;
    
    nota = 100;
    quantMin = numeroAtual / nota;
    System.out.println(quantMin + "nota(s) de R$ 100,00");
    numeroAtual = numeroAtual % nota;

    nota = 50;
    quantMin = numeroAtual / nota;
    System.out.println(quantMin + "nota(s) de R$ 50,00");
    numeroAtual = numeroAtual % nota;

    nota = 20;
    quantMin = numeroAtual / nota;
    System.out.println(quantMin + "nota(s) de R$ 20,00");
    numeroAtual = numeroAtual % nota;

    nota = 10;
    quantMin = numeroAtual / nota;
    System.out.println(quantMin + "nota(s) de R$ 10,00");
    numeroAtual = numeroAtual % nota;

    nota = 5;
    quantMin = numeroAtual / nota;
    System.out.println(quantMin + "nota(s) de R$ 5,00");
    numeroAtual = numeroAtual % nota;
    
    nota = 2;
    quantMin = numeroAtual / nota;
    System.out.println(quantMin + "nota(s) de R$ 2,00");
    numeroAtual = numeroAtual % nota;

    nota = 1;
    quantMin = numeroAtual / nota;
    System.out.println(quantMin + "nota(s) de R$ 1,00");
    numeroAtual = numeroAtual % nota;
  }
}