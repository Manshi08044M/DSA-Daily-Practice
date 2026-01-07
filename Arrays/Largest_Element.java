/*
 Day: 1
 Problem Name: Largest Element in an Array
 Topic: Arrays
 Approach: Linear Search
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Largest_Element {

    // Function to find the largest element in the array
    public static int getLargest(int numbers[]) {

        // Assume first element is the largest
        int largest = numbers[0];

        // Traverse the array
        for (int i = 0; i < numbers.length; i++) {

            // Update largest if current element is greater
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    // Main method
    public static void main(String[] args) {

        int numbers[] = {1, 2, 6, 3, 5};

        System.out.println("Largest value is: " + getLargest(numbers));
    }
}
