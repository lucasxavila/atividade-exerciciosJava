import java.util.Scanner;

public class Atvd19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números deseja inserir? ");
    int n = scanner.nextInt();

    int[] numeros = new int[n];

    for (int i = 0; i < n; i++) {
      int numero;
      do {
        System.out.print("Digite o " + (i + 1) + "º número (entre 0 e 1000): ");
        numero = scanner.nextInt();
      } while (numero < 0 || numero > 1000);
      numeros[i] = numero;
    }

    int menor = numeros[0];
    for (int num : numeros) {
      if (num < menor) {
        menor = num;
      }
    }

    int maior = numeros[0];
    for (int num : numeros) {
      if (num > maior) {
        maior = num;
      }
    }

    int soma = 0;
    for (int num : numeros) {
      soma += num;
    }

    System.out.println("Menor valor: " + menor);
    System.out.println("Maior valor: " + maior);
    System.out.println("Soma dos valores: " + soma);
  }
}