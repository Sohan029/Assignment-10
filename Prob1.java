package Assignment10;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int dup[]=new int[n];
        int a=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                dup[a++]=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                dup[a++]=arr[i];
            }
        }
        for(int i : dup){
            System.out.print(i+" ");
        }
    }
}
