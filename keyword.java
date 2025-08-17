// this , super keyword :-
// this- it is used to call the current class non-static  variable .
// super - it iss used to call current class parent class non-static variable .


//this:-
class A01 {
    int num=10;
    public void m1(int num) {
        System.out.println(num);
        System.out.println(this.num);
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
        System.out.println(this.num1);
        System.out.println(super.num1);
    }
    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.m2();
    }
}