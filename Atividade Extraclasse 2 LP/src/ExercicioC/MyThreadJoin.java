package ExercicioC;

public class MyThreadJoin implements Runnable{
    private String name;
    private int time;

    public MyThreadJoin(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void run() {
        for (int i=0; i<8; i++){
            System.out.println(name + "Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
