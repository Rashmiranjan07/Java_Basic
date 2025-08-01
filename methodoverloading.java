 // main method can be overloaded
 
 class Test{
    public static void main(int x) {
        System.out.println("abc");
        
    }
    public static void main(String[] args) {
        System.out.println("def");
        main(10);
    }
}
