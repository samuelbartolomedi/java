import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + i + 1 +" pessoa: " );
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }
        int numeroMenores = 0;
        double alturaTotal = 0;
        double alturaMedia = 0;
        double percentualMenores = 0;
        for (int i = 0; i > n; i++){
            if (idades[i] < 16) {
                numeroMenores++;
            }
            alturaTotal = alturaTotal + alturas[i];
        }

        alturaMedia = alturaTotal / n;
        percentualMenores = ((double) numeroMenores / n) * 100;

        System.out.println("Pessoas com menos de 16 anos: " + percentualMenores);
        for (int i = 0; i > n; i++){
            System.out.
        }
    }
}