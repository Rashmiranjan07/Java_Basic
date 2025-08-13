// Constyructor 
// it is a special type of method which is getting excuted at the time of object creation .
class C1 {
    C1()
    {
        System.out.println("heyy");
    }
    public static void main(String[] args) {
        C1 t1=new C1();  // heyy
    }
}




// rules :---
class Test1 {
    Test1(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        Test1 t1=new Test1();
    }
}
// without any return type we can call a constructor & it excuted at the time of object creation .


class Test2 {
    void Test2(){
        System.out.println("constructor"); // blank space 
    }
    public static void main(String[] args) {
        Test2 t1=new Test2();
    }
}
// When we give the return type to the constructor , it become a method & at the time of object creation , no-method is being excuted Therefore ...



class Test3 {
    void Test3(){
        System.out.println("constructor"); // blank space 
    }
    public static void main(String[] args) {
        Test3 t1=new Test3();
        t1.Test3();
    }
}
// When we give the return statement to a constructor it become method & it excuted after method calling 


class Test4 {
    Test4 () {
        System.out.println("constructor");
    }
    void Test4(){
        System.out.println("method"); // blank space 
    }
    public static void main(String[] args) {
        Test4 t1=new Test4(); // constructor
        t1.Test4(); // method 
    }
}
//In the case within a class one constructor & a method is present . At the time of object creation "constructor" called and at the time of method calling "method " is caalled ..




// rule -2 
// All the acess modifier are allowed for the constructor , but non -acess modifier are not allowed 
class Test5{
    public Test5() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        Test5 t1=new Test5();
    }
}


class Test6{
    private Test6() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        Test6 t1=new Test6();
    }
}


class Test7{
     Test7() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        Test7 t1=new Test7();
    }
}

class Test8{
    private Test8() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        Test8 t1=new Test8();
    }
}
