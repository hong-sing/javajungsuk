package ch10_datetimeformat;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Exercese10_3 {
    public static void main(String[] args) {
        String data = "123,456,789.5";

        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#,####");

        try {
            Number num = df.parse(data);

            double d = num.doubleValue();
            System.out.println(Math.round(d));
            System.out.println(df2.format(d));

        } catch (ParseException e) { }
    }
}
