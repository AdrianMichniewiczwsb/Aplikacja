public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        if (calc.add(2, 3) == 5) {
            System.out.println("Test add passed");
        } else {
            System.out.println("Test add failed");
        }

        if (calc.subtract(5, 3) == 2) {
            System.out.println("Test subtract passed");
        } else {
            System.out.println("Test subtract failed");
        }
    }
}

