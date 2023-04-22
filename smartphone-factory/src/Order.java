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

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTimeAndDateOfOrder() {
        return timeAndDateOfOrder;
    }

    public void setTimeAndDateOfOrder(String timeAndDateOfOrder) {
        this.timeAndDateOfOrder = timeAndDateOfOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "timeAndDateOfOrder='" + timeAndDateOfOrder + '\'' +
                ", status=" + status +
                ", smartphone=" + smartphone +
                ", amount=" + amount +
                '}';
    }
}
