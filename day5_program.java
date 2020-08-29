public class day5_program{

    static void length(){
        String text = "I am an Engineering student. I like to play table tennis. But i love Badminton. I am good at solving problems.";
        int len = text.length();
        System.out.println(len);
    }

    static void words(){
        String text = "I am an Engineering student. I like to play table tennis. But i love Badminton. I am good at solving problems.";
        String[] strArray = text.split(" ");
        int count=0;
        for(String token : strArray){
            count++;
        }
        System.out.println(count);
    }
     
    static void sentences(){
        String text = "I am an Engineering student. I like to play table tennis. But i love Badminton. I am good at solving problems.";
        String[] strArray = text.split("\\.");
        int count=0;
        for(String token : strArray){
            count++;
        }
        System.out.println(count);
    }


    static void reverse(){
        String text1 = "sonu sood";
        String firstname = text1.substring(0,4);
        String lastname = text1.substring(5,9);
        String rev1 = "";
        String rev2 = "";
        int len1 = firstname.length();
        int len2 = lastname.length();
        for(int i=len1-1;i>=0;i--){
            rev1 = rev1 + firstname.charAt(i);
        }
        for(int i=len2-1;i>=0;i--){
            rev2 = rev2 + lastname.charAt(i);
        }
        System.out.println(rev1+" "+rev2);
    }

    
    public static void main(String[] args){
        //length();
        //words();
       // sentences();
        reverse();
    }
    }
