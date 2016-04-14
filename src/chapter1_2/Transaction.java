package chapter1_2;

import chapter1_3.Queue;
import edu.princeton.cs.algs4.In;

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

    public Transaction(String s){
        String[] ss = s.split(" ");
        date = new Date(ss[1]);
        customer = ss[0];
        money = Double.parseDouble(ss[2]);
    }
    /*
    读入格式为：客户、日期和金额，由空格分隔  Turing 5/22/1939 11.99
     */
    public static Transaction[] readTransaction(String input){
        In in = new In(input);
        Queue<String> q = new Queue<String>();
        while(!in.isEmpty()){
            q.enQueue(in.readString()+ " " + in.readString());
        }
        int N = q.size();
        Transaction[] transactions = new Transaction[N];
        for(int i = 0; i < N; i++) {
            transactions[i] = new Transaction(q.deQueue());
        }
        return transactions;
    }

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
