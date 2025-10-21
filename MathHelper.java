package gr.aueb.cf.ch14;

import java.util.Objects;

/**
 * This is a utility class consisting of three public static methods that
 * perform calculations on an array of integers. The first method finds the
 * highest number on the array. The second method finds the lowest number
 * on the array. The third method calculates the average number of the array.
 */
public final class MathHelper {

    /**
     * Default constructor.
     */
    private MathHelper(){}

    /**
     * Finds the highest number on the array.
     * @param arr the array we are searching.
     * @return the highest number (max).
     */
    public static int getMaxFromArray (int[] arr){

        Objects.requireNonNull(arr, "array must not be null");
        if (arr.length == 0) {
            throw new IllegalArgumentException("empty array");
        }

        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    /**
     * Finds the lowest number on the array.
     * @param arr the array we are searching.
     * @return the lowest number (min).
     */
    public static int getMinFromArray (int[] arr){

        Objects.requireNonNull(arr, "array must not be null");
        if (arr.length == 0) {
            throw new IllegalArgumentException("empty array");
        }

        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    /**
     * Calculates the average number of the array.
     * @param arr the array we want to get the average from.
     * @return the average number of the array.
     */
    public static double getAverageFromArray (int[] arr) {

        Objects.requireNonNull(arr, "array must not be null");
        if (arr.length == 0) {
            throw new IllegalArgumentException("empty array");
        }

        double sum = 0.0;

        for (int num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }
}
