
// Factorymethod :- It is the method which is called by its classname & it returns the object of that class .
// Predefined factory method
class Test {
    public static void main(String[] args) {
        Runtime r1=Runtime.getRuntime();
        Runtime r2=Runtime.getRuntime();
        System.out.println(r1==r2);

    }
}


// userdefine factory method 
class Test1 {

    static Test1 t=new Test1();
    public static Test1 getTest1() {
        return t;
    }
    public static void main(String[] args) {
        Test1 t2=Test1.getTest1();
        Test1 t3=Test1.getTest1();
        System.out.println(t2==t3);
        System.out.println(t==t2);
        System.out.println(t==t3);
    }
}



// another way 
class Test2 {

   // static Test2 t=new Test2();
    public static Test2 getTest2() {
        return null;
    }
    public static void main(String[] args) {
        Test2 t2=Test2.getTest2();
        Test2 t3=Test2.getTest2();
        System.out.println(t2==t3);
       
    }
}


