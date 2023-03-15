import java.util.Scanner;

public class Player {
    String name;
    Item[] inventory=new Item[10];

    Room currentRoom;

    public Player(String name){
        this.name=name;
    }


    public void setCurrentRoom(Room currentRoom){
        this.currentRoom=currentRoom;
        System.out.println("Вы перешли в комнату  "+currentRoom.name+" .");
    }

    public void showItems(){
        System.out.println("Предметы в комнате: ");
        for(int i=0;i<currentRoom.items.length;i++){
            System.out.printf("- %s\n",currentRoom.items[i].name);
        }
    }

    public void interact(){
        currentRoom.printItems();

        Scanner in=new Scanner(System.in);

        System.out.println("Введите номер предмета:");

        int fm=in.nextInt();

        if(fm>currentRoom.items.length){
            System.out.println("Некорректный ввод2");
        }else {
            if (currentRoom.items[fm].getClass().equals(Key.class) || currentRoom.items[fm].getClass().equals(Note.class)) {

                System.out.println("Хотите взять(0) или вопользоваться(1)?");

                int fl = in.nextInt();

                if (fl == 0) {

                    for (int i = 0; i < inventory.length; i++) {
                        if (inventory[i] == null) {
                            inventory[i] = currentRoom.items[fm];
                            System.out.println("Вы добавили в инвентарь " + inventory[i].name);
                            break;
                        }
                    }
                } else if (fl == 1) {
                    currentRoom.items[fm].use();

                } else {
                    System.out.println("Неверный ввод");
                }
            } else {
                currentRoom.items[fm].use();
            }
        }
    }
}
