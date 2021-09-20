package strings;

import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {
        int x=90;
        String str="I am a good girl";
        String str1=new String("hello");
        boolean result=str.contains("am");
        System.out.println("The result is "+result);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('o'));
        System.out.println(str.concat("kkkk"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,8));
        String arr[]=str.split(" ");
        System.out.println(arr[1]);
        System.out.println(str.length());
        for(int index=0;index<str.length();index++){
            System.out.println(str.charAt(index));
        }
        System.out.println(str.equals(str1));
        System.out.println(str.startsWith("I am"));
        str.endsWith("girl");
        //== compares memory location
        //.equals compares the string value



    }
}
