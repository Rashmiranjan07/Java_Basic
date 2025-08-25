
// Factorymethod :- It is the method which is called by its classname & it returns the object of that class .
// Predefined factory method
class Test {
    public static void main(String[] args) {
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1 == r2);

    }
}

// userdefine factory method
class Test1 {

    static Test1 t = new Test1();

    public static Test1 getTest1() {
        return t;
    }

    public static void main(String[] args) {
        Test1 t2 = Test1.getTest1();
        Test1 t3 = Test1.getTest1();
        System.out.println(t2 == t3);
        System.out.println(t == t2);
        System.out.println(t == t3);
    }
}

// another way
class Test2 {

    // static Test2 t=new Test2();
    public static Test2 getTest2() {
        return null;
    }

    public static void main(String[] args) {
        Test2 t2 = Test2.getTest2();
        Test2 t3 = Test2.getTest2();
        System.out.println(t2 == t3);

    }
}

// another way for understanding :-
class Test3 {

    static Test3 t = Test3.getTest3();

    public static Test3 getTest3() {
        return t;
    }

    public static void main(String[] args) {
        Test3 t2 = Test3.getTest3();
        Test3 t3 = Test3.getTest3();
        System.out.println(t2 == t3);
        System.out.println(t == t2);
        System.out.println(t == t3);
    }
}

// Singleton class :-
// If we are allowed to create at most one object of a class , then that class
// is known as singleton class .
class Test4 {

    static Test4 t = new Test4();

    private Test4() {

    }

    public static Test4 getTest4() {
        return t;
    }

    public static void main(String[] args) {
        Test4 t2 = Test4.getTest4();
        Test4 t3 = Test4.getTest4();
        System.out.println(t2 == t3);
        System.out.println(t == t2);
        System.out.println(t == t3);
    }
}