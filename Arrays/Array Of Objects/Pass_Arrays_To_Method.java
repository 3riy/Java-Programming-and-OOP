public class Pass_Arrays_To_Method {

    // Method to find maximum number in array
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // MAIN Method
    public static void main(String[] args) {
        int[] myArray = {11, 20, 99, 42, 5};
        int maxno = findMax(myArray); // Passing array to method
        System.out.println("Maximum number in the array is: " + maxno);
    }

}
