import java.util.Scanner;

public class Atvd13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num;
    
    System.out.print("Insira um número de 1 a 10 para ver a tabuada"); 
    num = teclado.nextInt();

    while (num < 0 || num > 10) {
      System.out.println("O número informado está fora do intervalo de 1 a 10");
      num = teclado.nextInt();
    }
    System.out.println("Tabuada do " + num);
    for (int index = 1; index <= 10; index++)
    {
      System.out.println(num + " * " + index + " = " + (num*index)  );
    }
  }
}