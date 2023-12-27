import java.util.*;

public class subsetOfArray {

    static boolean bSearch(int elem, int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == elem)
                return true;
            else if (arr[mid] < elem)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    static boolean isSubset(int arr[], int m, int arr2[], int n) {
        if (m > n)
            return false;
        Arrays.sort(arr2);
        for (int i = 00; i < m; i++) {
            boolean present = bSearch(arr[i], arr2, n);
            if (present == false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 5, 7, 9, 8 };
        int arr2[] = { 2, 1, 3, 4, 8, 7, 9, 5, 6 };

        int m = arr.length;
        int n = arr2.length;

        boolean ans = isSubset(arr, m, arr2, n);

        if (ans == true)
            System.out.print("arr[] is subset of arr2[]");
        else
            System.out.println("arr[] is not subset of arr2[]");
    }
}