package monitoria;
import java.util.Scanner;

public class vetor_atividade_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tabela1 = new int[10];
        int[] resultado = new int[10];

        tabela1[0] = 1;
        tabela1[1] = 2;
        tabela1[2] = 3;
        tabela1[3] = 4;
        tabela1[4] = 5;
        tabela1[5] = 6;
        tabela1[6] = 7;
        tabela1[7] = 8;
        tabela1[8] = 9;
        tabela1[9] = 10;

        int tabuada;

        System.out.print("Qual a tabuada voê quer (1 a 10)? ") ;
        tabuada = sc.nextInt();

        if (tabuada == 1) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }

        else if (tabuada == 2) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }

        else if (tabuada == 3) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }

        else if (tabuada == 4) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }

        else if (tabuada == 5) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }
        else if (tabuada == 6) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }

        else if (tabuada == 7) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }

        else if (tabuada == 8) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }

        else if (tabuada == 9) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }

        else if (tabuada == 10) {

            for (int i = 0; i < tabela1.length; i++) {

                resultado[i] = tabela1[tabuada - 1] * tabela1[i];

                System.out.println(tabela1[tabuada - 1] +" * "+ tabela1[i] + " = "+ resultado[i]  );

            }

        }

    }
}
