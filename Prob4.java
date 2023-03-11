package Assignment10;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int s1=0;
            int start=i;int end=0;
            for(int j=i;j<n;j++){
                s1=s1+arr[j];
                if(s1==s){
                    System.out.println(start+" "+j);
                    end=1;
                    break;
                }
            }
            if(end==1){
                break;
            }
        }
    }
}
