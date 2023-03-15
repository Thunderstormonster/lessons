public class Bathroom extends Room {
    public Bathroom(String name){
        this(name,"");
    }

    public Bathroom(String name, String description) {
        this.name=name;
        this.description=description;
        this.items=new Item[]{new Furniture("Зеркало","Круглое зеркало над раковиной"),
                new Furniture("Раковина","Белая керамическая раковина")};
    }


    @Override
    public void printItems(){
        System.out.printf("Предметы в комнате %s:",name);
        for(int i=0;i<items.length;i++){
            if(i== items.length-1){
                System.out.printf(" %d. %s.\n",i,items[i].name);
            }else{
                System.out.printf(" %d. %s;",i,items[i].name);
            }
        }
    }




}
