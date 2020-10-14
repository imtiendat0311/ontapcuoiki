package com.company;
import java.util.Scanner;
public class baiTap {
    public static void main(String args[]){
      //  System.out.println(baCanhTamGiac(2,3,4));
        tinhoddeven();
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

    //bai27
    public static void inBang() {

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + i * j);
                }
            }
    }
}



