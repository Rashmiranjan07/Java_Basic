 
 // Static inside the nonstatic 
 class method {
    public static void m1()
	{
		System.out.println("hi");
	}
	
	public void m2()
	{
		m1();
		//System.out.println("hello");
	}
	public static void main(String[]args)
	{
		method t1=new method();
		t1.m2();
	}
}



// non-static inside static 
 class Test {
    public void m1()
    {
        System.out.println("hii");
    }
    public static void m2()
    {
        Test t1 = new Test();
        t1.m1();
        System.out.println("hello");

    }
     public static void main(String[]args)
     {
        m2();
     }
 } 


 // Static inside static 
 class demo
  {
    public static void m1()
     {
        System.out.println("hii");
     }

     public static void m2()
     {
        m1();
        System.out.println("hey");
     }

      public static void main(String[]args)
      {
        m1();
      }

 }



 //non-static inside non-static 
 class Ns {
    public void m1()
    {
        System.out.println("hello");
    }
    public void m2()
    {
        m1();
        System.out.println("hello");
    }
    public static void main(String[]args)
    {
       Ns n1=new Ns();
       n1.m1();
    }
 }



 