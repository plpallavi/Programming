import java.util.*;

public class smallestElementInArray {

    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 9 };
        System.out.println(sort(arr));
    }
}