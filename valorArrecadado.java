package monitoria;
import java.util.Scanner;
public class valorArrecadado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        final double INTEIRA = 77.50;
        double qtdInteira, qtdMeia, valorTotal, qtdvendida;

        System.out.print("Qunatos ingresso inteira Vendeu: ? ");
        qtdInteira = sc.nextDouble();

        System.out.print("Qunatos ingresso meia Vendeu: ? ");
        qtdMeia = sc.nextDouble();

        valorTotal = (qtdInteira * INTEIRA ) + (qtdMeia * (INTEIRA / 2));

        qtdvendida = qtdInteira + qtdMeia;

        System.out.printf("O valor arrecadado foi R$%.2f: ", valorTotal);

        System.out.print("A quantidade foi de: "+ qtdvendida);

    }
}
