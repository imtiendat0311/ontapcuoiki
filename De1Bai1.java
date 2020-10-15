package com.company;
import java.util.Scanner;
public class De1Bai1 {
    public static void main(String[] args) {
        coshx();
    }
    public static void coshx(){

        Scanner input = new Scanner(System.in);
        System.out.print("enter n :");
        int n = input.nextInt();
        while(n<1){
        System.out.print("error n need to be positive integer /n enter n :");
        n = input.nextInt();
        }
        System.out.println("");
        System.out.print("enter x : ");
        double x = input.nextDouble();
        System.out.println("");
        double sum=0;
        for(int i=0;i<n;i+=2){
           sum+=(Math.pow(x,i)/recussion(i));
        }
        System.out.print("cosh "+x+" = "+sum);

    }
    public static double recussion(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*recussion(n-1);
    }
}
