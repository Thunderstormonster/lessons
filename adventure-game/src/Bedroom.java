public class Bedroom extends Room {
    public Bedroom(String name){
        this(name,"");
    }
    public Bedroom(String name,String description){
        this.name=name;
        this.description=description;
        this.items=new Item[]{new Window("Окно", "Окно с ручкой в дальней стене","прекрасный вид из окна"),
                new Note("Приветственная записка","Вступление","Привет , Игрок! Теперь ты можешь начать игру. Если тебе понадобится выйти, сначала возьми ножницы из выдвижного ящика стола."),
                new Furniture("Тумбочка","Деревянная тумбочка у кровати","на ней стояла прикроватная лампа и будильник"),
                new Furniture("Кровать","Незаправленная кровать из Икеи","выглядела достаточно нейдобной и жесткой"),
                new Key("Обычный ключ","Ключ от подвала")};
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


