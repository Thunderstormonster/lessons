package factory;

import observe.Observed;
import observe.Observer;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SmartphoneFactory implements Observed {
    List<observe.Observer> subscribers=new ArrayList<>();
    public static Queue<Order> queueOfOrders=new LinkedList<>();
    static int numberOfConveyor=Runtime.getRuntime().availableProcessors();


    public SmartphoneFactory(){}

    public static Queue<Order> getQueueOfOrders() {
        return queueOfOrders;
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

            for (int i = 0; i < amount; i++) {
                Smartphone.cloneSmartphone();
            }
            notifyObservers();
        }
    }

    public static Smartphone createSmartphone(){
        String name;
        String model;

        Scanner in=new Scanner(System.in);

        System.out.println("What is the name of your smartphone?");
        name=in.nextLine();
        System.out.println("What is the model of your smartphone?");
        model=in.nextLine();

        Smartphone smartphone=new Smartphone(name,model);

        return smartphone;
    }
    @Override
    public void addObserver(observe.Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(observe.Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers){
            observer.handleEvent();
        }
    }
}