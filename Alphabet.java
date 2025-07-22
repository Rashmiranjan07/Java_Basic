// public class Alphabet {
    
// }
import java.util.Scanner;
// Print "A"
class A
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
		for(int i=0; i<n; i++)			
		{
			for(int j=0; j<n; j++) 
			{
				
				if(j==0 || j==n/2 || i==0 && j<=n/2|| i==n/2 && j<=n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}


// print "B"
class B
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
		for(int i=0; i<n; i++)			
		{
			for(int j=0; j<n; j++) 
			{
				
				if(j==0 || j==n/2 || i==0 && j<=n/2|| i==n/2 && j<=n/2 || i==n-1 && j<=n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
}



 