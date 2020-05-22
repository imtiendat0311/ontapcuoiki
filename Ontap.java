
package ontap;

import java.util.Arrays;

public class Ontap {


    public static void main(String[] args) {
        int []a = {1,4,3,2,5,8,7,6,9,10,11};
        int []b = {1,2,4,8,16};
        System.out.println("cau 1 ket qua: "+sum(2,4));
        System.out.println("cau 2 ket qua: "+multi(2,4));
        System.out.println("cau 3 ket qua: "+isArithmeticSequence(a));
        System.out.println("cau 4 ket qua: "+isGeometricSequence(b));
        System.out.println("cau 5 ket qua: "+isPrime(13));
        System.out.println("cau 6 ket qua: "+isPerfectNum(6));
        System.out.println("cau 7 ket qua: "+gcd(6,4));
        System.out.println("cau 8 ket qua: "+icm(4,6));
        System.out.println("cau 9 ket qua: "+Arrays.toString(getMirror(a)));
        speacialSort(a);
    }
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
    System.out.println("cau 10 ket qua:");
    int goEven =0;
    int goOdd = 0;
    int length =a.length;
    int lengthEven=0, lengthOdd=0;
    System.out.println("data have "+length+" number");
    for(int i=0;i<length;i++){
    if(a[i]%2==0){
    lengthEven++;
    }//end if count even
    else{
    lengthOdd++;
    }//end else count odd
    }//end for loop count even and odd
    System.out.println("we have :"+lengthEven+" even number and "+lengthOdd+" odd number");
    System.out.println("Now create two array to store odd and even number sep");
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
    System.out.println("this is even array"+Arrays.toString(even));
    System.out.println("this is odd array"+Arrays.toString(odd));
    System.out.println("\nSorting");
    for(int i=0; i<lengthEven-1;i++){
    if(even[i]>even[i+1]){
    int temp ;
    temp = even[i];
    even[i]=even[i+1];
    even[i+1]=temp;
    }//end if 
    }//end for sort even
    System.out.println("this is odd array"+Arrays.toString(even));
    for(int i=0; i<lengthOdd-1;i++){
    if(odd[i]>odd[i+1]){
    int temp ;
    temp = odd[i];
    odd[i]=odd[i+1];
    odd[i+1]=temp;
    }//end if 
    }//end for sort odd
    System.out.println("this is odd array"+Arrays.toString(odd));
    System.out.println("Start adding to the main array");
    int goUp=0;
    for(int i=0;i<length;i++){
    int temp;
    while(i<lengthEven){
    temp = even[i];
    a[i]=temp;
    i++;
    }
    while(i>lengthEven && i<length ){
    temp = odd[goUp];
    a[i]= temp;
    i++;
    goUp++;
    }
    }//loop add to main array
    System.out.println("this is main array"+Arrays.toString(a));
    }//end of speacialSort
    
}//end class
