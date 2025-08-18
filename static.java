// Static block :- it is a block which will getting excuted automatically before the main method .
// Static block will excuted at the time of class loading .
class B1 {
    static {
        System.out.println("static block-1");
    }
    public static void main(String[] args) {
        System.out.println("main");
    }
}
