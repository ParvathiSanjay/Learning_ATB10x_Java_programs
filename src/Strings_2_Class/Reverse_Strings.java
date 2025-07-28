package Strings_2_Class;

public class Reverse_Strings {
    public static void main(String[] args) {
        String s="welcome";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse string is : " + rev);
    }
}
