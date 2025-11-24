package com.bank.util;

public class InterestCalculator {
    public static double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100;
    }

    public static double calculateCompoundInterest(double P, double R, double T) {
        return P * (Math.pow((1 + R / 100), T)) - P;
    }
}
