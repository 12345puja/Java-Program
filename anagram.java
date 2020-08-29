import java.util.*;
public class anagram{
   
    static boolean isanagram(String a, String b){
        boolean result = true;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()){
            result = false;
        }
        else{
            char Array1[] = a.toCharArray();
            char Array2[] = b.toCharArray();
            Arrays.sort(Array1);
            Arrays.sort(Array2);
            if(Array1.equals(Array2)){
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean r = isanagram(str1,str2);
        System.out.println((r) ? "Anagrams" : "Not Anagrams");
    }
}
