// non-acess modifier :- the modifier which deals with the functanality of only class , methods & variables , is known as non acess variables.

//final:-
// 1. if a method declared as final then we can not override that method .
class A1 {
    final void m1() {
        System.out.println("hii");
    }
}

// //class B1 extends A1 {
// public void m1(){
// System.out.println("hello");
// }
// }

class Test1 {
    public static void main(String[] args) {

    }
}

// 2. if a method is declared as final then it is not mandatory to declare the
// class as final.

class A2 {
    final void m1() {
        System.out.println("hii");
    }
}

class Test2 {
    public static void main(String[] args) {

    }
}

// 3.if a class is declared as final then we cannot inherit that properties of
// that class .

// final class A3{

// }
// class B2 extends A3{

// }
// class Test3 {
// public static void main(String[] args) {

// }
// }

// but final class can be inherited the properties of normal class .

// 4. final class can contain both final & normal method

final class A4 {
    final void m1() {
        System.out.println("hello");
    }

    public void m2() {
        System.out.println("heyy");
    }
}

class Test {
    public static void main(String[] args) {

    }

}

// 5.if a class is declared as final then all the merhods present inside the
// class behaves as final methods . it means we can not override that method .

final class A5 {
    final void m1() {
        System.out.println("hello");
    }

    public void m2() {
        System.out.println("heyy");
    }
}
// class B5 extends A5{

// public void m2(){
// System.out.println("hello");
// }
// }
class Test5 {
    public static void main(String[] args) {

    }

}

// 6. final class can be instantiated (can create an objrct ).

// abstract :--
// (only appplicable for method & class )

// 1. if a method is abstract then we cannot provide the implementation part to
// that method .

// class A6 {
// abstract void m1(){
// System.out.println("hii");
// }
// }

// not corerct

abstract class A7 {
    abstract void m1();
}

class Test7 {
    public static void main(String[] args) {

    }
}

// 2. if a method is declared as abstract then it is mandatory to declare the
// class is abstract .
abstract class A8 {
    abstract void m1();
}

class Test8 {
    public static void main(String[] args) {

    }
}

// if we want to provide the implementaion part to any abstract method then we
// have to override it .
abstract class A9 {
    abstract void m1();
}

class B4 extends A9 {
    public void m1() {
        System.out.println("hii");
    }
}

class Test6 {
    public static void main(String[] args) {
        B4 b1 = new B4();
        b1.m1();

        A9 a1 = new B4();
        a1.m1();
    }
}

// if a class is abstract then we can not instantiated or create objcet of that
// class .

// abstract class can be inherited .

abstract class B7 {
}

class f4 extends B7 {

}

// Abstract class can have both abstract & normal method .
abstract class c7 {
    abstract void m1();

    public void m2() {
        System.out.println("heyy");
    }
}

class Test1_ {
    public static void main(String[] args) {

    }
}

// // Static method
class D2 {
    public static void m9() {
        System.out.println("abc");
    }
}

class D3 extends D2 {
    public static void m9() {
        System.out.println("def");
    }
}

class Test9 {
    public static void main(String[] args) {
        //D2 d1 = new D2();
        D2.m9();

        //D3 d2=new D3();
        D3.m9();

        D2 d3 = new D2();
        d3.m9();

    }
}