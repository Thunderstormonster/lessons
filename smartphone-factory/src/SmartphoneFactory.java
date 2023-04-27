import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class SmartphoneFactory implements Observed{
    List<String> messages=new ArrayList<>();
    List<Observer> subscribers=new ArrayList<>();

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

    public void addOrder(Order order) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfConveyor);

            boolean isEmpty = getQueueOfOrders().isEmpty();
            queueOfOrders.add(order);
            if (isEmpty) {
                executorService.submit(() -> {
                    produce();
                });
            }

    }

    public void  produce() {
        if (!queueOfOrders.isEmpty()) {
            Order order = queueOfOrders.poll();
            int amount = order.getAmount();
            Smartphone smartphone = order.getSmartphone();

            for (int i = 0; i < amount; i++) {
                Smartphone.cloneSmartphone();
            }
            notifyObservers();

        }

    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers){
            observer.handleEvent();
        }
    }


}