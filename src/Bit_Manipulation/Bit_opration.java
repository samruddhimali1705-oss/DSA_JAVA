package Bit_Manipulation;

import java.util.Scanner;

public class Bit_opration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//Get Opration
		int n=5;//5=>0101
		int pos=2;
		int bitmask=1<<pos;
		if((bitmask & n)==0)
		{
			System.out.println("Bit is zero");
			
		}
		else
		{
			System.out.println("Bit is not zero");
		}
		
		//Set Opration
		int pos2=1;
		int bitmask2=1<<pos2;
		
		int newnum=bitmask2 | n;
		System.out.println("New Number is: "+newnum);//new bum=7=>0111 at pos 1 there is 0 wich repalced with 1
		
		//clear opration
		int res=~(bitmask) & n;//5=>0101 0001<<2 = 0100 ~0100=1011
		System.out.println(res);//1=>0001 at pos=2 there is 1 where we clear it and replaced with 0 i.e =0001
		
		//Update operation
		System.out.println("Enter bit to be updated: ");
		int update_bit=sc.nextInt();
		int pos3=3;
		int bitmask3=1<<pos3;
		
		if(update_bit==1)
		{
			
			int newnum_up=bitmask3 | n;
			System.out.println("New Number is: "+newnum_up);//new bum=7=>0111 at pos 1 there is 0 wich repalced with 1
		}
		else
		{
			int res2=~(bitmask3) & n;//5=>0101 0001<<2 = 0100 ~0100=1011
			System.out.println("Updated number: "+res2);//1=>0001 at pos=2 there is 1 where we clear it and replaced with 0 i.e =0001
			
		}
		
		
		
	}

}
