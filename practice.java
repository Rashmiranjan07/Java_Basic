
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



// In method overloading if we are using multiiple method and while calling if the value is matched vertically both of the data type , then the priority goes to always int type (in the case integral value int/byte/short/long) & after we will do downcasting as well as usecase .

class Test2{
    public static void m1(int x) {
        System.out.println("abc");
    }
     public static void m1(byte b) {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test2 t1=new Test2();
        t1.m1(10); // abc
        t1.m1((byte)10); //def
    }
}



class Test3{
    public static void m1(short x) {
        System.out.println("abc");
    }
     public static void m1(byte b) {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test3 t1=new Test3();
       // t1.m1(10); // ce
        t1.m1((short)10); //abc (downcast)
        t1.m1((byte)10); // def (downcaast)
    }
}






