package ch6_oop;

public class Student {
    String name;    // 학생 이름
    int ban;        // 반
    int no;         // 번호
    int kor;        // 국어점수
    int eng;        // 영어점수
    int math;       // 수학점수

    int getTotal() {
        return this.kor + this.eng + this.math;
    }

    float getAverage() {
        return (float) Math.round(((float) this.getTotal()/3)*10)/10;
//        return (int)(getTotal()/3f*10+0.5f)/10f;

        /*
            236 / 3 78 →
            236 / 3f 78.666664 →
            236 / 3f * 10 786.66664 →
            236 / 3f * 10 + 0.5 787.16664 →
            (int)(236 / 3f * 10 + 0.5) (int)787.16664 → → 787
            (int)(236 / 3f * 10 + 0.5) / 10 78 →
            (int)(236 / 3f * 10 + 0.5) / 10f 78.7
         */
    }
}
