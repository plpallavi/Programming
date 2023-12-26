package addingElementINArray;

public class InsertionAtEnding {
    static void insertatEnd(int arr[], int n, int value) {
        arr[n] = value;
    }

    public static void main(String[] args) {
        int n = 8;
        int arr[] = { 10, 9, 7, 3, 4, 13, 67, 78, 0 };
        int value = 40;
        System.out.println("Before inserting the value at the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        insertatEnd(arr, n, value);

        System.out.println("After inserting the value at the end: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
