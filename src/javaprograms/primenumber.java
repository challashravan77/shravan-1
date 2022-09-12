package javaprograms;

import java.util.Scanner;
{
	public classprimenumber
	
public static void main(String[] args) {
	        int n;
	        int cn;
	        int count;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter a number");
	        n=sc.nextInt();
	        System.out.println(n);
	        for (int i=1;i<=n;i++)
	        {
	            cn=i;
	            count=0;
	            for (int j=1;i<=n;i++)
	            {
	                if(cn%j==0)
	                {
	                    count++;
	                }
	            }
	            if(count==2)
	            {
	                System.out.println(cn);
	            }
	        }
	    }
		
		
	}


