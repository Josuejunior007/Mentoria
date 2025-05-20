package monitoria;

public class vetor_atividade_1 {

    public static void main(String[] args) {

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        vetor1[0] = 2;
        vetor1[1] = 4;
        vetor1[2] = 6;
        vetor1[3] = 10;
        vetor1[4] = 20;
        vetor1[5] = 100;
        vetor1[6] = 36;
        vetor1[7] = 50;
        vetor1[8] = 98;
        vetor1[9] = 44;

        for (int i = 0; i < vetor1.length; i++) {

            vetor2[i] = vetor1[i];


            System.out.println(vetor1[i] +"     "+ vetor2[i]);

        }

        

    }
}
