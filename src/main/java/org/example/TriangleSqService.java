package org.example;

public class TriangleSqService {

    public TriangleSqService() {
    }

    public double triangleSqService(int a, int b, int c) {
        double p =(double) (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return (double) result;
    }
}
