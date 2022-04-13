import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num, maior = 0, posicao = 0;

        Scanner reader = new Scanner(System.in);
        
        for (int index = 1; index <= 100; index++) {
            num = reader.nextInt();
            if (maior > num) {
                maior = maior;
                posicao = posicao;
            } else {
                posicao = index;
                maior = num;
            }
        }
        System.out.print(maior + "\n" + posicao + "\n");
    }
}