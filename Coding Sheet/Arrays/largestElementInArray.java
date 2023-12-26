import java.util.*;

public class largestElementInArray {
    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 9, 7, 6, 2, 0 };
        System.out.println(sort(arr));
    }
}
