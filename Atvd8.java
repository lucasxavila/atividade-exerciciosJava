import java.util.Scanner;

public class Atvd8
{
  public static void main(String[] args)
  {
    Scanner teclado = new Scanner(System.in);
    int cont = 1;
    double soma = 0, media, num;

    while (cont <= 5){
      System.out.print("Digite o " + cont + "º número: ");
      num = teclado.nextDouble();
      soma = soma + num;
      cont++;
    }
    
    media = soma/5;
    
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + media);
  }
}