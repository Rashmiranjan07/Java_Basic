// * write a program to prove the interface variable are bydefaultly static ?
interface A {
    int x = 10;
}

class i1 {
    public static void main(String[] args) {
        System.out.println(A.x); //10
    }
}
