package ExercicioD;

public class Mythread implements Runnable{

    @Override
    public void run() {

        for (int i = 100; i < 5000; i++){
            System.out.println(i);
            if(Thread.currentThread().isInterrupted()) {
                System.out.println("Interrompendo a tarefa...");
                return;
            }
        }
    }
}
