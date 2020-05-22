/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2de2;

/**
 *
 * @author datng
 */
import java.util.Scanner;

public class De2Bai2 {
	public static void inputMatrix(int a[][], Scanner sc){
	for(int i = 0; i <a.length ; i++) {
             for(int j=0; j<a[i].length;j++){
                 a[i][j]=sc.nextInt();
             }//end inner for loop
            }//end outer for loop
	}//end inputMatrix

	public static void outputMatrix(int a[][]) {
	for(int i = 0; i <a.length ; i++) {
            System.out.print("| ");
             for(int j=0; j<a[i].length;j++){	
            System.out.print(a[i][j]+" ");
             }//end inner for loop
        System.out.print("| \n");
        }//end outer for loop
        }
        public static boolean isPerfectNum(int n){
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;        
            }//end if
        }//end for loop
        if(n-sum==0){
            return true;
        }//end if 
        else{
            return false;
        }//end else
        }//end isPerfectNum
        public static int getMin(int[]a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
        if(min>a[i]){
        min=a[i];
        }//end if min
        }//end for
        return min;}
        
	public static int getMinPerfect(int a[][]) {
	int count =0;
        int[] perfect;
        int countNum=0;
        int min=0;
        for(int i = 0; i <a.length ; i++){
            for(int j=0; j<a[i].length;j++){
                if(isPerfectNum(a[i][j])==true){
                    countNum++;
                }
           }//end inner loop
        }//end outerloop
        if(countNum==0){
           return -1;
        }//end if no perfect number
        else{
            perfect=new int[countNum];
            for(int i = 0; i <a.length ; i++){
                for(int j=0; j<a[i].length;j++){
                    if(isPerfectNum(a[i][j])==true){
                        int temp =0;
                        temp = a[i][j];
                        perfect[count]=temp;
                        count++;
                    }//end if
                }//end inner for loop 
            }//end outer for loop
            min = getMin(perfect);//get min perfect number
        }//end else
        return min;
	}
        
	public static boolean isCheckEqual2Columns (int a[][], int c1, int c2)
	{ for(int i=0;i<a.length;i++){
            if(a[i][c1]-a[i][c2]!=0){
            return false;
            }//end if
        
        }//end for
	    return true;
	}//end isCheckEqual2Columns
	public static boolean isCheckColumns (int a[][])
	{for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (isCheckEqual2Columns(a,i,j)==true){
                return true;
                }//end if
                }//end inner loop
            }//end outer loop            
		return false;	
	}
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt(); 
            int column = sc.nextInt();
            int [][]a = new int [row][column];
            inputMatrix(a,sc);
            outputMatrix(a);
            System.out.println("min perfect : "+getMinPerfect(a));
            System.out.println("2 col equal : "+isCheckEqual2Columns(a,0,1));
            System.out.println("random col equal : "+isCheckColumns(a));
	}//end main
}//end class

