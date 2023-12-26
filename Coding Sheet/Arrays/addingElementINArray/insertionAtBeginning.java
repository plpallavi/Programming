package addingElementINArray;

public class insertionAtBeginning {
    static void insertAtBegin(int[] arr, int n, int value) {
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = value;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] arr = { 10, 9, 14, 8, 67, 89, 20, 0, 1 };
        int value = 40;
        System.out.println("Before inserting the value at beginning: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        insertAtBegin(arr, n, value);
        System.out.println("After inserting the value at beginning: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
