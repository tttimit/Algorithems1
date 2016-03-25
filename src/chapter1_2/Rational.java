package chapter1_2;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

/**
 * Created by tttimit on 2016/3/24.
 * 有理数
 * 为有理数实现一个不可变数据类型Rational，支持加减乘除操作。无需测试溢出，只需要
 * 使用两个long型实例变量表示分子和分母来控制溢出的可能性。使用欧几里得算法来保证
 * 分子和分母没有公因子。编写一个测试用例检测你实现的所有方法。
 *
 * 1.2.17 有理数实现的健壮性。
 * 使用断言来防止溢出
 */
public class Rational {
    private final long numberator;
    private final long denominator;

    public Rational(long numberator, long denominator) {
        long gcd;
        if((gcd = gcd(numberator, denominator)) != 1) {
            numberator /= gcd;
            denominator /= gcd;
        }
        this.numberator = numberator;
        this.denominator = denominator;
    }

    public Rational plus(Rational b){
        long re_n = numberator * b.denominator + denominator * b.numberator;
        assert re_n < Long.MAX_VALUE : "超出Long类型最大值范围";
        long re_d = denominator * b.denominator;
        assert  re_d < Long.MAX_VALUE : "超出Long类型最大值范围";

        long gcd = gcd(re_n, re_d);

        return new Rational(re_n / gcd, re_d / gcd);
    }
    public Rational minus(Rational b){
        long re_n = numberator * b.denominator - denominator * b.numberator;
        assert re_n < Long.MAX_VALUE : "超出Long类型最大值范围";
        long re_d = denominator * b.denominator;
        assert re_d < Long.MAX_VALUE : "超出Long类型最大值范围";

        long gcd = gcd(re_n, re_d);

        return new Rational(re_n / gcd, re_d / gcd);
    }
    public Rational times(Rational b){
        long re_n = numberator * b.numberator;
        assert re_n < Long.MAX_VALUE : "超出Long类型最大值范围";
        long re_d = denominator * b.denominator;
        assert re_d < Long.MAX_VALUE : "超出Long类型最大值范围";
        long gcd = gcd(re_n, re_d);

        return new Rational(re_n / gcd, re_d / gcd);
    }
    public Rational divides(Rational b){
        long re_n = numberator * b.denominator;
        assert re_n < Long.MAX_VALUE : "超出Long类型最大值范围";
        long re_d = denominator * b.numberator;
        assert re_d < Long.MAX_VALUE : "超出Long类型最大值范围";
        long gcd = gcd(re_n, re_d);

        return new Rational(re_n / gcd, re_d / gcd);
    }

    public boolean equals(Object that){
        if(this == that) return true;
        if(this.getClass() != that.getClass()) return false;

        Rational ra = (Rational)that;

        if(numberator != ra.numberator) return false;
        return denominator != ra.denominator;
    }



    @Override
    public String toString(){
        return numberator + "/" + denominator;
    }

    /*
    欧几里得算法
    实际上就是所谓的辗转相除法，返回两个数的公约数
     */
    public static long gcd(long p, long q){
        if(q == 0) return p;
        long r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args){
        Rational r1 = new Rational(21231123123224123L, 1123123123111231432L);
        Rational r2 = new Rational(16442123121231233L, 1181234411123231231L);

        System.out.println(Long.MAX_VALUE);
        System.out.println(r1.plus(r2));
        System.out.println(r1.minus(r2));
        System.out.println(r1.times(r2));
        System.out.println(r1.divides(r2));
    }

}
