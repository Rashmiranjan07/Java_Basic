public class Loop{
    public static void main(String[] args) {
        System.out.println("Main class running");
    }
}

// print "hii" 3 times 
class Loop0 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("hii");
        }
    }
}

// print 1 to 10 
class Loop1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

// print even numbers between 1 and 10
class Loop2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

// print 10 to 1 
class Loop3 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

// Count the digits of a number 
class Loop4 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2345;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        System.out.println("Number of digits: " + count);
    }
}





// WAP to count the digit of a number using user input 
 import java.util.Scanner;
 class Loop5 {
    public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a numbers");
		int num = Sc.nextInt();
		int count =0;
       for (int num1=num; num>0; num=num/10)
       {
		  count ++;

	  }
	  System.out.println(count);
    }
 }



// Wap to count the each digit of a number .
class Loop6 {
    public static void main(String[] args) {
	
		int sum =0;
       for (int num=234; num>0; num=num/10)
       {
		 int rem = num%10;
		 sum = sum+rem;

	  }
	  System.out.println(sum);
    }
 }




// WAP to count the each digit of a number using user input ?

 //import java.util.Scanner;
 class Loop7 {
    public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a numbers");
		int num = Sc.nextInt();
		int sum =0;
       for (int num1=num; num1>0; num1=num1/10)
       {
		 int rem = num1%10;
		 sum = sum+rem;

	  }
	  System.out.println(sum);
    }
 }




// WAp to calucalte the product 
class Loop8 {
    public static void main(String[] args) {
	
		int pro =1;
      for (int num=234; num>0; num=num/10)
      {
		 int rem = num%10;
	 pro = pro*rem;

	  }
	  System.out.println(pro);
    }
} 




// WAP to cjeck the number is either a prime number or not ?
class Loop9 {
    public static void main(String[] args) {
	
		int num =5;
		int count =0;
      for (int i=1; i<=num; i++)
      {
		if (num%i==0)
		  {
			count++;
		  }
	  }
		if (count==2)
		{
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}
    }
} 