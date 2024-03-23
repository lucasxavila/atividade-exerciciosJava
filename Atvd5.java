import java.util.Scanner;

public class Atvd5 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int paisA, paisB, anos;
    paisA=paisB=anos=0;
    double taxaCrescimentoA = 0;
    double taxaCrescimentoB = 0;

    System.out.print("Digite o número de habitantes do país A: ");
    if (scanner.hasNextInt()) {
      paisA = scanner.nextInt();
      if (paisA < 0) {
        System.out.println("O número de habitantes inválido. Informe novamente: ");
      }
    } while (paisA < 0);
    
    System.out.print("Digite o número de habitantes do país B: ");
    if (scanner.hasNextInt()); {
      paisB = scanner.nextInt();
      if (paisB < 0) {
        System.out.println("O número de habitantes inválido. Informe novamente: ");
      }
      if (paisB <= paisA) {
        System.out.println("O número de habitantes do país B deve ser maior que o país A. Informe novamente: ");
      }
    } while (paisB < 0);

    System.out.print("Digite a taxa de crescimento do país A: ");
    if (scanner.hasNextDouble()) {
      taxaCrescimentoA = scanner.nextDouble();
      if (taxaCrescimentoA < 0) {
        System.out.println("A taxa de crescimento inválida. Informe novamente: ");
      }
    } while (taxaCrescimentoA < 0);

    System.out.print("Digite a taxa de crescimento do país B: ");
    if (scanner.hasNextDouble()) {
      taxaCrescimentoB = scanner.nextDouble();
      if (taxaCrescimentoB < 0) {
        System.out.println("A taxa de crescimento inválida. Informe novamente: ");
      }
    } while (taxaCrescimentoB < 0);
    
    while (paisA <= paisB)
    {
      paisA += paisA * taxaCrescimentoA;
      paisB += paisB * taxaCrescimentoB;
      anos++;
    }
    System.out.println("O país A ultrapassará o país B em " + anos + " anos");
    scanner.close();
  }
}