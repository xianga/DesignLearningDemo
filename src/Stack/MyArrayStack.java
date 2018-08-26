package Stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

// 数组实现栈
public class MyArrayStack<T> implements Iterable<T> {
    // 栈内容
    private T[] items;
    // 栈内容大小
    private int n;

    public MyArrayStack(){
        items = (T[]) new Object[10];
        n = 0;
    }

    // 判断是否为空
    public boolean isEmpty(){
        return n ==0;
    }

    public void resize(int capacity){
        T[] a = (T[])new Object[capacity];
        for (int i = 0; i < items.length; i++) {
            a[i] = items[i];
        }
        items = a;
    }

    // 压入元素
    public void push(T item){
        if(n == items.length){
            resize(n * 2);
        }
        items[n++] = item;
    }

    // 弹出栈顶元素
    public T pop(){
        if(isEmpty())
            throw new NoSuchElementException();
        T item = items[n-1];
        items[--n] = null;
        return item;
    }

    public T peek(){
        if(isEmpty())
            throw new NoSuchElementException();
        return items[n-1];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


    public static void main(String[] args) {
        MyArrayStack<Integer> stack = new MyArrayStack<>();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(stack.pop());
        }
    }
}
