import java.util.concurrent.TimeUnit;

public class cas
{
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.nanoTime();

        System.out.println("Die");
        System.out.println("Die");
        System.out.println("Die");

        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.println("Nanoseconds: " + timeElapsed);
    }
}