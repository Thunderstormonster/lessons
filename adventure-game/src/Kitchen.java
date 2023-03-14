public class Kitchen extends Room {
    public Kitchen(String name,String description){
        this.name=name;
        this.description=description;
    }
    public Kitchen(String name){
        this(name,"");
    }

    public Item[] items={new Item("Выдвижной ящик","Верхний ящик под столешницей")};

    @Override
    public void printlItems() {
        System.out.printf("Предметы в комнате %s: ", name);
        for (int i = 0; i < items.length; i++) {
            if (i == items.length - 1) {
                System.out.printf(" %s.", items[i].name);
            } else {
                System.out.printf("%s,", items[i].name);
            }
        }
    }

}
