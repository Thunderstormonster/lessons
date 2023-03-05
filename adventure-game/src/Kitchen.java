public class Kitchen {
    String name;
    String description;

    public Kitchen(String name,String description){
        this.name=name;
        this.description=description;
    }
    public Kitchen(String name){
        this(name,"");
    }

    public static Item[] items={new Item("Выдвижной ящик","Верхний ящик под столешницей")};

}
