package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class baiTap {
    public static void main(String args[]){
      //  System.out.println(baCanhTamGiac(2,3,4));
        daysoFib();
    }
    //bai 1
    public static double baCanhTamGiac(int a ,int b, int c){
        if(a+b>c&&b+c>a&&c+a>b) {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return-1;
    }
    //bai 2
    public static int position(){
        Scanner a = new Scanner(System.in);
        double x=a.nextInt();
        double y=a.nextInt();
        if(x>0&&y>0){
            return 1;
        }
        else if(x<0&&y<0){
            return 3;
        }
        else if (x>0&&y<0){
            return 4;
        }
        else if(x==0&&y==0){
            return 0;
        }
        else{
            return 2;
        }
    }

    //bai 3
    public static double gaiPhuongTrinh(){
    Scanner input= new Scanner(System.in);
    double a=input.nextDouble();
    double b=input.nextDouble();
    return -b/a;
    }

    //bai 4
    public static double laiSuat(){
    Scanner input=new Scanner(System.in);
        double t = input.nextDouble()/100;
    System.out.println("Pls choose what to do : ");
        System.out.println("1. tinh so tien lai nhan duoc sau k thang");
        System.out.println("2. tinh so thang can gui");
        System.out.println("3. tinh so von can gui");
        int in = input.nextInt();
        while(in!=1&&in!=2&&in!=3){
            System.out.println("Invalid option");
            in = input.nextInt();
        }
        if(in==1){
            double n = input.nextDouble();
            double k = input.nextDouble();
            return Math.round(n+(n*k*t));
        }
        else if(in==2){
            double n = input.nextDouble();
            double m = input.nextDouble();

           return Math.round((m-n)/(n*t));
        }
        else {
            double k = input.nextDouble();
            double m = input.nextDouble();
                return Math.round(m/(1+(k*t)));
        }
    }
    //bai 5
    public static double tienDien(){
        Scanner input = new Scanner(System.in);
        int mFirst=input.nextInt();
        int mSecond=input.nextInt();
        int s=input.nextInt();
        int sum=0;
        for(int i=0;i<s;i++){
            if(i>100){
                sum=sum+mSecond;
            }
            sum=sum+mFirst;

        }
        return sum;
    }

    //bai 7
    public static void timNghiem(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < c; j++) {
                    if (i > 0 && j > 0 && (a * i) + (b * j) == c) {
                        System.out.println(i + "  " + j);
                    }
                }
            }
    }

    //bai 8
    public static void timNghiemBa(){

    }

    //bai9
    public static void timPrime(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        for(int i=n;i<=m;i++){
            int j=2;
           int count=0;
            while(j<=i/2){
                if(i%j==0){
                    count++;
                }
                j++;
            }
            if(count==0&&i>1) {
                System.out.print(i + " ");
            }
        }
    }

    //bai 10
    public static void timPrimeHai(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=0;n>0;i++){
            int j=2;
            int count=0;
            while(j<=i/2){
                if(i%j==0){
                    count++;
                }
                j++;
            }
            if(count==0&&i>1) {
                System.out.print(i + " ");
                n--;
            }
        }
    }

    //bai 11
    public static boolean checkPrime(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(!isPrime(a)||!isPrime(b)){
            return false;
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        if(b==1){
            return true;
        }
        return false;
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        int i=2;
        while(i<=n/2){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    //bai12
    public static void phanSoToiGian(){
        Scanner input = new Scanner(System.in);
        int tuSo = input.nextInt();
        int mauSo = input.nextInt();
        int gcd=0;
        for(int i=1;i<=tuSo&&i<=mauSo;i++){
            if(tuSo%i==0&&mauSo%i==0){
                gcd=i;
            }
        }
        int tuSoToiGian;
        int mauSoToiGian;
        if(gcd==0){
            tuSoToiGian=tuSo;
            mauSoToiGian=mauSo;
        }
        else{
        tuSoToiGian=tuSo/gcd;
        mauSoToiGian=mauSo/gcd;}
        System.out.println(tuSoToiGian+"/"+mauSoToiGian);
    }

    //bai13
    public static double tinhDaThuc(){
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        double x =input.nextDouble();
        double sum=0;
        for(int i=0;i<=n;i++){
            int a=input.nextInt();
            sum=sum+(a*Math.pow(x,n-i));
        }
        return sum;
    }

    //bai14
    public static int doiThapPhan(){
        Scanner input=new Scanner(System.in);
        String hex=input.nextLine();
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    //bai15
    public static void doilai(){
        Scanner input=new Scanner(System.in);
        String a =input.nextLine();
        boolean flag=false;
        int convert=Integer.parseInt(a);
        for(int i=0;i<a.length();i++){
            if(Character.compare((a.charAt(i)),'1')!=0&&Character.compare((a.charAt(i)),'0')!=0){
                System.out.println(Integer.toBinaryString(convert));
                flag=true;
                break;
            }
        }
        if(!flag){
            int decimal = 0;
            int n = 0;
            while(true){
                if(convert == 0){
                    break;
                } else {
                    int temp = convert%10;
                    decimal += temp*Math.pow(2, n);
                    convert = convert/10;
                    n++;
                }
            }
        }
    }

    //bai 16
    public static void doiHexa(){
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            rem=decimal%16;
            hex=hexchars[rem]+hex;
            decimal=decimal/16;
        }
        System.out.println(hex);

    }

    //bai 17
    public static void luyThua(){
        Scanner input=new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        //dung loop
        int sum=1;
        for(int i=0;i<y;i++){
            sum=sum*x;
        }
        System.out.println(sum);
        //hoac dung Math.pow(x,y);
    }

    //bai18
    public static void tinhToan(){
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int sum=0;
        while(d>=1000){
            d=input.nextInt();
        }
        while (d != 0) {
        sum=sum+(d%10);
        d=d/10;
        }
        System.out.println(sum);
        }
    //bai19
    public static void tinhToanNhap(){
        Scanner input=new Scanner(System.in);
        int a =input.nextInt();
        int b = input.nextInt();
        char c = input.next().charAt(0);
        if(Character.compare(c,'+')==0){
            System.out.println(a+b);
        }
        else if(Character.compare(c,'-')==0){
            System.out.println(a-b);
        }
        else if(Character.compare(c,'*')==0){
            System.out.println(a*b);
        }
        else if(Character.compare(c,'/')==0){
            System.out.println(a/b);
        }
        else{
                System.out.println("không phải phép toán");
    }
    }

    //bai20
    public static void pitago(){
        Scanner input= new Scanner(System.in);
        int n =  input.nextInt();
        for(int i=1;i<n;i++){
            for(int j=n;j>0;j--){
                if(Math.pow(n,2)==(Math.pow(i,2)+Math.pow(j,2))){
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    //bai21
    public static void lapPhuong(){
       int sum;
        int n;
        int temp;
        for(int i=100;i<999;i++) {
            n=i;
            sum=0;
                while (n != 0) {
                    temp = n%10;
                    sum = sum + temp*temp*temp ;
                    n = n / 10;
                }
                if (i==sum) {
                    System.out.println(i);
                }
        }
    }
    //bai22
    public static void soHanhPhuc(){
        int[]a=new int[]{0,0,0,0,0,0};
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
        int n = number;
        int i=5;
        while(number!=0) {
            a[i] = number % 10;
            number = number / 10;
            i--;
        }
        int sum=0;
        for(int k=0;k<a.length/2;k++){
            sum=sum+(a[k]-a[(a.length-1)-k]);
        }
        if(sum==0){
            System.out.print(n+" la so hanh phuc");
        }
    }
    //bai23
    public static void timsomersen(){
        Scanner input = new Scanner(System.in);
       int n=input.nextInt();
        for(int i=2;i<=n;i++){
            int j=2;
            int count=0;
            while(j<=i/2){
                if(i%j==0){
                    count++;
                }
                j++;
            }
            double a =Math.pow(2,i)-1;
            if(count==0&&a<=n) {
            System.out.println(a);
            }
        }
    }
    //bai25
    public static void tinhoddeven(){
        Scanner input= new Scanner(System.in);
                int a =input.nextInt();
                int multi=1;
        if(a%2==0){
            for(int i=2;i<=a;i=i+2){
                multi=multi*i;
            }
            System.out.println(multi);
        }
        else if(a<=0){

        }
        else{
            for(int i=1;i<=a;i=i+2){
                multi=multi*i;
            }
            System.out.println(multi);
        }
    }
    //bai24  da tung lam
    
    //bai26
    public static void daysoFib() {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long m = input.nextLong();
        long n2=1,n1=1,n3 = 0;
        //so fib thu n
        System.out.print("So Fib thu "+n+" : ");
        if(n==1||n==2){
            System.out.println(n2);
        }
        else{
        for(int i=3;i<=n;i++){
            n3=n2+n1;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);
        }

        //cac so fib be hon m
        long n4=0;long n5=1,n6=1,k=0;
        System.out.print("Cac so Fib be hon "+m+" : ");
        while(n4<m) {
            if (k == 0 || k == 1) {
                System.out.print("1 ");
                k++;
            } else {
                n4 = n5 + n6;
                n5 = n6;
                n6 = n4;
                if (n4 > m) {
                    break;
                }
                System.out.print(n4 + " ");
                k++;
            }
        }

        //tim tong m so fib
        System.out.println();
        long n7=1,n8=1,n9=0,sum=0,l=0;
        System.out.print("tong "+m+" so fib : ");
        while(m>0){
        if(l==0||l==1){
            sum=sum+n7;
            l++;
            m--;
        }
        else{
            n9=n7+n8;
            sum=sum+n9;
            n7=n8;
            n8=n9;
            m--;
        }
        }

        //check so fib n
        System.out.print(sum);
        System.out.println();
        long n10=1,n11=1,n12=0;
        boolean flag=false;
        for(int v=0;n12<n;v++){
            if(n==1){
                System.out.println(n+" is the fib number ");
            }
            else{
                n12=n10+n11;
                n10=n11;
                n11=n12;
                if(n12==n){
                    flag=true;
                    break;
                }
            }
        }
        if(flag){
            System.out.println(n+" is the fib number");
        }
        else{
            System.out.println(n+" isn't the fib number");
        }

        //phan tach n thanh tong fib
        long n13=1,n14=1,n15=0;
        System.out.print(n+" la tong cua cac so fib sau : ");
        if(n==1){
            System.out.println(n13);
        }
        while(n>0) {
            for (int c = 0; n15 < n; c++) {
                n15 = n13 + n14;
                if(n15>n){
                    n15=n14;
                    break;}
                n13 = n14;
                n14 = n15;

            }
            n=n-n15;
            System.out.print(n15+" ");
            n15=0;n14=1;n13=1;
        }
    }

    //bai27
    public static void inBang() {

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + i * j);
                }
            }
    }
}



