package ch9_java.lang;

class Exercise9_8 {
    /*
    (1) round . 메서드를 작성하시오
    */
    static double round(double d, int n) {
        double a = d * Math.pow(10, n);
        a = Math.round(a);
        a = a/Math.pow(10, n);
        return a;
//        return Math.round(d * Math.pow(10, n)) / Math.pow(10, n);
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));
    }
}
