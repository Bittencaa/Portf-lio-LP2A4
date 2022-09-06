package ExercicioA;

public class Main 	implements Runnable{

    @Override
    public void run() {
        System.out.println("Aqui quem fala é a " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        Thread principal = Thread.currentThread();
        System.out.println("Estamos na : " + Thread.currentThread().getName());
        Runnable runnable = new Main();
        Thread t = new Thread(runnable);
        t.start();

    }

}
