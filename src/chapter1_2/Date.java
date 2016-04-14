package chapter1_2;

import chapter1_3.Queue;
import edu.princeton.cs.algs4.In;

/**
 * Created by tttimit on 2016/3/24.
 * 表1.2.12，一种对Date的实现的API
 */
public class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public Date(String s) {
        String[] ss = s.split("/");
        day = Integer.parseInt(ss[1]);
        month = Integer.parseInt(ss[2]);
        year = Integer.parseInt(ss[2]);
    }

    /*
    读取的数据格式是： Date 由斜杠分割的整数 形式为：5/22/1939
     */
    public static Date[] readDates(String input) {
        In in = new In(input);
        Queue<String> q = new Queue<String>();
        while(!in.isEmpty())
            q.enQueue(in.readString());

        int N = q.size();
        Date[] dates = new Date[N];
        for(int i = 0; i < N; i++){
            dates[i] = new Date(q.deQueue());
        }
        return dates;
//        String[] in = StdIn.readAllStrings();
//        Date[] dates = new Date[in.length];
//        for(int i = 0; i < in.length; i++){
//            dates[i] = new Date(in[i]);
//        }
//        return dates;
    }


    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Date date = (Date) o;

        if (month != date.month) return false;
        if (day != date.day) return false;
        return year == date.year;

    }

}
