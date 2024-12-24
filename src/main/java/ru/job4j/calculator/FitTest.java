package ru.job4j.calculator;

public class FitTest {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        short height1 = 170;
        double man = FitTest.manWeight(height);
        double woman = FitTest.womanWeight(height1);
        System.out.println("Man 187 cm is " + man + " kg");
        System.out.println("Woman 170 cm is " + woman + " kg");
    }
}
