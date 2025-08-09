// non-acess modifier :- the modifier which deals with the functanality of only class , methods & variables , is known as non acess variables.


//final:-
// 1. if a method declared as final then we can not override that method .
class A1 {
    final void m1(){
        System.out.println("hii");
    }
}

// //class B1 extends A1 {
//     public void m1(){
//         System.out.println("hello");
//     }
// }


class Test1 {
    public static void main(String[] args) {
        
    }
}


// 2. if a method is declared as final then it is not mandatory to declare the class as final.

class A2 {
    final void m1(){
        System.out.println("hii");
    }
}
class Test2 {
    public static void main(String[] args) {
        
    }
}
