import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String funcionario;
    double salarioFixo, totalVendas, comissao, salarioFinal;

    Scanner reader = new Scanner(System.in);

    funcionario = reader.next();
    salarioFixo = reader.nextDouble();
    totalVendas = reader.nextDouble();
    comissao = totalVendas * 0.15;
    salarioFinal = salarioFixo + comissao;

    System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
    
  }
}