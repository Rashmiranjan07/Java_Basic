// Static block :- it is a block which will getting excuted automatically before the main method .
// Static block will excuted at the time of class loading .
class B1 {
    static {
        System.out.println("static block-1"); // static block
    }

    public static void main(String[] args) {
        System.out.println("main"); // main
    }
}

// We can write more than one static block inside a class but the flow of
// excution of the static block will be from top to bottom .

class B2 {
    static {
        System.out.println("static block-1"); // static block-1
    }

    public static void main(String[] args) {
        System.out.println("main"); // main
    }

    static {
        System.out.println("static block-2"); // static block -2
    }
}

// flow control :-
class Test {
    static int x = 10;
    static {
        m1();
        System.out.println("SB-1");
    }

    public static void m1() {
        System.out.println(y);
    }

    public static void main(String[] args) {
        m1();
        System.out.println("ME");
    }

    static {
        m2();
        System.out.println("SB-2");
    }

    public static void m2() {
        System.out.println(x);
    }

    static int y = 20;
}

// Direct read :-
class B3 {
    static int x = 10;
    static {
        System.out.println(x);
    }

    public static void main(String[] args) {

    }
}

// indirect read :-
class B4 {
    static int x = 10;
    static {
        m1();
    }

    public static void m1() {
        System.out.println(x);
    }

    public static void main(String[] args) {

    }
}

//

class B5 {

    static {
        m1();
    }

    public static void m1() {
        System.out.println(x);// 0
    }

    public static void main(String[] args) {

    }

    static int x = 10;
}