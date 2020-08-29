import java.util.*;
public class swap_strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("String1 = "+str1);
        System.out.println("String2 = "+str2);    
    }
}
