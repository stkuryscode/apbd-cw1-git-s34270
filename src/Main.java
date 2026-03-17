import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Daj mnie 3 cyfry");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Wprowadzono: ");
        for (int num : numbers) {
            switch (num) {
                case 0: System.out.println("zero"); break;
                case 1: System.out.println("jeden"); break;
                case 2: System.out.println("dwa"); break;
                case 3: System.out.println("trzy"); break;
                default: System.out.println("nieznana liczba (" + num + ")"); break;
            }
        }
    }
}