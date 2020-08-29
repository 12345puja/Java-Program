import java.util.*;
public class palindrome{
    static void ispalindrome(String str){
        
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str = sc.nextLine();
        ispalindrome(str);
    }
}
