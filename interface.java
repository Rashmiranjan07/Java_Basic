// * write a program to prove the interface variable are bydefaultly static ?
//pg1:-
interface A {
    int x = 10;
}

class i1 {
    public static void main(String[] args) {
        System.out.println(A.x); // 10
    }
}

// pg2:-
interface B {
    int x = 10;
}

class Test1 implements B {
    public static void main(String[] args) {
        System.out.println(B.x); // 10
        System.out.println(x); // 10
        System.out.println(Test1.x); // 10
    }
}