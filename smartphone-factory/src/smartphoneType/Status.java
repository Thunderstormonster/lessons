package smartphoneType;

public enum Status {
    CREATED("factory.Order is created"),
    INPROCESS("factory.Order is in process"),
    COMPLETED("factory.Order is completed");

    private final String meaning;
    Status(String meaning){
        this.meaning=meaning;
    }

    String getMeaning(){return meaning;}

}
