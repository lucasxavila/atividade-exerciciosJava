import java.util.Scanner;

public class Atvd23 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro N: ");
    int N = scanner.nextInt();
    int divisoes = 0;
    System.out.println("Números primos entre 1 e " + N + ":");
    for (int i = 2; i <= N; i++) {
      boolean ehPrimo = true;
      for (int j = 2; j <= i / 2; j++) {
        divisoes++;
        if (i % j == 0) {
          ehPrimo = false;
          break;
        }
      }
      if (ehPrimo) {
        System.out.print(i + " ");
      }
    }
    System.out.println("\nNúmero total de divisões executadas: " + divisoes);
  }
}