public class Exam01 {

    private int x = 100;

    class Inner {
        private int y = 200;

        public void display() {
            System.out.println("x : " + x);
            System.out.println("y : " + y);
        }
    }
}