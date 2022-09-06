package ExercicioB;

public class Main {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Thread #1");
        Thread tr1 = new Thread(thread1);
        tr1.start();//poderia implementar no construtor
    }
}
