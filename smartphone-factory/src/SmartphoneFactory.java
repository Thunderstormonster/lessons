import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SmartphoneFactory {
    public static Queue<Order> queueOfOrders=new LinkedList<>();
    static int numberOfConveyor=Runtime.getRuntime().availableProcessors();

    public SmartphoneFactory(Queue<Order> queueOfOrders) {
        this.queueOfOrders = queueOfOrders;
    }

    public SmartphoneFactory(){}

    public static Queue<Order> getQueueOfOrders() {
        return queueOfOrders;
    }

    public void setQueueOfOrders(Queue<Order> queueOfOrders) {
        this.queueOfOrders = queueOfOrders;
    }

    public static void addOrder(Order order) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfConveyor);

            boolean isEmpty = getQueueOfOrders().isEmpty();
            queueOfOrders.add(order);
            if (isEmpty) {
                executorService.submit(() -> {
                    produce();
                });
            }
    }

    public static void  produce() {
        if (!queueOfOrders.isEmpty()) {
            Order order = queueOfOrders.poll();
            int amount = order.getAmount();
            Smartphone smartphone = order.getSmartphone();

            for (int i = 0; i < amount; i++) {
                Smartphone.cloneSmartphone();
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String currentDate = LocalDateTime.now().format(formatter);

            System.out.println("Заказ от " + order.getTimeAndDateOfOrder() + " в количестве " + amount + " выполнен " + currentDate);

        }

    }
}