package com.company;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void mainOne(String[] args) {
//        The following are primitive types.
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

//        Here are reference types.
        Date now = new Date();

        System.out.println(now);
    }

    public static void mainTwo(String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
    }

    public static void mainThree(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }

    public static void mainFour(String[] args) {
        // c:\Windows\...
        String messageTwo = "c:\\Win\tdow\ns\\...";
        System.out.println(messageTwo);
        String message = "Hello \"Lewis\" :)" + " You Suck!";
        System.out.println(message.replace("Lewis", "World"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
    }

    public static void mainFive(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[2] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] quickerNumbers = {2, 7, 4, 5, 6};
        System.out.println(quickerNumbers[0]);
        Arrays.sort(quickerNumbers);
        System.out.println(Arrays.toString(quickerNumbers));
    }

    public static void mainSix(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }

    public static void mainSeven(String[] args) {
        final float PI = 3.14F;
    }

    public static void mainEight(String[] args) {
        double result = (double)10 / (double)3;
        System.out.println(result);

        int x = 1;
        x *= 2;
        x++;
        System.out.println(x);
    }

    public static void mainNine(String[] args) {
        double x = 1.9;
        int y = (int)x + 2;
        System.out.println(y);

        String z = "5";
        int a = Integer.parseInt(z) + 2;
        System.out.println(a);

        String b = "5.5";
        float c = Float.parseFloat(b) + 2;
        System.out.println(c);
    }

    public static void mainTen(String[] args) {
        int result = (int)(Math.random() * 100);
        System.out.println(result);
    }

    public static void mainEleven(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123456789.01);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String resultPercent = percent.format(0.1);
        System.out.println(resultPercent);

        String resultPercentTwo = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultPercentTwo);
    }

    public static void mainTwelve(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println(11 + name);
    }

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal (Mortgage Amount): ");
        int principal = scanner.nextInt();

        System.out.print("Expected APR (percent): ");
        float expectedAPR = scanner.nextFloat();
        float monthlyInterest = expectedAPR / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Length of Mortgage (years): ");
        byte mortgageLength = scanner.nextByte();
        int numberOfPayments = mortgageLength * MONTHS_IN_YEAR;

        double paymentPerMonth = principal
                * (monthlyInterest * ((Math.pow((1 + monthlyInterest), numberOfPayments)))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(paymentPerMonth);
        System.out.println("Your monthly payment will be approximately: " + mortgageFormatted);
    }
}

// Principal - Amount of Loan
// Annual interest rate
// Number of years
// Output mortgage value per month
