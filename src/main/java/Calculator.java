public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            return 0;
        }
        else
            return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public boolean isOddNumber(int number) {
        return number % 2 != 0;
    }

    public int square(int a) {
        return a * a;
    }
}
