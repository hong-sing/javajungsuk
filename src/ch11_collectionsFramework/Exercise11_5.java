package ch11_collectionsFramework;

import java.util.*;

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;
    int total;  //11_8번 추가
    int schoolRank; //11_8번 추가
    int classRank;  //11_9번 추가

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor + eng + math;   //11_8번 추가
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f)*10+0.5)/10f;
    }

    @Override
    public String toString() {
        return name +"," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage() + ","+ schoolRank + "," + classRank;   //11_8번 schoolRank추가  11_9 classRank 추가
    }

    // 11_5번
//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof Student) {
//            Student tmp = (Student) o;
//            return this.name.compareTo(tmp.name);
//        } else {
//            return -1;
//        }
//    }

    //11_8번
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            return (this.total - s.total) * -1;
        } else {
            return -1;
        }
    }
}

public class Exercise11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동", 1,1,100,100,100));
        list.add(new Student("남궁성", 1,2,90,70,80));
        list.add(new Student("김자바", 1,3,80,80,90));
        list.add(new Student("이자바", 1,4,70,90,70));
        list.add(new Student("안자바", 1,5,60,100,80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
