package chapter1_2;

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
