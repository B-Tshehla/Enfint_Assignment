import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static final int MAX = 10;
    public static void main(String[] args){
        ArrayList<Thread> robotList = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date currentDate = new Date();
        int robotNumber;
        boolean terminated = false;
        ExecutorService pool = Executors.newFixedThreadPool(MAX);
        System.out.println("New race started at " + formatter.format(currentDate));

        for (int i = 0; i < 10 ; i++) {
            robotNumber = i +1;
            Runnable robot = new Robot("Robot " + robotNumber);
            robotList.add(new Thread(robot));
        }
        for (Thread thread : robotList) {
            pool.execute(thread);
        }
        pool.shutdown();
        while(!terminated){
            if(pool.isTerminated()){
                Date finishDate = new Date();
                System.out.println("Race Finished at " + formatter.format(finishDate));
                terminated = true;
            }
        }

    }
}

class Robot implements Runnable{
    Random rand = new Random();

    private final String robotName;
    private final long startTime;



    Robot(String robotName){
        this.robotName = robotName;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public void run() {

        int x = 0;
        long finishTime;
        long results;
        int sec;
        int milSec;
        int speed = 1 + rand.nextInt(4);
        while (x <= 200){

            if (x % 2 == 0){
                speed = 1 + rand.nextInt(4);
            }
            x= x + speed;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        finishTime = System.currentTimeMillis();
        results = finishTime - startTime;
        sec = (int) (results / 1000);
        milSec = (int) (results % 1000);
        System.out.println(robotName + " finished in " + sec + "." +milSec + " Seconds.");

    }

}
