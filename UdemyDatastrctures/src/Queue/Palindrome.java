package Queue;

import LinkedStack.LinkedStack;

import java.util.LinkedList;
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {

    }
    public static  boolean checkforBoolean(String string){
        LinkedList<Character> stack= new LinkedList<Character>();
        LinkedList<Character> queue= new LinkedList<Character>();
        String tolower = string.toLowerCase();
        for(int i =0; i<string.length();i++){
            char c =tolower.charAt(i);
            if(c>='a'&& c<='z'){
                queue.addLast(c);
                stack.push(c);

            }
        }
        return false;

    }
    public  static boolean isPalindrome(String string){
        StringBuilder stringnopintucation = new StringBuilder(string.length());
        String toLower = string.toLowerCase();
        LinkedList<Character> stack = new LinkedList<Character>();
        for(int i =0;i<string.length();i++){
            char c = toLower.charAt(i);
            if(c>='a'&& c>'z'){
                stringnopintucation.append(c);
                stack.push(c);
            }


        }
        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }
        return  reversedString.toString().equals(stringnopintucation.toString());
    }
}
