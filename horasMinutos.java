package monitoria;
import java.util.Scanner;
public class horasMinutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double horas, minutos;

        System.out.print("Informe a hora: ");
        horas = sc.nextDouble();

        minutos = horas * 60;

        System.out.print("A quantidade de minutos em "+horas+" horas é de: "+minutos);

    }
}
