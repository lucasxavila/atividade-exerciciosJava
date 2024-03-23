import java.util.Scanner;

public class Atvd33 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num, resultado = 1; 

    System.out.println("Digite um número para calcular o seu fatorial:");
    num = teclado.nextInt();
    System.out.println(" Fatorial de " + num);

    for (int i = 1; i <= num; i++) {
      resultado *= i;
      if (i < num) {
        System.out.print(i + " * ");
      } else {
        System.out.print(i);
      }
    }
    System.out.println(" = " + resultado);
  }
}