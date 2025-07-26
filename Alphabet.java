// Creating A-Z by Pattern programming
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


// print "C"
class C
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
				
				if(j==0 || i==0 && j<=n/2|| i==n-1 && j<=n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
}



// print "D"
class D
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
				
				if(j==0 || i==0 && j<=n/2||j==n/2 || i==n-1 && j<=n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}




//print "E"
class E
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
				
				if(j==0 || i==0 ||i==n/2 && j<=n/2 || i==n-1)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}				
}

 

//Print "F"
class F
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
				
				if(j==0 || i==0 ||i==n/2 && j<=n/2 )
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}			
}



//Print "G"
class G
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
				if(j==0 ||
					i==0 ||
					i==n-1 && j<=n/2 ||
					i==n/2 && j>=n/2 || 
					j==n/2 && i>=n/2 || 
					j==n-1 && i>=n/2 )
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
}


// Print "H"
class H
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
				
				if(j==0 ||
					j==n/2 || 
					i==n/2 && j<=n/2) 
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}


// Print "I"
class Test
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
				
				if(i==0 && j<=n/2 ||
					j==n/4 || 
					i==n-1 && j<=n/2) 
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}	
}



// print "J"
class J
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
				
				if(i==0 ||
					j==n/2 || 
					i==n-1 && j<=n/2 ||
					j==0 && i>=(n-(n/4)))
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}


// Print "K"
class K
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
				
				if(j==n/2 || 
					i+j==n-1 && i<=n/2 ||
					i==j && j>=n/2)
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}



//print "L"
class L
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
				
				if(j==0 || i==n-1 && j<=n/2)
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}


// Print "M"
class M
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
				
				if(j==0 || j==n-1 || i+j==n-1 && i<=n/2 || i==j && i<=n/2)
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}


// Print "N"
class N
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
				
				if(j==0 || j==n-1 || i==j)
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}



// Print "O"
class O
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
				
				if(i==0 ||j==0 || j==n-1 || i==n-1)
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}




// Print "P"

class P
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
				
				if(j==0 || i==0 && j<=n/2 || j==n/2 && i<=n/2 || i==n/2 && j<=n/2)
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}










// print "R"
class R
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
				
				if (j==n/2 || i==0 && j>=n/2 || j==n-1 && i<=n/2 || i==n/2 && j>=n/2 || i==j && j>=n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}





// Print "S"
class S
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
				
				if (i==0 && j<=n/2 || j==0 && i<=n/2 || i==n/2 && j<=n/2 || j==n/2 && i>=n/2 || i==n-1 && j<=n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}




// Print "T"
class T
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
				
				if (i==0 || j==n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}



// Print "U"
class U
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
				
				if (j==0 ||i==n-1 && j<=n/2 || j==n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}




//Print "v"
class V
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
				
				if (i+j==n-1 && i<=n/2 || i==j && i<=n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}


// print "W"

class W
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
				
				if (j==0 || j==n-1 || i+j==n-1 && i>=n/2 || i==j && j>=n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}


// Print "X"
class X
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
				
				if ( i==j || i+j==n-1)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}



//Print "Y"
class Y
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
				
				if (i+j==n-1 || i==j && i<=n/2)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}



//Print "Z"
class Z
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
				
				if ( i==0|| i+j==n-1 || i==n-1 )
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}



 