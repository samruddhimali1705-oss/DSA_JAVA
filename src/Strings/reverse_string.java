package Strings;
import java.util.*;

public class reverse_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Original String ");
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		//Reverse string
		System.out.println("Reverse String:");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
		sc.close();
	}

}
