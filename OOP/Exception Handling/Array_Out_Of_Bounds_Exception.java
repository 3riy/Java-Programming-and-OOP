// -- Array out of bounds exception using exception handling -- //

public class Array_Out_Of_Bounds_Exception {
    public static void main(String[] args) {
        
        try {
            // Define an array with 3 elements (indices 0, 1, 2)
            int[] numbers = {10, 20, 30};

            // Attempting to access index 5, which doesn't exist
            System.out.println("Accessing element at index 5: " + numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // This block runs if the error occurs
            System.out.println("Error: The array index you requested is out of range!");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program execution continues smoothly...");
    }
}