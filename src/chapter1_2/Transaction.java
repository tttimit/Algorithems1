package chapter1_2;

/**
 * Created by tttimit on 2016/3/24.
 * 用我们对Date的实现作为模版实现Transaction类型。
 * 交易有3个属性，日期，客户，金额
 *
 * 14题，用Date中的equals方法的实现作为模版，实现Transaction中的equals方法。
 */
public class Transaction {
    private final Date date;
    private final String customer;
    private final double money;

    public Transaction(Date date, String customer, double money) {
        this.date = date;
        this.customer = customer;
        this.money = money;
    }

//    public Transaction(String s){
//        String[] ss = s.split(" ");
//
//    }

    public Date getDate() {
        return date;
    }

    public String getCustomer() {
        return customer;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", customer='" + customer + '\'' +
                ", money=" + money +
                '}';
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Transaction trans = (Transaction) o;

        if(!this.date.equals(trans.date)) return false;
        if(!customer.equals(trans.customer)) return false;
        return money == trans.money;
    }
}
