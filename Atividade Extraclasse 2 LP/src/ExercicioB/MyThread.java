package ExercicioB;

public class MyThread implements Runnable{

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i=0; i<150; i++){
            System.out.println(name + "Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
