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
        double x =3;
        System.out.println("e  cua x=3 va n =100 la "+taylor(n,x));
    }
    public static double taylor (int n, double x){
        double exp=0;
        for(int i =0;i<=n;i++ ){
            exp+=emp(x,i);
        }//end for
        return exp;
    }//end exp
    public static double emp(double x,int i){
        double emphasis=0;
        double top=1;
        double bottom=1;
        top = Math.pow(x,i);
        if(i==0){
            bottom=1;
        }//end if
        for (int j=1;j<=i;j++){
            bottom=bottom*j;
        }//end for
        emphasis=top/bottom;
        return emphasis;
    }//end emp
}
    


