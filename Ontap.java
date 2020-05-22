
package ontap;

import java.util.Arrays;

public class Ontap {


    public static void main(String[] args) {
        int n = 4, m = 6;
		System.out.println("sum = "+sum(n,m));
		System.out.println("multiple = "+multi(n, m));
		int[] a = {1,2,3,4};
		int[] b = {1, 1, 1, 1};
		System.out.println("isArithmeticSequence a = "+isArithmeticSequence(a));
		System.out.println("isArithmeticSequence b = "+isArithmeticSequence(b));
		System.out.println("isGeometricSequence a = "+isGeometricSequence(a));
		System.out.println("isGeometricSequence b  = "+isGeometricSequence(b));
		
		int p = 7, k = 28;
		System.out.println("isPrime p = "+isPrime(p)+"; isPrime k = "+isPrime(k));
		System.out.println("isPerfectNum p = "+isPerfectNum(p)+"; isPerfectNum k = "+isPerfectNum(k));
		System.out.println("gcd (n, m) = "+ gcd(n, m));
		System.out.println("lcm (n,m) = "+lcm(n, m));
		
		int[] mirror = getMirror(a);
		if(mirror!=null)
		{
			System.out.println("a mirror:");
			for(int i = 0 ; i < mirror.length ; i++)
				System.out.print(mirror[i]+" ");
		}//end if
		else
			System.out.println("null mirror");
		
		System.out.println();
		speacialSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
        }//end else
    }//end main method
    
    //cau 1
    public static int sum(int n, int m){
    int sum=0;
    for (int i=n;i<=m;i++){
        sum=sum+i;
    }//end for loop
    return sum;
    }//end method sum
    
    //cau 2
    public static int multi(int n, int m){
    int multi=1;
    for (int i=n;i<=m;i++){
         multi=multi*i;
    }//end for loop
    return multi;
    }//end method multi
    
    //cau 3
    public static boolean isArithmeticSequence(int[] a){
    int d = a[1]-a[0];//different
    for(int i=0; i<a.length-1;i++){ 
        if(a[i+1]-a[i]!=d){
            return false;
         }//end if
    }//end of i loop
    return true;
    }
    
    //cau 4
    public static boolean isGeometricSequence(int[] a){
    int r = a[1]/a[0];//ratio
    for(int i=0; i<a.length-1;i++){
        if(a[i+1]/a[i]!=r){
            return false;
        }//end if
    }//end for
    return true;
    }//end isGeometricSequence
    
    //cau 5
    public static boolean isPrime(int n){
    for(int i=2; i <n;i++){
        if(n%i==0){
            return false;
        }//end if
    }//end for
    return true;
    }//end isPrime
    
    //cau 6
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
    
    //cau 7
    public static int gcd(int n,int m){
    int max =0;
    for(int i=1; i<=m && i<=n;i++){
        if(n%i==0 &&m%i==0){
            max = i;
        }//end if
    }//end for loop
    return max;
    }//end gcd
    
    //cau 8
    public static int icm(int n,int m){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    int max =0;//uoc chung lon nhat
    int min =0;// boi chung nho nhat
    for(int i=1; i<=m && i<=n;i++){
        if(n%i==0 &&m%i==0){
            max = i;
        }//end if
    }//end for loop
    min = (n*m)/max;
    return min;
    }//end icm
    
    //cau 9
    public static int[] getMirror(int[]a){
    int doDai=a.length;
    int t =0;
    int [] b = new int[doDai];
    for(int i=0;i<doDai;i++){
        t= a[i];
        b[doDai-1-i]=t;
    }//end for loop
    return b;
    }//end getMirror
    
    //cau 10
    public static void speacialSort(int[] a){
    int goEven =0;
    int goOdd = 0;
    int length =a.length;
    int lengthEven=0, lengthOdd=0;
    for(int i=0;i<length;i++){
        if(a[i]%2==0){
            lengthEven++;
         }//end if count even
        else{
            lengthOdd++;
         }//end else count odd
    }//end for loop count even and odd
    int[] even = new int[lengthEven];
    int[] odd  = new int[lengthOdd];
    for(int i=0;i<length;i++){
        if(a[i]%2==0){
            int temp=0;
            temp=a[i];
            even[goEven]=temp;
            goEven++;
        }//end if add even
        else{
            int temp=0;
            temp=a[i];
            odd[goOdd]=temp;
            goOdd++;
        }//end else add odd
    }//end for loop add to two array
    for(int i=0; i<lengthEven-1;i++){
        if(even[i]>even[i+1]){
            int temp ;
            temp = even[i];
            even[i]=even[i+1];
            even[i+1]=temp;
        }//end if 
    }//end for sort even
    for(int i=0; i<lengthOdd-1;i++){
        if(odd[i]>odd[i+1]){
            int temp ;
            temp = odd[i];
            odd[i]=odd[i+1];
            odd[i+1]=temp;
        }//end if 
    }//end for sort odd
    int goUp=0;
    for(int i=0;i<length;i++){
        int temp;
        while(i<lengthEven){
            temp = even[i];
            a[i]=temp;
            i++;
        }
        while(i>=lengthEven && i<length ){
            temp = odd[goUp];
            a[i]= temp;
            i++;
            goUp++;
        }
    }//loop add to main array
    }//end of speacialSort
    
}//end class
