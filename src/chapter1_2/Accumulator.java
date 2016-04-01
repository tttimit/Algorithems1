package chapter1_2;

/**
 * Created by Admin on 2016/3/25.
 * 累加器的方差。
 * 下面代码为Accumulator类添加了var()和stddev()方法，它们计算了addDataValue()方法
 * 的参数的方差和标准差，验证这段代码。
 * 与直接对所有数据的平方求和的方法相比较，这种实现能够更好地避免四舍五入产生的误差。
 *
 *
 * 不懂这道题目要做什么。。。=_=!
 */
public class Accumulator {
    private double m;
    private double s;
    private int N;

    public void addDataValue(double x) {
        N++;
        s = s + 1.0 * (N - 1) / N * (x - m) * (x - m);
        m = m + (x - m) / N;
    }

    public double mean() {
        return m;
    }

    public double var() {
        return s / (N - 1);
    }

    public double stddev() {
        return Math.sqrt(this.var());
    }
}
