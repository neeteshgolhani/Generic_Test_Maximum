package com.bridgelabz;

public class main {
    public static void main(String[] args) {
        // Test case 1 - Maximum at first position
        MaxNumberFinder<Integer> finder = new MaxNumberFinder<Integer>();
        int max1 = finder.findMax(10, 5, 3);
        System.out.println("Maximum is: " + max1); // Output should be 10

        // Test case 2 - Maximum at second position
        int max2 = finder.findMax(2, 7, 4);
        System.out.println("Maximum is: " + max2); // Output should be 7

        // Test case 3 - Maximum at third position
        int max3 = finder.findMax(1, 2, 10);
        System.out.println("Maximum is: " + max3); // Output should be 10
    }
}

