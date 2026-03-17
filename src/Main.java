import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj cyfre (0-3): ");
        int number = scanner.nextInt();

        System.out.print("Wprowadzono: ");
        switch (number) {
            case 0: System.out.println("zero"); break;
            case 1: System.out.println("jeden"); break;
            case 2: System.out.println("dwa"); break;
            case 3: System.out.println("trzy"); break;
            default: System.out.println("nieznana liczba"); break;
        }
    }
}