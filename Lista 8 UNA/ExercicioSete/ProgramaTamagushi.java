import java.util.Scanner;
public class ProgramaTamagushi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tamagushi tamagushi = new Tamagushi();

        System.out.println("\n\t#### Tamagushi ####");

        System.out.print("Digite o nome do seu Tamagushi: ");
        tamagushi.setNome(scanner.next());
        System.out.print("\nNome do seu Tamagushi definido com sucesso! \nDê olá ao seu novo bichinho " + tamagushi.retornarNome());
        
        System.out.print("Status do seu Tamagushi:\n %s ");
        scanner.close();
    }
}
