public class Exam02 {
    public static void main(String[] args) {
        Exam01 outer = new Exam01();
        Exam01.Inner inner = outer.new Inner();

        inner.display();
    }
}