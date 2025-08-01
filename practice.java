
 class Test{
    public static void main(int x) {
        System.out.println("abc");
        
    }
    public static void main(String[] args) {
        System.out.println("def");
        main(10);
    }
}


// tricky question 
class A{
}
class B extends A{
}
class C extends B{
}
class Test1{
    public void m1(Object o)
    {
        System.out.println("one");
    }
    public void m1(A a1) {
        System.out.println("two");
        
    }
     public void m1(B b1) {
        System.out.println("three");
        
    }
    public static void main(String[] args) {
        Test1 t=new Test1();
        C c1 =new C();
        t.m1(c1);

    }
}