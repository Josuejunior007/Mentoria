package monitoria;
import java.util.Scanner;
public class vetor_atividade_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[10];
        double valorMenor = 0, valorMaior = 0;


        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();

            if (i==0){

                valorMenor = vetor[i];
                valorMaior = vetor[i];

            }

            else if (valorMaior < vetor[i]){

                valorMaior = vetor[i];

            } else if (valorMenor > vetor[i]) {

                valorMenor = vetor[i];

            }

        }

        System.out.print("O menor valor é: "+ valorMenor
        + "\nO maior valor é: "+ valorMaior);

    }
}
