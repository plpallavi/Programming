import java.util.*;

public class MedianOfArray {

    static private void getMedian(int[] arr, int n) {
        Arrays.sort(arr);
        if (n % 2 == 0) {
            int ind1 = (n / 2) - 1;
            int ind2 = (n / 2);
            System.out.println((double) (arr[ind1] + arr[ind2]) / 2);
        } else {
            System.out.println(arr[(n / 2)]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 2, 5, 6, 3 };
        int n = 6;
        System.out.println("The median of the array is: ");
        getMedian(arr, n);
    }
}
