import java.util.Scanner;
public class ProgramaContaCorrente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println("\n\t#### Conta Corrente ####");

        System.out.println("Digite o numero da sua conta: ");
        contaCorrente.setNumeroConta(scanner.nextInt());
        System.out.println("Digite seu nome: ");
        contaCorrente.setNomeCorrentista(scanner.next());

        System.out.println("Deseja adicionar um colocar um saldo inicial? \n1 - Sim \n2 - Não");
        contaCorrente.setTemSaldo(scanner.nextInt());

        if (contaCorrente.getTemSaldo() == 1) {
            System.out.println("Digite seu saldo: ");
            contaCorrente.setSaldo(scanner.nextDouble());
        } else if (contaCorrente.getTemSaldo() == 2) {
            contaCorrente.setSaldo(0);
        } else {
            System.out.println("Por favor digite uma das opções.");
        }

        while (true) {

            System.out.println("\n\nDigite a operação que deseja realizar ou aperte 'Q' para sair do programa: \n1 - Depositar \n2 - Sacar");
            contaCorrente.setOperation(scanner.next());

            if (contaCorrente.getOperation().equalsIgnoreCase("q")) {
                System.out.println("\nVocê encerrou o programa.");
                break;
            } else if (contaCorrente.getOperation().equals("1")) {
                System.out.print("Digite o valor do depósito: R$");
                contaCorrente.setDeposito(scanner.nextDouble());
                contaCorrente.depositar();
            } else if (contaCorrente.getOperation().equals("2")) {
                System.out.print("Digite o valor do depósito: R$");
                contaCorrente.setSaque(scanner.nextDouble());
                contaCorrente.sacar();
            } else {
                System.out.println("Por favor digite um dos números correspondentes na tabela.");
            }
            System.out.printf("\nSaldo atual: R$%.2f", contaCorrente.getSaldo());
        }

        scanner.close();
    }
}
