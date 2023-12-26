public class rotateTheArrayByKElement {
    public static void swap(int[] arr, int a, int b, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[a + i];
            arr[a + i] = arr[b + i];
            arr[b + i] = temp;
        }
    }

    public static void BlockSwap(int[] arr, int k, int n, int i) {
        if (k == 0 || k == n)
            return;

        if (k == n - k) {
            swap(arr, i, n - k + i, k);
            return;
        }

        else if (k < n - k) {
            swap(arr, i, n - k + i, k);
            BlockSwap(arr, i, k, n - k);
        } else {
            swap(arr, i, k, n - k);
            BlockSwap(arr, n - k + i, 2 * k - n, k);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 7;
        int k = 2;
        BlockSwap(arr, 0, k, n);
        System.out.println("After rotating the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
