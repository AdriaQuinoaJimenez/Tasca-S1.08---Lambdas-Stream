package nivell2.exercici3.app;

import nivell2.exercici3.interfaces.Operation;

public class Main {
    public static void main(String[] args) {
        final float originalNumber1 = 10.5f;
        final float originalNumber2 = 5.5f;

        Operation addition = (number1, number2) -> number1 + number2;
        Operation subtraction = (number1, number2) -> number1 - number2;
        Operation multiplication = (number1, number2) -> number1 * number2;
        Operation division = (number1, number2) -> number1 / number2;

        System.out.println("Suma: " + addition.operacio(originalNumber1, originalNumber2)
                + "\nResta: " + subtraction.operacio(originalNumber1, originalNumber2)
                + "\nMultiplicacion: " + multiplication.operacio(originalNumber1, originalNumber2)
                + "\nDivision: " + division.operacio(originalNumber1, originalNumber2));
    }
}
