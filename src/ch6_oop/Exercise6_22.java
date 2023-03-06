package ch6_oop;

class Exercise6_22 {
    static boolean isNumber(String str) {
        if (str==null || str.equals("")) {
            return false;
        } else {
            for (int i=0; i<str.length(); i++) {
                char check = str.charAt(i);
                if (check<'0' || check>'9') {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
