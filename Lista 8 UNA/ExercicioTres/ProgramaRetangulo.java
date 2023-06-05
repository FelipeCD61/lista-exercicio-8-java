import java.util.Scanner;
public class ProgramaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("\n\t #### Medidas de um local ####");

        System.out.println("Digite as medidas do local: ");
        System.out.print("Lado A: ");
        retangulo.setLadoA(scanner.nextDouble());
        System.out.print("Lado B: ");
        retangulo.setLadoB(scanner.nextDouble());

        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        System.out.print("\nDigite a area do piso em metros: ");
        retangulo.setAreaPiso(scanner.nextDouble());
        System.out.print("Digite o comprimento do rodape em metros: ");
        retangulo.setComprimentoRodape(scanner.nextDouble());

        System.out.printf("\nQuantidade de pisos a ser usada: %.2f", retangulo.quantidadePisos());
        System.out.printf("\nQuantidade de rodapés a ser usada: %.2f", retangulo.quantidadeRodape());
        
        scanner.close();
    }     
}
