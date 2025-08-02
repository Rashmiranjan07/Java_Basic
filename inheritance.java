 
 // Single inheritance :- Acquiring the properties of one class by another class is known as single iheritance .
 class A {
    public void m1()
    {
        System.out.println("one");
    }
}

class B extends A {
     public void m2()
    {
        System.out.println("Two");
    }
}

class Test {
     public static void main(String[]args)
    {
        A a1=new A();
        a1.m1();

        B b1=new B();
        b1.m1();
        b1.m2();


    }
}


// multilevel inheritance :- if a chils class hve the properties of another parent class , then the inheritance is known as mulilevel inheritance .

class C {
    public void m3()
    {
        System.out.println("one");
    }
}

class D extends C {
    public void m4()
    {
        System.out.println("Two");
    }
}


class E extends D {
    public void m5()
    {
        System.out.println("Three");
    }
}

class Demo {
    public static void main(String[]args)
    {

        C a1=new C();
        a1.m3();

        D d1=new D();
        d1.m3();
        d1.m4();

        E e1=new E();
        e1.m3();
        e1.m4();
        e1.m5();
        

        
    }
}

// Multiple inheritance :- if one class have the properties of more than one class then it is known as Multilevel inheritance.


// Hierarchical inheritance :-  if more than one class have the property of one class , thgen it is known as hierarchical inheritance .

class F {
    public void m6()
    {
        System.out.println("one");
    }
}

class G extends F {
    public void m7()
    {
        System.out.println("Two");
    }
}


class H extends F {
    public void m8()
    {
        System.out.println("Three");
    }
}

class Subham {
    public static void main(String[]args)
    {
        F f1=new F();
        f1.m6();

        G g1=new G();
        g1.m6();
        g1.m7();

        H h1=new H();
        h1.m6();
        h1.m8();
    }
}



// hybrid inheritance :-it is the combination of single inheritance,multilevel inheritance,multiple inheritance,hierachical inheritance,hybrid inheritance .
// it is also nopt supportedd in java bcoz of multiple inheritannce .




// N.B:- we can not access static method inside a main method directly whilw calling it another class .
class Z {
    public static void m1()
    {
        System.out.println("one");
    }
}

class X {
     public static void m2()
    {
        System.out.println("Two");
    }
}

class TestZ {
     public static void main(String[]args)
    {
       
      // m1(); // cannot possible
      // m2(); // can not possible 
    }
}