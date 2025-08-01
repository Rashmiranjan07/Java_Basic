
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
    public void m1(int x) {
        System.out.println("abc");
    }
     public void m1(byte b) {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test2 t1=new Test2();
        t1.m1(10); // abc
        t1.m1((byte)10); //def
    }
}



class Test3{
    public  void m1(short x) {
        System.out.println("abc");
    }
     public void m1(byte b) {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test3 t1=new Test3();
       // t1.m1(10); // ce
        t1.m1((short)10); //abc (downcast)
        t1.m1((byte)10); // def (downcaast)
    }
}


// if the argument are getting matched with the non-primitive value then JVM will checked whether there is a parent -child relation or not . if there is a relation then the priority goes to "child class".

class Test4{
    public static void m2(Object o) {
        System.out.println("abc");
    }
     public static void m2(String s) {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test4 t1=new Test4();
        t1.m2(null); // def (priority goes to child class)
        t1.m2((new Object())); //abc (downcast)
        t1.m2((new String())); // def (downcaast)
    }
}


// example -2 
class Test5 {
    public void m3(Test t)
    {
        System.out.println("abc");
    }
    public void m3(Object o)
    {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test t2=new Test();
      //  t2.m3(null); // ce:- there is no realationship between both argument 
    }
}
