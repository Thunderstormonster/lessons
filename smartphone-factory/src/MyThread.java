public class MyThread extends Thread{
    public MyThread(){

    }

    public void run(){
        System.out.println(SmartphoneFactory.getQueueOfOrders().peek().getSmartphone().toString());
        Smartphone.cloneSmartphone(SmartphoneFactory.getQueueOfOrders().peek().getSmartphone());
    }
}
