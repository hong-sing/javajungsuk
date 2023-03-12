package ch9_java.lang;

import java.util.Scanner;

public class Exercise9_11 {
    public static void main(String[] args) {
        int startDan = 0;
        int endDan = 0;

        try {
            if (args.length!=2)
                throw new Exception("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");

            startDan = Integer.parseInt(args[0]);
            endDan = Integer.parseInt(args[1]);

            if (!(2<=startDan && startDan<=9 && 2<=endDan && endDan<=9))
                throw new Exception("단의 범위는 2와 9사이의 값이어야 합니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("USAGE : GugudanTest 3 5");
            System.exit(0);
        }

        if (startDan>endDan) {
            int tmp = startDan;
            startDan = endDan;
            endDan = tmp;
        }

        for (int i=startDan; i<=endDan; i++) {
            for (int j=1; j<=9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
