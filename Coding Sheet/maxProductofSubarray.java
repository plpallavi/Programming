public class maxProductofSubarray {
    static int maxProduct(int arr[]) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++)
                    prod *= arr[k];
                result = Math.max(result, prod);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, -3, 0, -4, -5 };
        int answer = maxProduct(nums);
        System.out.println("The maximum product subarray is: " + answer);
    }
}
