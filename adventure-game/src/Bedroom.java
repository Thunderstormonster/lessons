public class Bedroom {
    String name;
    String description;

    public Bedroom(String name,String description){
        this.name=name;
        this.description=description;
    }
    public Bedroom(String name){
        this(name,"");
    }

    public static Item[] items={new Item("Окно","Окно с ручкой в дальней стене"),
            new Item("Тумбочка","Деревянная тумбочка у кровати"),
            new Item("Кровать","Незаправленная кровать из Икеи")};

}


