package ch13_Thread;

class Exercise13_2 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        t1.run();
        for(int i=0; i < 10; i++)
            System.out.print(i);
    }
}
class Thread2 extends Thread {
    public void run() {
        for(int i=0; i < 10; i++)
            System.out.print(i);
    }
}

// 위 코드의 실행결과로 옳은 것은?
/*
    a. 01021233454567689789처럼 0부터 9까지의 숫자가 섞여서 출력된다.
    b. 01234567890123456789처럼 0부터 9까지의 숫자가 순서대로 출력된다
    c. IllegalThreadStateException이 발생한다.
*/

/*
    6번째 줄에 start()가 아닌 run()을 호출했기 때문에 멀티 스레드가 아닌 싱글 스레드로 작동되어 b에 해당

 */