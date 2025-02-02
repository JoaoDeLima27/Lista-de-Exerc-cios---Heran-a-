package Q4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorBase = 50.00;
        double adicionalVIP = 20.00;

        System.out.println("Bem-vindo à venda de ingressos!");
        System.out.print("Digite 1 para Normal ou 2 para VIP: ");
        int tipoIngresso = scanner.nextInt();

        if (tipoIngresso == 1) {
            Normal ingressoNormal = new Normal(valorBase);
            ingressoNormal.imprimeTipo();
            ingressoNormal.imprimeValor();
        } else if (tipoIngresso == 2) {
            System.out.print("Digite 1 para Camarote Superior ou 2 para Camarote Inferior: ");
            int tipoCamarote = scanner.nextInt();

            if (tipoCamarote == 1) {
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(valorBase, adicionalVIP);
                System.out.printf("Valor do ingresso VIP Camarote Superior: R$ %.2f%n", camaroteSuperior.valorIngresso());
            } else if (tipoCamarote == 2) {
                CamaroteInferior camaroteInferior = new CamaroteInferior(valorBase, adicionalVIP, "Setor A");
                camaroteInferior.imprimeLocalizacao();
                System.out.printf("Valor do ingresso VIP Camarote Inferior: R$ %.2f%n", camaroteInferior.valorVIP());
            } else {
                System.out.println("Opção inválida.");
                return;
            }
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        // Perguntar sobre o combo de pipoca
        System.out.println("Escolha o combo de pipoca:");
        System.out.println("1 - Pequena (R$ 5.00)");
        System.out.println("2 - Média (R$ 10.00)");
        System.out.println("3 - Grande (R$ 15.00)");
        System.out.print("Digite o número correspondente ao combo desejado: ");
        int escolhaCombo = scanner.nextInt();

        double valorCombo = 0.00;
        switch (escolhaCombo) {
            case 1:
                valorCombo = 5.00;
                break;
            case 2:
                valorCombo = 10.00;
                break;
            case 3:
                valorCombo = 15.00;
                break;
            default:
                System.out.println("Opção inválida. Nenhum combo selecionado.");
                break;
        }

        // Calcular valor final
        double valorFinal = valorBase + (tipoIngresso == 2 ? adicionalVIP : 0) + valorCombo;
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}