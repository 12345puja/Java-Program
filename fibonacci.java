import java.util.*;
public class fibonacci{

    static int fibo(int n){
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms:");
        int num = sc.nextInt();
        int F = fibo(num);
        System.out.println(F);
    }
}
