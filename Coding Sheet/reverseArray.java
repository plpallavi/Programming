public class reverseArray {

    // Function to print Array
    static void printArray(int[] arr, int n) {
        System.out.print("Reversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to reverse an Array
    static void revArray(int[] arr, int n) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        printArray(arr, n);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        revArray(arr, n);
    }
}
