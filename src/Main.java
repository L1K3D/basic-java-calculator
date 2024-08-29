import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exibindo cabeçalho
        System.out.println("******************************");
        System.out.println("* CALCULADORA BÁSICA EM JAVA *");
        System.out.println("******************************");

        // Criando um único objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Obtendo os números digitados pelo usuário
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        double segundoNumero = scanner.nextInt();
        System.out.println("");

        // Obtendo qual tipo de operação o usuário deseja fazer
        System.out.println("Qual tipo de operação você deseja fazer? \n 1 - Soma; \n 2 - Subtração; \n 3 - Multiplicação; \n 4 - Divisão");
        System.out.println("Resposta: ");
        int respostaUsuario = scanner.nextInt();
        System.out.println("");

        // Trabalhando operações de acordo com a resposta do usuário
        switch (respostaUsuario) {
            case 1:
                double soma = primeiroNumero + segundoNumero;
                System.out.println("Você escolheu SOMA!");
                System.out.println("A soma entre " + primeiroNumero + " e " + segundoNumero + " é: " + soma);
                break;
            case 2:
                double subtracao = primeiroNumero - segundoNumero;
                System.out.println("Você escolheu SUBTRAÇÃO!");
                System.out.println("A subtração entre " + primeiroNumero + " e " + segundoNumero + " é: " + subtracao);
                break;
            case 3:
                double multiplicacao = primeiroNumero * segundoNumero;
                System.out.println("Você escolheu MULTIPLICAÇÃO!");
                System.out.println("A multiplicação entre " + primeiroNumero + " e " + segundoNumero + " é: " + multiplicacao);
                break;
            case 4:
                if (segundoNumero != 0) {
                    double divisao = (double) primeiroNumero / segundoNumero;
                    System.out.println("Você escolheu DIVISÃO!");
                    System.out.println("A divisão entre " + primeiroNumero + " e " + segundoNumero + " é: " + divisao);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida. Escolha um número de 1 a 4.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
