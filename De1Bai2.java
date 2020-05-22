
package de1bai2;

/**
 *
 * @author datng
 */
import java.util.Arrays;
import java.util.Scanner;

public class De1Bai2 {
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
        
        public static boolean isPrime(int n){
        for(int i=2; i <n;i++){
            if(n%i==0){
                return false;
            }//end if
        }//end for
        return true;
        }//end isPrime
        
        public static int getMax(int[]a){
        int max=0;
        for(int i=0;i<a.length;i++){
        if(max<a[i]){
        max=a[i];
        }
        }
        return max;
        }//end get Max
        
	public static int getMaxPrime(int a[][]) {
	   int count =0;
           int[] prime ;
           int countPrime=0;
           int max =0;
            for(int i = 0; i <a.length ; i++){
            for(int j=0; j<a[i].length;j++){
              if(isPrime(a[i][j])==true){
              countPrime++;
              }
           }//end inner loop
           }//end outerloop
           if(countPrime==0){
           return -1;
           }//end if no prime
           else{
            prime=new int[countPrime];
            for(int i = 0; i <a.length ; i++){
                for(int j=0; j<a[i].length;j++){
                    if(isPrime(a[i][j])==true){
                        int temp =0;
                        temp = a[i][j];
                        prime[count]=temp;
                        count++;
                    }//end if
                }//end inner for loop 
            }//end outer for loop
            max = getMax(prime);//get max prime number
           }//end else
      return max;     
   }//end method
	public static boolean isCheckEqual2Rows (int a[][], int r1, int r2)
	{   for(int i=0;i<a[r1].length;i++){
            if(a[r1][i]-a[r2][i]!=0){
            return false;
            }
        
        }
	    return true;
	}
	public static boolean isCheckRows (int a[][])
	{ 
            for(int i=0;i<a.length;i++){
                System.out.println("i : "+i);
                for(int j=i+1;j<a.length;j++){
                System.out.println("j : "+j);
                if (isCheckEqual2Rows(a,i,j)==true){
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
            System.out.println("max prime : "+getMaxPrime(a));
            System.out.println("2 row equal : "+isCheckEqual2Rows(a,0,1));
            System.out.println("random row equal : "+isCheckRows(a));
            
	}
}