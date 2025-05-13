package monitoria;
import java.util.Scanner;
public class valorcoco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeCocos = 0;
        double valorCoco =0, valorTotal = 0;

        System.out.print("Quantidade de Cocos: ");
        quantidadeCocos = sc.nextInt();

        System.out.print("Valor da Coco: ");
        valorCoco = sc.nextDouble();

        valorTotal = valorCoco * quantidadeCocos;

        System.out.printf("Valor total da Coco: R$%.2f", valorTotal);

    }
}
