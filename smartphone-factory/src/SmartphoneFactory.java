import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

public class SmartphoneFactory {
    public static Queue<Order> queueOfOrders=new LinkedList<>();
    int numberOfConveyor=Runtime.getRuntime().availableProcessors();

    public SmartphoneFactory(Queue<Order> queueOfOrders) {
        this.queueOfOrders = queueOfOrders;
    }

    public SmartphoneFactory(){}

    public Queue<Order> getQueueOfOrders() {
        return queueOfOrders;
    }

    public void setQueueOfOrders(Queue<Order> queueOfOrders) {
        this.queueOfOrders = queueOfOrders;
    }

    public static void addOrder(Order order){
        queueOfOrders.add(order);
    }

    public static void  produce() {
            if(!queueOfOrders.isEmpty()){
                Order order=queueOfOrders.poll();
                int amount=order.getAmount();
                Smartphone smartphone=order.getSmartphone();

                for(int i=0;i<amount;i++){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    Smartphone newSmartphone=new Smartphone(smartphone.getName(),
                            smartphone.getModel(),smartphone.getMemoryCapacity(),
                            smartphone.getScreenSize());
                }
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String currentDate= LocalDateTime.now().format(formatter);

                System.out.println("Заказ от " + order.getTimeAndDateOfOrder() + " в количестве " + amount + " выполнен " + currentDate);

            }

    }


}
