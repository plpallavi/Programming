package searchingInArray;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 3, 8, 9, 0, 15, 4 };
        int n = arr.length;
        int k = 15;
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > k) {
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }
        System.out.println("The element is present in ans " + ans + "th index");
    }
}
