import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       String str="";
       String name=A;
       for (int i=0;i<A.length();i++){
           char ch=A.charAt(i);
           str=ch+str;
       }
       if (name.equals(str)){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
        
    }
}

