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



