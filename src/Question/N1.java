package Question;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N1 implements Runnable{
    public static int j = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new N1(true));
        Thread thread2 = new Thread(new N1(true));
        Thread thread3 = new Thread(new N1(false));
        Thread thread4 = new Thread(new N1(false));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(N1.j);
    }

    private boolean flag ;
    N1(boolean f){
        flag = f;
    }
    @Override
    public void run() {
        if(flag){
            j++;
        }else{
            j--;
        }
        System.out.println(j);
    }
}
