import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        int numero, quantHoras;
        double valorHoraTrab, salario;
    
        Scanner reader = new Scanner(System.in);

        numero = reader.nextInt();
        quantHoras = reader.nextInt();
        valorHoraTrab = reader.nextDouble();
        salario = quantHoras * valorHoraTrab;
    
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);

 
    }
 
}