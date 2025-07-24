public class SequentialTest {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        TestSimulation.test1();
        TestSimulation.test2();
        TestSimulation.test3();

        long end = System.currentTimeMillis();
        System.out.println("Waktu total (sekuensial): " + (end - start) + " ms");
    }
}
