import java.util.Scanner;

public class SumArrayElementsWhoHaveDigit3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int t2 = arr[i];
            while (arr[i] > 0) {
                int t = arr[i] % 10;
                if (t == 3) {
                    sum = sum + t2;
                    arr[i] = 0;
                } else {
                    arr[i] = arr[i] / 10;
                }
            }
        }
        System.out.println(sum);
    }

}
