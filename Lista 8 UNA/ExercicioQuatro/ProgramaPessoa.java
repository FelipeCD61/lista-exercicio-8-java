import java.util.Scanner;
public class ProgramaPessoa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("\n\t#### Molde Pessoa ####");
        
        System.out.print("Digite seu nome: ");
        pessoa.setNome(scanner.next());

        System.out.print("Digite sua idade: ");
        pessoa.setIdade(scanner.nextInt());

        System.out.print("Digite seu peso em quilos(Kg): ");
        pessoa.setPeso(scanner.nextDouble());

        System.out.print("Digite sua altura em metros: ");
        pessoa.setAltura(scanner.nextDouble());

        while(true) {
        System.out.println("\n\t<<<< Eventos >>>>");
        System.out.println("Escolha um evento ou aperte 'Q' para sair: \n1 - Emegrecer \n2 - Engordar \n3 - Envelhcer");
        pessoa.setEvento(scanner.next());

        if (pessoa.getEvento().equalsIgnoreCase("q")) {
            System.out.println("Você encerrou o programa.");
            break;
        } else if (pessoa.getEvento().equals("1") || pessoa.getEvento().equals("2") || pessoa.getEvento().equals("3")) {
            System.out.println(pessoa.acaoEvento());
        } else {
            System.out.println("Por favor digite uma das opções.");
        }
            
        }


        scanner.close();
    }
}