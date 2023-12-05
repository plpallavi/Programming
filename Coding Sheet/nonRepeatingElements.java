import java.util.*;

public class nonRepeatingElements {

    static void nonRepeatingElements(int num[]) {

        Arrays.sort(num);

        if (num[0] != num[1])
            System.out.println(num[0] + " ");

        for (int i = 1; i < num.length - 1; i++)
            if (num[i - 1] != num[i] && num[i] != num[i + 1])
                System.out.println(num[i] + " ");

        if (num[num.length - 2] != num[num.length - 1])
            System.out.println(num[num.length - 1]);
    }

    public static void main(String[] args) {
        int num[] = { 1, 5, 0, 7, 5, 3, 3, 0 };
        System.out.println("Non-Repeating Numbers are: ");
        nonRepeatingElements(num);
    }
}
