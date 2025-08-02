// If we want to provide multiple number of value within a single variable inside the argument part of any method then we should go for var-arg concept .
class Va {
    public void m1(int... x) {
        System.out.println("var-arg");
    }

    public static void main(String[] args) {
        Va v1 = new Va();
        v1.m1(); // no argument
        v1.m1(10); // one argument
        v1.m1(10, 20, 30); // multiple argument
        v1.m1('a'); // upcasting 
        v1.m1((int) 10.4); //downcasting
    }
}



// In non-primitive type 
// exception case 
class Exc{
    public void m1(int...x)
    {
        System.out.println(x);
    }
    public static void main(String[]args)
    {
       Exc a1=new Exc();
       a1.m1(10,20,30); // [I@4517d9a3
    }
}
