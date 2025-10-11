import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class peta {

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        singSong();
        System.out.println("jyzel sevila");
    }

    public static void animateText(String text, long delay) {
        lock.lock();
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                System.out.flush();
                Thread.sleep(delay);
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public static void singSong(String lyric, long delay, long speed) {
        try {
            Thread.sleep(delay);
            animateText(lyric, speed);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void singSong() {
        String[][] lyrics = {
                { "\nkayo po naka upo", "130" },
                { "subukan nyo namang tumayo", "230" },
                { "\nat baka matanaw at baka malaman na nyo?", "90" },
                { "Ang tunay na kalagayan ko", "80" },
                { "\n Ganito kasi yan eh.", "80" },
                
                { "\nTao po nandyan po ba kayo sa loob Malaking bahay at malawak na bakuran ", "80" },
                { "Mataas na pader pinapaligiran At naka pilang mga mamahaling sasakyan, " + 
                  "Mga bantay na laging bulong ng bulong", "80" }, 
                { "\nWala namang kasal pero marami ang naka barong  ", "40" },
                {"Lumakas man ang ulan ay walang butas ang bubong ", "40" },
        };

        long[] delays = { 300, 3900, 7000, 10500, 11000, 14000, 16500, 19000, 21500, 25000, };

        ExecutorService executor = Executors.newFixedThreadPool(lyrics.length);
        for (int i = 0; i < lyrics.length; i++) {
            final int index = i;
            executor.submit(() -> singSong(lyrics[index][0], delays[index], Long.parseLong(lyrics[index][1])));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
        }
    }
}


