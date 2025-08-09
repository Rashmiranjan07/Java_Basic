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


//3.if a class is declared as final then we cannot inherit that properties of that class .

// final class A3{

// }
// class B2 extends A3{

// }
// class Test3 {
//     public static void main(String[] args) {
        
//     }
// }

// but final class can be inherited the properties of normal class .


// 4. final class can contain both final & normal method 

final class A4{
    final void m1(){
        System.out.println("hello");
    }
    public void m2(){
        System.out.println("heyy");
    }
}
 class Test  {
public static void main(String[] args) {
    
}
    
}



//