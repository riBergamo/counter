package edu.counter;

import edu.counter.exception.InvalidParametersException;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-> Challenge Controle de fluxo - Enter two values to find out the number of interactions between them. <-");

        System.out.println("Enter the first parameter: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second parameter: ");
        int number2 = scanner.nextInt();

        try {
            contar(number1, number2);
        } catch (InvalidParametersException e) {
            throw new InvalidParametersException("The second parameter must be greater than the first.");
        }
    }


    private static void contar(int number1, int number2) throws InvalidParametersException {
        if (number1 > number2) {
            throw new InvalidParametersException();
        }

        int difference = number2 - number1;

        for (int i = 1; i <= difference; i++) {
            System.out.println(i);
        }

        System.out.println("Difference between them: " + difference);
    }
}