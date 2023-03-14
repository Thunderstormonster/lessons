public class Player {
    String name;
    Item[] inventory=new Item[10];

    Room currentRoom;

    public void setCurrentRoom(Room currentRoom){
        this.currentRoom=currentRoom;
        System.out.println("Вы перешли в комнату  "+currentRoom.name+" .");
    }

    public void showItems(){
        for(int i=0;i<inventory.length;i++){
            System.out.println("Инвентарь: "+inventory[i].name);
        }
    }

    public Player(String name){
        this.name=name;
    }
}
