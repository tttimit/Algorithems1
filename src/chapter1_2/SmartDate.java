package chapter1_2;

/**
 * Created by Admin on 2016/3/24.
 * 1.2.11 根据Date的API实现一个SmartDate，当日期非法时抛出异常
 * <p>
 * 1.2.12 为SmartDate添加一个方法dayOfTheWeek()，为日期中每周的日
 * 返回Monday、Tuesday、Wednesday、Thursday、Friday、Saturday
 * 或Sunday中适当值。你可以假定时间是21世纪。
 */
public class SmartDate {
    private final int day;
    private final int month;
    private final int year;
    private final String[] WEEKS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public SmartDate(int day, int month, int year) {
        int day_max = getMonthDays(month, year);
        if (day < 1 || day > day_max)
            throw new RuntimeException("您输入的日期不合法！");
        if (year < 0)
            throw new RuntimeException("您输入的年份不合法！");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static void main(String[] args)
    {
        SmartDate sd = new SmartDate(6, 12, 2004);
        System.out.println(sd.dayOfTheWeek());
    }

    /*
    计算给定year是否是闰年
    口诀：
    1、四年一闰；
    2、百年不闰；
    3、四百年再闰；
     */
    private boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        return year % 4 == 0 && year % 100 != 0;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }

    /*
    返回当前日期对象是周几
    为了简化问题，题目说可以假定日期是21世纪，因此首先设定基准。
    2000年1月1日是星期六。因此可以确定此后每一年第一天是星期几，
    然后再确定该年中这一天距离第一天多长时间，转化为插值，然后
    根据第一天是星期几来确定这一天是星期几。
     */
    public String dayOfTheWeek() {
        int index = 5;  //2000年1月1日的是星期六
        int days = 0;
        for (int i = 2000; i < year; i++) {
            days += isLeapYear(i) ? 366 : 365;
        }
        for (int i = 1; i < month; i++) {
            days += getMonthDays(i, year);
        }
        days += day;

        return WEEKS[(index + days - 1) % 7];
    }

    /**
     * @param month 要计算天数的月
     * @param year  要计算天数的月所属的年份
     * @return 指定年份中月份的天数
     */
    private int getMonthDays(int month, int year) {
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year))
                    days = 29;
                else
                    days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                throw new RuntimeException("The month you input is invalid.");
        }
        return days;
    }
}
