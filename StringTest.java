import java.util.*;
/**** 1 start*/
public class StringTest{
    static void printAtoZ(){
        char ch;
        for(ch=65;ch<=90;ch++){
           System.out.println(ch);
        }
    }
/*** 1 end */

/*** 2 start */
    static void printatoz(){
        char ch;
        for(ch=97;ch<=122;ch++){
            System.out.println(ch);
        }
    }
  /*** 2 end */ 
  
  
  /**** 3 start */
    static void convertcase(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character:");
        char ch = sc.next().charAt(0);
        if(ch>=65 && ch<=90){
            ch = Character.toLowerCase(ch);
            System.out.println(ch);
        }
        else if(ch>=97 && ch<=122){
            ch = Character.toUpperCase(ch);
            System.out.println(ch);
        }
    }
    /*** 3 end */

    public static void main(String[] args){
        printAtoZ();
        printatoz();
        convertcase();
    }

    
}
