import java.util.Scanner;
public class ProgramaBola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bola bola = new Bola();

        System.out.println("\n\t #### Bola ####");

        System.out.print("Digite a cor da bola: ");
        bola.setCor(scanner.next());
        System.out.println(bola.mostraCor());

        System.out.print("Digite a nova cor da bola: ");
        bola.trocaCor(scanner.next());
        System.out.println(bola.mostraCor());        
        
        scanner.close();
    }
    
}
