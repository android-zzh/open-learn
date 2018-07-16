package chaper1;

import java.util.concurrent.TimeUnit;

public class Core {
    public static void main(String[] args) {
        UnSafeTask task = new UnSafeTask();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
