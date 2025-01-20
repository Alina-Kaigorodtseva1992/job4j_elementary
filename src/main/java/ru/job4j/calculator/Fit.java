package ru.job4j.calculator;

public class Fit {

    public static double idealWeight(short height, double subtractValue) {
        return (height - subtractValue) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double manWeightResult = idealWeight(heightMan, 100);
        System.out.println("Man " + heightMan + " cm has ideal weight: " + manWeightResult);

        double womanWeightResult = idealWeight(heightWoman, 110);
        System.out.println("Woman " + heightWoman + " cm has ideal weight: " + womanWeightResult);
    }
}