package ch13_Thread;

class Exercise13_6
{
    public static void main(String[] args) throws Exception
    {
        Thread4 th1 = new Thread4();
        th1.setDaemon(true);
        th1.start();
        try {
            th1.sleep(5*1000);
        } catch(Exception e) {}
        throw new Exception("꽝~!!!");
    }
}
class Thread4 extends Thread {
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
th1은 데몬 스레드이다. 데몬 스레드는 일반 스레드가 종료되면 같이 종료된다. 따라서 일반 스레드인 main 스레드에서 예외가 발생되어
종료되는 시점에 데몬 스레드인 th1도 종료된다.
 */
