package experimentdirectory;


import java.util.concurrent.*;

public class PrintTask implements Runnable {

    private final String message;
    private final ScheduledThreadPoolExecutor executor;
    private ScheduledFuture<?> scheduledFuture;
    private long sleepTime;

    public PrintTask(String message, ScheduledThreadPoolExecutor executor, long sleepTime) {
        this.message = message;
        this.executor = executor;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println("Starting with sleep " + String.valueOf(sleepTime));
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task executed with message " + message + "\n");
    }

    public void start(long initialDelay, long delay, TimeUnit timeUnit) {
        scheduledFuture = executor.scheduleWithFixedDelay(this, initialDelay, delay, timeUnit);
    }

    public void cancel() {
        scheduledFuture.cancel(false);
    }

    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(10);
        executor.setRemoveOnCancelPolicy(true);
        PrintTask task1 = new PrintTask("Task 1", executor, 5000);
        PrintTask task2 = new PrintTask("Task 2", executor, 15000);
        PrintTask task3 = new PrintTask("Task 3", executor, 20000);
        PrintTask task4 = new PrintTask("Task 4", executor, 25000);
        PrintTask task5 = new PrintTask("Task 5", executor, 30000);
        task1.start(0L, 800L, TimeUnit.MILLISECONDS);
        task2.start(0L, 900L, TimeUnit.MILLISECONDS);

        Thread.sleep(6000L);
        System.out.println("Init executor shutdown");
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        System.out.println("App shutdown");
    }
}
