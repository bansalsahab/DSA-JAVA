
import java.util.*;

public class paranthese {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();

                }
                if (count < 1) {
                    return true;// duplicate
                } else {
                    s.pop();// opening pair
                }
            } else {
                // opening
                s.push(ch);
            }

        }
        return false;
    }
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);

            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='('&& ch==')')
                    || (s.peek()== '{'&& ch=='}')
                    || (s.peek()== '['&& ch==']')){
                        s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]) {
        // valid strig
        String str = "(})";// 
        System.out.println(isValid(str));

    }
}
