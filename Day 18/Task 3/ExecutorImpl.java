import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.lang.Runnable;


public class ExecutorImpl implements Executor {
    final Executor executor;
    final Queue<Runnable> tasks = new ArrayDeque<Runnable>();
    Runnable active;


    public ExecutorImpl (Executor executor){
        this.executor = executor;

    }

    public void execute(final Runnable r){
        tasks.offer(new Runnable() {
            public void run() {
                try {
                    r.run();
                } finally {
                    scheduleNext();
                }
            }
        });
        if (active == null) {
            scheduleNext();
        }
    }

    protected synchronized void scheduleNext() {
        if ((active = tasks.poll()) != null) {
            executor.execute(active);
        }
    }
    public void shutdown(){
        System.out.println("shutdown called");

        this.executorService.shutdown();

    }


}
