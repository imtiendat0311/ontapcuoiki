/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp;

/**
 *
 * @author datng
 */
public class Exp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        int x =3;
        System.out.println("e  cua x=3 va n =100 la "+taylor(n,x));
    }
    public static double taylor (int n, int x){
    double exp=0;
    for(int i=0;i<n;i++){
    exp=exp+emp(i,x);
    
    }//end for loop tinh e mu x
    return exp;}//end exp method
    public static double emp (int soTu, int x){
    
    double emphasis=0;
    double emphasisBottom=1;
    double emphasisTop=1;
    if(soTu==0){
    emphasisBottom=1;
    emphasisTop=1;
    emphasis=emphasisTop/emphasisBottom;
    return emphasis;
    }//end if
    for (int z=1;z<soTu;z++){
    emphasisBottom=emphasisBottom*z;
    }//end for mau so
    for (int z=1;z<soTu;z++){
    emphasisTop*=x;
    }//end for tu so
    emphasis=emphasisTop/emphasisBottom;//emp = tu/mau
    return emphasis; }//end emp method
    
}
