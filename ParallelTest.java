import java.util.concurrent.*;

public class ParallelTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        long start = System.currentTimeMillis();

        executor.submit(() -> {
            try { TestSimulation.test1(); } catch (InterruptedException e) {}
        });

        executor.submit(() -> {
            try { TestSimulation.test2(); } catch (InterruptedException e) {}
        });

        executor.submit(() -> {
            try { TestSimulation.test3(); } catch (InterruptedException e) {}
        });

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        long end = System.currentTimeMillis();
        System.out.println("Waktu total (paralel): " + (end - start) + " ms");
    }
}
