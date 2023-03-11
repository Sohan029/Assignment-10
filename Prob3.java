package Assignment10;

import java.util.Arrays;
import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("All Array Elements Should be Distinct :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(k+"th Smallest Element is :");
        System.out.println(arr[k-1]);

    }
}
