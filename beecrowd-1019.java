import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int seconds, minutes, hour;

    Scanner reader = new Scanner(System.in);

    // horas:minutos:segundos
    seconds = reader.nextInt();
    reader.close();
    
    hour = seconds/3600;
    // valor que sobra da conversao sec para horas
    seconds = seconds - (hour * 3600);

    minutes = seconds/60;
    // valor que sobra da conversao sec para minutos
    seconds = seconds - (minutes * 60);

    System.out.println(hour + ":" + minutes + ":" + seconds);
    
  }
}