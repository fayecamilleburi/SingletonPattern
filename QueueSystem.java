public class QueueSystem {
    private static QueueSystem instance;
    private int currentQueueNum = 0;

    private QueueSystem() {}

    public static synchronized QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized int generateQueue() {
        currentQueueNum++;
        System.out.println("Now Serving Customer " + currentQueueNum);
        return currentQueueNum;
    }

    public synchronized void resetQueue(int newQueue) {
        currentQueueNum = newQueue;
        System.out.println("Now Serving Customer " + currentQueueNum);
    }
}