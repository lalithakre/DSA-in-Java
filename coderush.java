
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class coderush {
    public static boolean check(int arr[], int a, int c) {
        for (int i = 0; i < a; i++) {
            int check = arr[i];
            for (int j = i + 1; j < a; j++) {
                if (check == c) {
                    return true;
                } else {
                    check = check + arr[j];
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // int sum=0;
            int count = 1;
            int arr[] = new int[n];
            for (int k = 0; k < a; k++) {
                if (count == b) {
                    count++;
                } else {
                    arr[k] = count;
                    count++;
                }
            }
            if (check(arr, a, c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
        // Your code here
    }
}