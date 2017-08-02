package org.noip;

import java.util.Scanner;

import org.noip.konst.collections.Bag;

public class Main {

    public static void main(String[] args) {
        bagTest(args);

    }

    private static void bagTest(String[] args) {
        Bag<Double> numbers = new Bag<>();
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextDouble()) {
                double d = sc.nextDouble();
                numbers.add(d);
            }

            int N = numbers.size();

            double summ = 0.0;
            for (double d : numbers) {
                summ += d;
            }

            double mean = summ / N;
            for (double d : numbers) {
                summ += (d - mean) * (d - mean);
            }
            double std = Math.sqrt(summ / (N - 1));

            System.out.println(String.format("Mean: %2f", mean));
            System.out.println(String.format("Std dev: %2f", std));
        }
    }

    private static void stackTest(String[] args){



    }


}
