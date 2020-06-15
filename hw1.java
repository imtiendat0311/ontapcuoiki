
import java.util.Scanner;
public class hw1{

    public static void main(String[] args) {
        int n ;
String temp;
Scanner s = new Scanner(System.in);
n=s.nextInt();
Scanner s1 = new Scanner(System.in);
String names[]= new String[n];
for(int i =0; i<n ; i++){
 names[i]=s1.nextLine();   
}
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if(names[i].compareTo(names[j])>0){
            temp = names[i];
            names[i]=names[j];
            names[j]=temp;
        }
    }
}
System.out.println("Names sorted order :");
for(int i =0; i<n-1;i++){
    System.out.println(names[i]);
}
System.out.println(names[n-1]);
    }
}
