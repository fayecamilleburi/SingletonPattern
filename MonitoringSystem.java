public class MonitoringSystem {

    public static void main(String[] args) {
        QueueSystem queue = QueueSystem.getInstance();

        queue.generateQueue();
        queue.generateQueue();
        queue.generateQueue();

        queue.resetQueue(30);

        queue.generateQueue();
        queue.generateQueue();
        queue.generateQueue();

        queue.resetQueue(150);

        queue.generateQueue();
        queue.generateQueue();
    }
}