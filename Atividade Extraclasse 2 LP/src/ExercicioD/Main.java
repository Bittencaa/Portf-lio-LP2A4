package ExercicioD;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Mythread());
        thread1.start();
        System.out.println("Tarefa iniciada");

        thread1.interrupt();
        System.out.println("Pedindo pra parar...");
    }
}
