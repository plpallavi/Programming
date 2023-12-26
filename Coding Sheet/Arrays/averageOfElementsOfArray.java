public class averageOfElementsOfArray {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 10, 20, 30, 40, 50 };
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum / n;

        System.out.println(average);
    }
}
