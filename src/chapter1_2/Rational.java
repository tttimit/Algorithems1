package chapter1_2;

/**
 * Created by tttimit on 2016/3/24.
 * 有理数
 * 为有理数实现一个不可变数据类型Rational，支持加减乘除操作。无需测试溢出，只需要
 * 使用两个long型实例变量表示分子和分母来控制溢出的可能性。使用欧几里得算法来保证
 * 分子和分母没有公因子。编写一个测试用例检测你实现的所有方法。
 */
public class Rational {
    private final int numberator;
    private final int denominator;

    public Rational(int numberator, int denominator) {

        this.numberator = numberator;
        this.denominator = denominator;
    }
}
