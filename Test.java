// Here the excution of the blocks will be done on the basis of the condition (true/false) present in the begning of the "if-block", where if block will be excuted if the output of the condition is "true" & else block will be excuted if the output of the consition is false .

class Test {

    public static void main(String[] args) {
        if (true) {
            System.out.println("hey");
        } else {
            System.out.println("hello");
        }

    }

}

/* In the condition part either we can write boolean expression (true/false) directly or we can perfrom an operation whose output will be in the form of boolean expresion  */

class Test {

    public static void main(String[] args) {
        if (10 > (10 + 2)) {
            System.out.println("hey");
        } else {
            System.out.println("hello");
        }

    }

}

/*Else is optional  */
class Test
{

	public static void main (String[]args)
	{
		if(true)
		{
			System.out.println("hey");
		}

	}

}

// ex-2 

class Test
{

	public static void main (String[]args)
	{
		if(false)
		{
			System.out.println("if block");
		}
		    System.out.println("Main method");

	}

}

/*We can not write any statement in between if & else , if we are doing so , then we will get compilation error .*/

class Test
{

	public static void main (String[]args)
	{
		if(true)
		{
			System.out.println("if block");
		}

		    System.out.println("Main method");   //compilation error 
		else {
			System.out.println("bce");

		}
		System.out.println("bce");
	}

}

/*curly braces {} are optional in if-else statement  */

class Test {

    public static void main(String[] args) {
        if (true)

            System.out.println("if block"); 

        System.out.println("i am a boy");

    }

}

/* If we are not giving any curly braces {} then the very next statement as the part of the if block & that is the only statement which will be considered */

class Test {

    public static void main(String[] args) {
        if (false)

            System.out.println("if block");
            System.out.println("i am a boy"); // i am a boy 

    }

}
