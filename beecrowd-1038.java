import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int cod, quantity;
    double totalHotDog, totalXsalada, totalXbacon, totalTorrada, totalRefri;

    Scanner reader = new Scanner(System.in);
    cod = reader.nextInt();
    quantity = reader.nextInt();
    totalHotDog = quantity * 4.00;
    totalXsalada = quantity * 4.50;
    totalXbacon = quantity * 5.00;
    totalTorrada = quantity * 2.00;
    totalRefri = quantity * 1.50;
    
    if (cod == 1) {
      System.out.printf("Total: R$ %.2f\n", totalHotDog);
    } if (cod == 2) {
      System.out.printf("Total: R$ %.2f\n", totalXsalada);
    } if (cod == 3) {
      System.out.printf("Total: R$ %.2f\n", totalXbacon);
    } if (cod == 4) {
      System.out.printf("Total: R$ %.2f\n", totalTorrada);
    } if (cod == 5) {
      System.out.printf("Total: R$ %.2f\n", totalRefri);
    }
    
  }
}