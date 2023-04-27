package factory;

import smartphoneType.Status;

public class Order {
    private String timeAndDateOfOrder;
    private Status status;
    private Smartphone smartphone;
    private int amount;

    public Order(String timeAndDateOfOrder,Status status,Smartphone smartphone,int amount) {
        this.timeAndDateOfOrder=timeAndDateOfOrder;
        this.status=status;
        this.smartphone=smartphone;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public String getTimeAndDateOfOrder() {
        return timeAndDateOfOrder;
    }

    @Override
    public String toString() {
        return "factory.Order{" +
                "timeAndDateOfOrder='" + timeAndDateOfOrder + '\'' +
                ", status=" + status +
                ", smartphone=" + smartphone +
                ", amount=" + amount +
                '}';
    }
}
