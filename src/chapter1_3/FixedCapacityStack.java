package chapter1_3;

/**
 * Created by Admin on 2016/3/30.
 */
public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public void push(Item i) {
        a[N++] = i;
    }

    public Item pop() {
        return a[--N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public static void main(String[] args) {
    }
}
