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
        v1.m1((int) 10.4); // downcasting
    }
}

// In non-primitive type
// exception case
class Exc {
    public void m1(int... x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Exc a1 = new Exc();
        a1.m1(10, 20, 30); // [I@4517d9a3
    }
}

// ex-2
// if we do not know thw number of value put in the time of method call then we should go for this type and if there is the chance of that not more than we should go for this type .
class Rupu {
    public void m2(int... x) {
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }

    public static void main(String[] args) {
        Rupu r1 = new Rupu();
        r1.m2(10, 20, 30);
    }
}


//ex-3
class Rupu1 {
     public void m2(int... x) {
        for(int i=0; i<=x.length-1; i++) {
            System.out.println(x[i]);
        }
     }
     public static void main(String[] args) {
        Rupu1 r2=new Rupu1();
        r2.m2(10,20,30);
     }
}

//ex-3
class Rupu2 {
     public void m2(boolean...b) {
        for(int i=0; i<=b.length-1; i++) {
            System.out.println(b[i]);
        }
     }
     public static void main(String[] args) {
        Rupu2 r2=new Rupu2();
        r2.m2(true,false,false,true);
     }
}



