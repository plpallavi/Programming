public class findRepeatingElementsinArray {
    static void repeatingElements(int arr[]) {
        int cnt = 0;
        int[] dup = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    dup[cnt++] = arr[i];
            }
        }

        System.out.println("The repeating elements are: ");
        for (int i = 0; i < cnt; i++) {
            if (dup[i] != dup[i + 1])
                System.out.println(dup[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
        repeatingElements(arr);
    }
}