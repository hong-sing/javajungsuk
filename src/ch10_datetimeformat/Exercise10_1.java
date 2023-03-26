package ch10_datetimeformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Exercise10_1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010,0,1);

        for (int i = 0; i < 12; i++) {
            int weekday = calendar.get(Calendar.DAY_OF_WEEK);   // 1일의 요일 구하기

            // 두번째 일요일은 1일의 요일에 따라 달라짐
            // 1일이 일요인인 경우 두번째 일요일은 8일이다. 1일이 다른 요일이면 16에서 1일의 요일(weekday)를 빼면 알 수 있다.
            int secondSunday = (weekday==1) ? 8 : 16-weekday;

            // 두번째 일요일로 cal의 날짜를 바꾼다.
            calendar.set(Calendar.DAY_OF_MONTH, secondSunday);

            Date date = calendar.getTime();
            System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(date));

            // 다음달 1일로 날짜를 바꾼다.
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH,1);
        }

    }
}
