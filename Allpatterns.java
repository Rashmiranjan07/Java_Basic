import java.util.Scanner;
// print the patttern by 
// *******
// *******
// *******
// *******
// *******
// *******
// *******

// File: Pattern1.java
class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}


// print the patttern by user input 
// *******
// *******
// *******
// *******
// *******
// *******
// *******

// File: Pattern2.java
// import java.util.Scanner;

class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}




// Print the pattern 
// *
// **
// ***
// ****
// *****

// File: Pattern3.java
// import java.util.Scanner;

class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {
                if (i >= j)
                    System.out.print("*");
                else
                    System.out.print("");
            }
            System.out.println();
        }
    }  
}




// Print the pattern 
//     *
//    **
//   ***
//  ****
// *****

// File: Pattern4.java
//import java.util.Scanner;

class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }  
}


// print the pattern 
// ********
// *******
// ******
// *****
// ****
// ***
// **
// *

// File: Pattern5.java
//import java.util.Scanner;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {
                if (i + j <= n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }  
}


// print the pattern
// *****
//  ****
//   ***
//    **
//     *

// File: Pattern6.java
//import java.util.Scanner;

class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {
                if (i <= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }  
}





// print the pattern 
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *

// File: Pattern7.java
// import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1)
                    System.out.print(" *");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }  
}

// File: Pattern8.java
// *********
// *       *
// *       *
// *       *
// *       *
// *       *
// *       *
// *       *
// *********
class Pattern8
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
		for(int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				if(i==0 || j==0 || i==n-1 || j==n-1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
			}
		}
		System.out.println();
		}
	}
}




// print the pattern


//     *
//    ***
//   *****
//  *******
// *********
class Pattern9
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
				if(i>=j && i+j>=n-1)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
			
}



// print this pattern 
// *********
//  *******
//   *****
//    ***
//     *

class Pattern10
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
				if(i+j<=n-1 && i<=j)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
			
}




//Print the pattern 
// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   ****
//  ******
// ********
class Pattern11
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
				
				if((i+j<=n-1 && i<=j)||(i>j && i+j>=n-1))
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
			
}




// print the pattern
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *


class Pattern12
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
				
				if(i>=j && i+j<=n-1)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
}



//Print the pattern
//         *
//        **
//       ***
//      ****
//     *****
//      ****
//       ***
//        **
//         *


class Pattern13
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
				
				if(i<=j && i+j>=n-1)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}		
}




//Print the pattern
// *       *
// **     **
// ***   ***
// **** ****
// *********
// **** ****
// ***   ***
// **     **
// *       *


class Pattern14
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
				
				if((i>=j && i+j<=n-1) || (i<=j && i+j>=n-1))
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
}


//Print the pattern 
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *


class Pattern15
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
				
				if(i<=j && i+j>=n-1)
					System.out.print(" *");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
}





//Print the pattern
// *****************
// **      *      **
// * *     *     * *
// *  *    *    *  *
// *   *   *   *   *
// *    *  *  *    *
// *     * * *     *
// *      ***      *
// *****************
// *      ***      *
// *     * * *     *
// *    *  *  *    *
// *   *   *   *   *
// *  *    *    *  *
// * *     *     * *
// **      *      **
// *****************


class Pattern16
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
				
				if(i==0 || i==n-1 || j==0 || j==n-1 || i==n/2 || j==n/2 || i==j || i+j==n-1)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
}


//Prinmt the pattern 
// *  *  *
//  * * *
//   ***
// *******
//   ***
//  * * *
// *  *  *

class Pattern17
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
				
				if(i==n/2 || i==j || i==j || j==n/2 || i+j==n-1)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
			
}


// Print pattern 
// *******
// *  *
// *  *
// *******
// *  *
// *  *
// *  *

class Pattern18
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

// 🗼 Eiffel Tower print 
class Tower
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
					i+j==n-1 && i>=n/2 ||
					i==j && j>=n/2)
					
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}




// Print the pattern
// a      
// bb
// ccc
// dddd
// eeeee
// ffffff

class Pattern19
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
				
				if (i>=j)
					System.out.print((char)(i+97));
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}



// Print the pattern
// a      
// ab     
// abc    
// abcd   
// abcde  

class Pattern20
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
				
				if (i>=j)
					System.out.print((char)(j+97));
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}


// Print the pattern 
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
class Pattern21
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
		int k=1;
		for(int i=0; i<n; i++)			
		{
			for(int j=0; j<n; j++) 
			{
				
				if (i>=j)
					System.out.print(k++ + " ");
				else
				System.out.print(" ");
			}
			System.out.println( );
		}
	}
					
}
