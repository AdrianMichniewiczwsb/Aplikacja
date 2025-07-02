import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== MENU NAWIGACYJNE ===");
            System.out.println("1. Strona główna");
            System.out.println("2. Kalkulator dodawania");
            System.out.println("3. Wyjście");
            System.out.println("=========================");
            System.out.print("Wybierz opcję: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Jesteś na stronie głównej.");
                    break;
                case "2":
                    System.out.print("Podaj pierwszą liczbę: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.print("Podaj drugą liczbę: ");
                    int b = Integer.parseInt(scanner.nextLine());
                    int sum = a + b;
                    System.out.println("Wynik dodawania: " + sum);
                    break;
                case "3":
                    System.out.println("Do widzenia!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja, spróbuj ponownie.");
            }
            System.out.println();
        }
    }
}