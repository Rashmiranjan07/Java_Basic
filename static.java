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


//We can write more than one static block inside a class but the flow of excution of the static block will be from top to bottom .


class B2 {
     static {
        System.out.println("static block-1"); // static block-1
    }
    public static void main(String[] args) {
        System.out.println("main"); //main
    }
     static {
        System.out.println("static block-2"); // static block -2
    }
}