package Queue;

import Stack.MyArrayStack;

import java.util.Iterator;

public class MyArrayQueue<T> implements Iterable<T> {
    private T[] items;
    private int first;
    private int last;
    private int n;

    public MyArrayQueue(){
        items = (T[])new Object[10];
        n = first = last =0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void resize(int capacity){
        T[] a = (T[]) new Object[capacity];
        for (int i = 0; i < items.length; i++) {
            a[i] = items[(first + i) % items.length];
        }
        items = a;
        first = 0;
        last = n;
    }

    public void enqueue(T item){
        if(n == items.length)
            resize(2 * n);
        items[last ++] = item;
        if(last == items.length) last = 0;
        n++;
    }

    public T dequeue(){
        T item = items[first];
        items[first] = null;
        n--;
        first++;
        if(first == items.length){
            first = 0;
        }
        return item;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


    public static void main(String[] args) {
        MyArrayQueue<Integer> queue = new MyArrayQueue<Integer>();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(queue.dequeue());
        }

    }
}
