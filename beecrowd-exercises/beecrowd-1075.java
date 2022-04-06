import java.util.Scanner;

// Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.
class Main {
  public static void main(String[] args) {
    int N;
    
    Scanner reader = new Scanner(System.in);
    N = reader.nextInt();

    for(int counter = 1; counter < 10000; counter++) {
      if(counter % N == 2) {
        System.out.println(counter);
      }
    }
  }
}