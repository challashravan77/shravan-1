package javaprograms;
import java.util.Scanner;
public class hotelrooms  
{
	public void hotel(int a)
	{
		Scanner sc=new Scanner(System.in);
		if(a==1) {
			System.out.println("Ac Room is Available cost is 3000");
		}
		if(a==22) {
			System.out.println("Non-Ac Room is Available cost is 2500");
		}
		if(a==101) {
			System.out.println("Ac Room is Available cost is 2000");
		}
		if(a==202) {
			System.out.println("Non-Ac Room is Available cost is 1500");
		}
	}
	public void show()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("welcome to shimla");
		System.out.println("Available in  hotels");
		System.out.println("1 sitra\n2 Ramu");
		System.out.println("please enter the choice?");
		System.out.println("------------------------------------------------");
		int choice=Sc.nextInt();
		System.out.println("11----Ac Room is 3000");
		System.out.println("22----Non-Ac Room is 2500");
		System.out.println("--------------------------------");
		System.out.println("101----Ac Room is 3000");
		System.out.println("202----Non-Ac Room is 2500");
		if(choice==1)
		{
			System.out.println("11----Ac Room is 3000");
			System.out.println("22----Non-Ac Room is2500");
			System.out.println("enter your code");
			System.out.println("----------------------------");
			int a = Sc.nextInt();
			hotel(a);
			System.out.println("your room is booked.");
		}
		else if(choice==2)
		{
			System.out.println("101---Ac Room is 3000");
			System.out.println("202----Non-Ac Room is 2500");
			System.out.println("enter your code");
			System.out.println("---------------------------");
			int a=Sc.nextInt();
			hotel(a);
			
		}
		
	}
	
	
	

}
