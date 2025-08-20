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

        Test1 t1=new Test1();
        System.out.println(t1.x); //10
    }
}



// Write a program to prove the interface variable is bydefaultly final 

// interface C {

//     int x=10;
// }
// class Test2{
//     public static void main(String[] args) {
//         C.x=20; // CE
//     }
// }



//pg3:-
interface C {
    int x = 10;
}

class Test2 implements C {

    int x = 20;
    public static void main(String[] args) {

         Test2 t1=new Test2();
        System.out.println(t1.x); //20

        System.out.println(C.x); // 10
       
       
    }
}