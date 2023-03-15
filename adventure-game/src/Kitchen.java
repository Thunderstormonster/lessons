public class Kitchen extends Room {
    public Kitchen(String name){
        this(name,"");
    }

    public Kitchen(String name,String description){
        this.name=name;
        this.description=description;
        this.items=new Item[]{new Furniture("Выдвижной ящик","Верхний ящик под столешницей"),new Key("Старинный ключ","Выход")};
    }

    @Override
    public void printItems() {
        System.out.printf("Предметы в комнате %s:", name);
        for (int i = 0; i < items.length; i++) {
            if (i == items.length - 1) {
                System.out.printf(" %d. %s.\n",i, items[i].name);
            } else {
                System.out.printf(" %d. %s;",i, items[i].name);
            }
        }
    }

}
