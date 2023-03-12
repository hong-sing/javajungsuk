package ch9_java.lang;

public class Exercise9_13 {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를" + stringCount(src, "aa") +"개 찾았습니다.");
    }
    static int stringCount(String src, String key) {
        return stringCount(src, key, 0);
    }
    static int stringCount(String src, String key, int pos) {
        int count = 0;
        int index = 0;
        if (key == null || key.length() == 0)
            return 0;
    /*
    (1) . 알맞은 코드를 넣어 완성하시오
    */
        while (true) {
            index = src.indexOf(key, pos);
            if (index!=-1) {
                pos = index + key.length();
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}

