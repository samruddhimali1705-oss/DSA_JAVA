package Strings;
import java.util.*;

public class Basic_string_opr {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=sc.nextLine();
		
		//Display String 
		System.out.println("Originall String "+str);
		
		//Concatenation of string
		System.out.println(str+" "+str2);
		
		//length of string
		 System.out.println(str.length());
		 
		 //charAt
		 for(int i =0;i<str.length();i++)
		 {
			 System.out.println(str.charAt(i));
		 }
		 
		 //lowecase
		 System.out.println("Lowercase "+str2.toLowerCase());
		 
		 //uppercase
		 System.out.println("Uppercase "+str.toUpperCase());
		 sc.close();
	}
}
