import java.util.Scanner;

public class Aplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU NAWIGACYJNE ===");
        System.out.println("1. Kalkulator mnożenia");
        System.out.println("2. Wyjście");
        System.out.print("Wybierz opcję: ");
        int wybor = scanner.nextInt();


        }  if (wybor == 2) {
            System.out.print("Podaj pierwszą liczbę: ");
            int a = scanner.nextInt();

            System.out.print("Podaj drugą liczbę: ");
            int b = scanner.nextInt();

            int wynik = a * b;
            System.out.println("Wynik mnożenia: " + wynik);
        } else if (wybor == 3) {
            System.out.println("Do widzenia!");
        } else {
            System.out.println("Nieprawidłowa opcja, spróbuj ponownie.");
        }

        scanner.close();
    }
}