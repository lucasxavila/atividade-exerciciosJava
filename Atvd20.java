import java.util.Scanner;

public class Atvd20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char continuar;
    do {
      System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial: ");
      int numero = scanner.nextInt();  
      if (numero < 0 || numero >= 16) {
        System.out.println("Erro: O número deve ser positivo e menor que 16.");
      } else {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
          fatorial *= i;
        }
        System.out.println(numero + "! = " + fatorial);
      }
      System.out.print("Deseja calcular outro fatorial? (s/n): ");
      continuar = scanner.next().charAt(0);
    } while (continuar == 's' || continuar == 'S');
    System.out.println("Programa encerrado.");
  }
}