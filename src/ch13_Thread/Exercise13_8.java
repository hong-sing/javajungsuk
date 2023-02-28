package ch13_Thread;

import java.util.*;

/*
    다음의 코드는 텍스트기반의 타자연습게임인데 WordGenerator라는 쓰레드가
    Vector에 2초마다 단어를 하나씩 추가하고 사용자가 단어를 입력하면 Vector에서 일치하는 단어를 삭제하도록 되어 있다.
    WordGenerator의 run()을 완성하시오.
 */
class Exercise13_8
{
    Vector words = new Vector();
    String[] data = {"태연","유리","윤아","효연","수영","서현","티파니","써니","제시카"};
    int interval = 2 * 1000; // 2초
    WordGenerator wg = new WordGenerator();
    public static void main(String args[])
    {
        Exercise13_8 game = new Exercise13_8();
        game.wg.start();
        Vector words = game.words;
        while(true) {
            System.out.println(words);
            String prompt = ">>";
            System.out.print(prompt);

            // 화면으로부터 라인단위로 입력받는다.
            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();
            int index = words.indexOf(input);
            if(index!=-1) {
                words.remove(index);
            }
        }
    } // main
    class WordGenerator extends Thread {
        public void run() {
        /*
            (1) 아래의 로직에 맞게 코드를 작성하시오
            1. interval(2초)마다 배열 data의 값 중 하나를 임의로 선택해서
            2. words에 저장한다.
        */
            while (true) {
                int idx = (int) (Math.random() * data.length);
                words.add(data[idx]);
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) { }
            }
        } // end of run()
    } // class WordGenerator
} // Exercise13_9
