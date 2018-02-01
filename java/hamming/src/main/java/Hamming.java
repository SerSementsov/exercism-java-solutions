package main.java;

import java.util.stream.IntStream;

public class Hamming {

    private char[] left;
    private char[] right;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.left = leftStrand.toCharArray();
        this.right = rightStrand.toCharArray();
    }

    public int getHammingDistance() {
//        return procedural();
        return functional();
    }

    private int functional() {
        return IntStream.range(0, left.length)
                .map(i -> left[i] ^ right[i])
                .filter(x -> x > 0)
                .reduce(0, (x, y) -> x + 1);
    }

    private int procedural() {
        int distance = 0;
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i]) {
                distance++;
            }
        }
        return distance;
    }
}
