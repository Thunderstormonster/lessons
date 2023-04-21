public enum Status {
    CREATED("Order is created"),
    INPROCESS("Order is in process"),
    COMPLETED("Order is completed");

    private final String meaning;
    Status(String meaning){
        this.meaning=meaning;
    }

    String getMeaning(){return meaning;}

}
