package Assignment10;
import java.util.Arrays;
import java.util.Scanner;
public class Prob2 {
    static int arrayinput(int arr[], int n, int dup1[], int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                dup1[c++] = arr[i];
            }
        }
        dup1[c] = arr[n - 1];
        return c;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[m];
        int dup1[] = new int[n];
        int dup2[] = new int[m];
        int c = 0;
        int d = 0;

        int num1 = arrayinput(arr, n, dup1, c) + 1;
        int num2 = arrayinput(arr1, m, dup2, d) + 1;

        int fak1[] = Arrays.copyOf(dup1, num1);
        int fak2[] = Arrays.copyOf(dup2, num2);
        int count = 0;

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                if (fak1[i] == fak2[j]) {
                    count++;
                    break;
                }
            }
        }
        int ans = (fak2.length - count) + (fak1.length - count) + count;
        System.out.println(ans);
    }
}
