
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
    public void m2(int x) {
        System.out.println("abc");
    }
     public void m2(byte b) {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test2 t1=new Test2();
        t1.m2(10); // abc
        t1.m2((byte)10); //def
    }
}


//example -2

class Test3{
    public  void m3(short x) {
        System.out.println("abc");
    }
     public void m3(byte b) {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test3 t1=new Test3();
       // t1.m1(10); // ce
        t1.m3((short)10); //abc (downcast)
        t1.m3((byte)10); // def (downcaast)
    }
}


// if the argument are getting matched with the non-primitive value then JVM will checked whether there is a parent -child relation or not . if there is a relation then the priority goes to "child class".

class Test4{
    public static void m4(Object o) {
        System.out.println("abc");
    }
     public static void m4(String s) {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test4 t1=new Test4();
        t1.m4(null); // def (priority goes to child class)
        t1.m4((new Object())); //abc (downcast)
        t1.m4((new String())); // def (downcaast)
    }
}


// example -2 
class Test5 {
    public void m5(Test t)
    {
        System.out.println("abc");
    }
    public void m5(Object o)
    {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test5 t2=new Test5();
      //  t2.m5(null); // ce:- there is no realationship between both argument 
    }
}


// in any case if we are passing a value which is getting matched more than one method & there is no parent-child relationship , than we will get the compilation error , (here the value we are taking about is null)  

class Test6 {
    public void m6(Test t)
    {
        System.out.println("abc");
    }
    public void m6(String s)
    {
        System.out.println("def");
    }
    public static void main(String[] args) {
        Test6 t4=new Test6();
        t4.m6(new Test());//abc
        t4.m6(new String());//def
       // t4.m6(null); //ce
    }
}