import java.util.Scanner;

public class Atvd44 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int voto;
    int totalVotosCandidato1 = 0;
    int totalVotosCandidato2 = 0;
    int totalVotosCandidato3 = 0;
    int totalVotosCandidato4 = 0;
    int totalVotosNulos = 0;
    int totalVotosBrancos = 0;
    int totalVotos = 0;

    System.out.println("Eleições Presidenciais");
    System.out.println("Informe seu voto (ou digite 0 para encerrar a votação):");

    while (true) {
      voto = scanner.nextInt();

      if (voto == 0) {
        break;
      }
      switch (voto) {
        case 1:
          totalVotosCandidato1++;
          break;
        case 2:
          totalVotosCandidato2++;
          break;
        case 3:
          totalVotosCandidato3++;
          break;
        case 4:
          totalVotosCandidato4++;
          break;
        case 5:
          totalVotosNulos++;
          break;
        case 6:
          totalVotosBrancos++;
          break;
        default:
          System.out.println("Voto inválido. Tente novamente.");
          continue;
      }
      totalVotos++;
    }
    System.out.println("Resultado da Eleição:");
    System.out.println("Total de votos para o Candidato 1: " + totalVotosCandidato1);
    System.out.println("Total de votos para o Candidato 2: " + totalVotosCandidato2);
    System.out.println("Total de votos para o Candidato 3: " + totalVotosCandidato3);
    System.out.println("Total de votos para o Candidato 4: " + totalVotosCandidato4);
    System.out.println("Total de votos nulos: " + totalVotosNulos);
    System.out.println("Total de votos em branco: " + totalVotosBrancos);
    System.out.println("Percentagem de votos nulos sobre o total de votos: " + ((double) totalVotosNulos / totalVotos) * 100 + "%");
  }
}