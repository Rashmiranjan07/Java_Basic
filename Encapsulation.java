class student {
    private int roll;

    public void setRoll(int roll1) {
        this.roll = roll1;
    }

    public int getRoll() {
        return roll;
    }
}
class Test {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setRoll(101);
        System.out.println(s1.getRoll());

        student s2 = new student();
        s2.setRoll(201);
        System.out.println(s2.getRoll());
    }
}