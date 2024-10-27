package com.thealgorithms.shufflealogrithm;

import java.util.Arrays;
import java.util.Random;

public final class ConstrainedShuffle {

    private ConstrainedShuffle() {
        // Prevent instantiation
    }

    /**
     * Shuffles elements in the array while ensuring that the first and last
     * elements remain fixed.
     *
     * @param array the input array to shuffle
     */
    public static void constrainedShuffle(int[] array) {
        // Edge case: If the array has less than 3 elements, no shuffling can occur
        if (array == null || array.length < 3) {
            return;
        }

        Random random = new Random();
        for (int i = array.length - 1; i > 1; i--) {
            // Generate a random index between 1 and i (inclusive)
            int j = random.nextInt(i - 1) + 1;

            // Swap the elements at positions i and j
            int temp = array[i]; // Temporarily store the element at i
            array[i] = array[j]; // Move element from j to i
            array[j] = temp;     // Place the stored element in position j
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(array));
        constrainedShuffle(array);
        System.out.println("Constrained Shuffled Array: " + Arrays.toString(array));
    }
}