package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    //Given a string,determine if it is a palindrome, considering only alphanumeric characters and
    //ignoring cases.
    public static boolean isPalindrome(String s){
        if(s==null||s.length()==0)return true;
        String str=s.toLowerCase();
        int p=-1,q=str.length();
        while (++p<=--q){                //别忘了++p,--q
            while(!Character.isLetterOrDigit(str.charAt(p)))p++;   //isLetterOrDigit的调用
            while(!Character.isLetterOrDigit(str.charAt(q)))q--;
            if(p<=q&&str.charAt(p)!=str.charAt(q))return false;
        }
        return true;
    }
}
