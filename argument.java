
// non-static with primitive argument
class Test 
 {
    public void m1(int x)
    {
        System.out.println("abc");
    }
    public static void main(String[]args)
    {
        Test t1=new Test();
        t1.m1(10);
    }

 }

// non-static with non-primitive
class demo {
    public  void m1(String s)
    {
        System.out.println("abc");
    }
    public static void main(String[]args)
    {
       
        demo d=new demo();
        d.m1(new String());
        d.m1(null);
        d.m1("abv");
    }

}


//Static with primitive argument
class Subham {
    public static void m1(int x)
    {
        System.out.println("abc");
    }
    public static void main(String[] args) {
        m1(10);
        Subham.m1(20);

    Subham s=new Subham();
    s.m1(10);

    }
}


// Static with non primitive argument 
class Rupu{
    public static void m1(String s)
    {
        System.out.println("bc");
    }
    public static void main(String[]args)
    {
        m1(null);
    }
}