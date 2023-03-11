package Assignment10;

import java.util.Scanner;

public class Prob5 {
    static void inputs(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }

    static void verify(int arr[],int arr1[]){
        int f=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=arr1[i]){
                System.out.println(false);
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println(true);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int arr1[]=new int[n];
        inputs(arr,n);
        inputs(arr1,n);
        verify(arr,arr1);
    }
}
