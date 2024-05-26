package dsa_lab_exam;

public class Question2 {
    public static int findMaxElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int maxElement = arr[0];  // Assume the first element is the maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 17};
        int maxNum = findMaxElement(numbers);
        System.out.println(maxNum);
    }
}