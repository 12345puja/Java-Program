import java.util.*;
public class largest_smallest_char{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string:");
        String str = sc.nextLine();
        char Array[] = str.toCharArray();
        Arrays.sort(Array);
        int len = Array.length;
        System.out.println("Smallest character : "+Array[0]);
        System.out.println("Largest character : "+Array[len-1]);
    }
}
