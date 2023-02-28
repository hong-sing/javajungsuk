package ch13_Thread;

class Exercise12_5
{
    public static void main(String[] args) throws Exception
    {
        Thread3 th1 = new Thread3();
        th1.start();
        try {
            Thread.sleep(5*1000); // main 5 . 쓰레드를 초간 정지시킨다
        } catch(Exception e) {}
        throw new Exception("꽝~!!!");
    }
}
class Thread3 extends Thread {
    public void run() {
        for(int i=0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    } // run()
}

/*
 다음의 코드를 실행한 결과를 예측하고 직접 실행한 결과와 비교하라 만일 예측한 결과와 실행한 결과의 차이가 있다면 그 이유를 설명하라.

 */

/*
    main과 th1은 별도의 호출스택에서 실행된다. 따라서 main에서 예외가 발생해서 종료되어 호출스택이 없어져도, th1이 있는 호출스택에는
    영향이 없어 th1은 계속 실행된다.
 */