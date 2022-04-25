import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie {

    public static void main(String[] args) {
        float multiplication;
        float dividing;
        float rest;
        int firstNumber;
        int secondNumber;

        System.out.println("Podaj pierwsza liczbę");
        firstNumber = getNumber();

        System.out.println("Podaj drugą liczbę");
        secondNumber = getNumber();

        multiplication = firstNumber * secondNumber;
        dividing = firstNumber / secondNumber;
        rest = firstNumber % secondNumber;

        printResult(multiplication, dividing, rest);
    }

    private static int getNumber() {
        int firstNumber;
        do {
            firstNumber = scanner();
        } while (firstNumber == 0);
        return firstNumber;
    }

    private static int scanner() {
        Scanner input = new Scanner(System.in);
        int number = 0;

        try {
            number = input.nextInt();
            if (number == 0) {
                System.out.println("Podano liczbę 0 - podaj inną liczbę");
            }
        } catch (InputMismatchException e) {
            System.out.println("Tu nie ma liczby, wpisz ponownie poprawną wartość");
        }

        return number;
    }

    private static void printResult(float multiplication, float dividing, float rest) {
        System.out.printf("Wynik mnożenia to: %s%n", multiplication);
        System.out.printf("Wynik dzielenia to: %s%n", dividing);
        System.out.printf("Reszta z dzielenia to: %s%n", rest);
    }
}
