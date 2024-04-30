import java.util.Scanner;

public class GCD {
    Scanner scanner = new Scanner(System.in);
    public int getForLoop(int n1, int n2){
        int gcd = 0;
        for (int i = 1; i <= n1 && i <= n2; i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }return gcd;
    }
    public int getWhileLoop(int n1, int n2){
        while(n1 != n2){
            if(n1 > n2){
                n1 -= n2;
            }else{
                n2 -= n1;
            }
        }return n1;
    }
    public int getRecursion(int n1, int n2){
        if(n2 != 0){

        return    getRecursion(n2, n1 % n2);
        }else{
            return n1;

        }
    }

}
