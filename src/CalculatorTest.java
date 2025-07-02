public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int wynik = calc.add(2, 3);
        if (wynik == 5) {
            System.out.println("Test przeszedł");
        } else {
            System.out.println("Test NIE przeszedł");
        }
        if (calc.add(0, 0) == 0) {
            System.out.println("Test 2 przeszedł");
        } else {
            System.out.println("Test 2 NIE przeszedł");
        }
    }
}