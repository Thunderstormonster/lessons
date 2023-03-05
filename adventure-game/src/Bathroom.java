public class Bathroom {
    String name;
    String description;

    public Bathroom(String name,String description){
        this.name=name;
        this.description=description;
    }
    public Bathroom(String name){
        this(name,"");
    }

    public static Item[] items={new Item("Зеркал","Круглое зеркало над раковиной"),
            new Item("Раковина","Белая керамическая раковина")};


}
