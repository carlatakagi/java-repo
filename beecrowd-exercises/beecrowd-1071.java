import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int X, Y, sum;

    Scanner reader = new Scanner(System.in);
    X = reader.nextInt();
    Y = reader.nextInt();

    sum = 0;

    if (X < Y) { 
      for(int counter = X + 1; counter < Y; counter ++) {
        if(counter % 2 != 0){
          sum += counter;
        }
      }
    } else {
      for(int counter = Y + 1; counter < X; counter ++) {
        if(counter % 2 != 0){
          sum += counter;
        }
    }
    
      System.out.println(sum);
    }
  }
}