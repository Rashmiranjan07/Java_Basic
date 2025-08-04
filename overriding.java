// Method overriding - Changing the implemntation part of any parent class method inside the child class according to the recquirement of the child class is known as method overriding .

// 

class A {
    public void m1() {
        System.out.println("abc");
    }
}

class B extends A {
    public void m1() {
        System.out.println("def");
    }
}

class Test {
    public static void main(String[] args) {
        A a1 = new A();
        a1.m1(); // abc

        B b1 = new B();
        b1.m1(); // deff

        A a2 = new B();
        a2.m1(); // def
    }
}

// ex-2
class C {
    public void m1() {
        System.out.println("abc");
    }

    public void m2() {
        System.out.println("m2-method");
    }
}

class D extends C {
    public void m1() {
        System.out.println("def");
    }
}

class Test1 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m1(); //abc (runtime object bcoz m1() is an overridden method )
        c1.m2(); // m2-method (refrence type bcoz m2() is not an overridden method)

        D d1=new D();
        d1.m1(); //abc (runtime object bcoz m1() is an overridden method )
        d1.m2(); //m2-method (refrence type bcoz m2() is not an overridden method)

        C c2=new D();
        c2.m1(); //abc (runtime object bcoz m1() is an overridden method )
        c2.m2(); //m2-method (refrence type bcoz m2() is not an overridden method)
    }
}