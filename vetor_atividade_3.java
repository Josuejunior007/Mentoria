package monitoria;

import java.util.Arrays;

public class vetor_atividade_3 {

    public static void main(String[] args) {

        int[] vetor1 = new int[5];
        vetor1[0] = 1;
        vetor1[1] = 2;
        vetor1[2] = 3;
        vetor1[3] = 4;
        vetor1[4] = 5;
        int[] vetor2 = new int[5];
        vetor2[0] = 5;
        vetor2[1] = 6;
        vetor2[2] = 7;
        vetor2[3] = 8;
        vetor2[4] = 9;
        int[] vetor3 = new int[vetor1.length + vetor2.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i];

        }

        for (int i = 0; i < vetor2.length; i++) {
            vetor3[i + vetor1.length] = vetor2[i];

        }

        for (int i = 0; i < vetor3.length; i++) {

            System.out.println(vetor3[i]);
        }

    }
}
