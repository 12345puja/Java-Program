import java.util.*;
public class table_recursion{
    
    static void table(int n,int i){
        if(i>10){
            return ;
        }
        else{
            System.out.println(n+"x"+i+"="+n*i);
            table(n,i+1);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = sc.nextInt();
        table(num,1);
    }
}
