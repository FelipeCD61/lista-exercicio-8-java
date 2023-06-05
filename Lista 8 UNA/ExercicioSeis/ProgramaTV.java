import java.util.Scanner;

public class ProgramaTV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV tv = new TV();

        System.out.println("\n\t#### TV ####");
        tv.setVolume(20);

        while (true) {
            System.out.println("\nDigite o canal que deseja assistir ou aperte 'q' para desligar: \n1 | Rede tv \n2 | SBT \n3 | Record \n4 | Band \n5 | Globo \n6 | Tv brasil");
            tv.setCanal(scanner.next());

            if (tv.getCanal().equalsIgnoreCase("q")) {
                System.out.println("Você desligou a TV");
                break;
            } else if (tv.getCanal().equals("1") || tv.getCanal().equals("2") || tv.getCanal().equals("3")
                    || tv.getCanal().equals("4") || tv.getCanal().equals("5") || tv.getCanal().equals("6")) {
                System.out.println(tv.Canal());
            } else {
                System.out.println("Favor digite um dos números da tabela.");
            }

            while (true) {

                System.out.printf("Volume: %d \nDeseja mudar? \n1 - Sim \n2 - Não\n", tv.getVolume());
                tv.setMudarVolume(scanner.nextInt());

                if (tv.getMudarVolume() == 1) {
                    System.out.println("Volume pode ser mudado de uma escala de 0 a 100. \nDigite um número no intervalo entre eles:");
                    tv.setVolume(scanner.nextInt());
                    System.out.println(tv.Volume());
                } else if (tv.getMudarVolume() == 2) {
                    break;
                } else {
                    System.out.println("Favor digite uma da opções.");
                }
            }
        }
        scanner.close();
    }
}
