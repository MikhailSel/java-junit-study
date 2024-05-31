package org.example;

public class Triangle {

    public double calculateArea(int a, int b, int c) {
        if (a<0||b<0||c<0){
            throw new RuntimeException("wrong triangle: negative length side!");
        }
        double p = (double) (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
