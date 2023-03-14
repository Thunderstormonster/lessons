public class Bedroom extends Room {
    public Bedroom(String name,String description){
        this.name=name;
        this.description=description;
    }
    public Bedroom(String name){
        this(name,"");
    }

    public Item[] items={new Item("Окно","Окно с ручкой в дальней стене"),
            new Item("Тумбочка","Деревянная тумбочка у кровати"),
            new Item("Кровать","Незаправленная кровать из Икеи")};

    @Override
    public void printlItems(){
        System.out.printf("Предметы в комнате %s: ",name);
        for(int i=0;i<items.length;i++){
            if(i== items.length-1){
                System.out.printf(" %s.",items[i].name);
            }else{
                System.out.printf("%s,",items[i].name);
            }
        }
    }

}


