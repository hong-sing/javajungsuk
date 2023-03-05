package ch6_oop;

public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        // p와 (2,2)의 거기를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}
