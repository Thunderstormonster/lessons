public class Bathroom extends Room {
    public Bathroom(String name,String description){
        this.name=name;
        this.description=description;
    }
    public Bathroom(String name){
        this(name,"");
    }

    public Item[] items={new Item("Зеркал","Круглое зеркало над раковиной"),
            new Item("Раковина","Белая керамическая раковина")};

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
