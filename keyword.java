// this , super keyword :-
// this- it is used to call the current class non-static  variable .
// super - it iss used to call current class parent class non-static variable .


//this:-
class A01 {
    int num=10;
    public void m1(int num) {
        System.out.println(num);//20
        System.out.println(this.num);//10
    }
    public static void main(String[] args) {
        A01 a1=new A01();
        a1.m1(20);
    }
}


//super:-
class A02 {
    int num1=10;
}
class Test1 extends A02 {
    int num1 =20;
    public void m2() {
        System.out.println(this.num1);//10
        System.out.println(super.num1);//20
    }
    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.m2();
    }
}



//programm :-
class A03 {
    int num2=10;
}
class Test2 extends A03 {
    public void m1() {
        System.out.println(this.num2);//10
        System.out.println(super.num2);//10
    } 
    public static void main(String[] args) {
        Test2 t2=new Test2();
        t2.m1();
    }
}


class A04 {
    int num3=10;
}
class Test3 extends A04 {
    public void m2() {
        num3=20;
         System.out.println(this.num3);//20
        System.out.println(super.num3);//20
    }
    public static void main(String[] args) {
        Test3 t3=new Test3();
        t3.m2();
    }

}


class A05 {
    int num4=10;
}
class Test4 extends A05 {
    int num4=20;
    public void m3() {
        num4=30;
        System.err.println(this.num4);//30
        System.out.println(super.num4);//10
    }
    public static void main(String[] args) {
        Test4 t4=new Test4();
        t4.m3();
    }
}



class A06 {
    int num5=10;
}
class Test5 extends A06 {
    int num5=20;
    public void m4() {
      this.num5=30;
      super.num5=40;
        System.err.println(this.num5);//30
        System.out.println(super.num5);//40
    }
    public static void main(String[] args) {
        Test5 t4=new Test5();
        t4.m4();
    }
}


class A07 {
    int num6=10;
}
class Test6 extends A07 {
    int num6=20;
    public void m5(int num6) {
        num6=40;
        System.out.println(num6);//40
        System.out.println(this.num6);//20
        System.out.println(super.num6);//10
    }
    public static void main(String[] args) {
        Test6 t2=new Test6();
        t2.m5(30);
    }
}