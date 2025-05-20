package monitoria;

public class vetor_atividade_2 {

    public static void main(String[] args) {

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[5];

        vetor1[0] = 8;
        vetor1[1] = 4;
        vetor1[2] = 11;
        vetor1[3] = 55;
        vetor1[4] = 12;

        vetor2[0] = 4;
        vetor2[1] = 6;
        vetor2[2] = 10;
        vetor2[3] = 44;
        vetor2[4] = 87;

        for (int i = 0; i < vetor1.length; i++) {

            vetor3[i] = vetor1[i] + vetor2[i];

            System.out.println(vetor3[i]);

        }
    }
}
