package searchingInArray;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 9, 5, 2, 10, 3 };
        int n = arr.length;
        int k = 10;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                ans = i;
                break;
            }
        }
        System.out.println("The elements is present in " + ans + " index");
    }
}
