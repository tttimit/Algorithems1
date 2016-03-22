package chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by tttimit on 2016/3/22.
 */
public class Counter {
    private final String name;
    private int count;
    public Counter(String id){
        name = id;
    }
    public void increment(){count++;}
    public int tally(){
        return count;
    }

    @Override
    public String toString() {
        return count +" " + name;
    }

    public static void main(String[] args){
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        heads.increment();
        heads.increment();
        tails.increment();

        StdOut.println(heads + " " + tails);
        StdOut.println(heads.tally() + tails.tally());


    }
}
