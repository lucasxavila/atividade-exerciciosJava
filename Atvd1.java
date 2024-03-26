import java.util.Scanner;
public class Atvd1 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int nota;

    do {
      nota = teclado.nextInt();
      if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida");
      }
    } while (nota < 0 || nota > 10)
      
    System.out.println("Nota válida: " + nota);
    scanner.close();
  }
}
