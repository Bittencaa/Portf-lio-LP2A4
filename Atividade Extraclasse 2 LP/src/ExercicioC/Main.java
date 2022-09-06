package ExercicioC;

import ExercicioB.MyThread;

public class Main {

    public static void main(String[] args) {

        MyThreadJoin thread1 = new MyThreadJoin("Thread #1",1000);
        MyThreadJoin thread2 = new MyThreadJoin("Thread #2",1000);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();// A thread 2 só irá ser executada após o término da thread 1 devido ao join
        System.out.println("FIM");
    }
}
