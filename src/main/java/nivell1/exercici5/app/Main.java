package nivell1.exercici5.app;

import nivell1.exercici5.interfaces.PiNumber;

public class Main {
    public static void main(String[] args) {
        final double PI_NUMBER = 3.1415;

        PiNumber numberPi = () -> PI_NUMBER;

        System.out.println("The pi number is: " + numberPi.getPiValue());
    }
}
