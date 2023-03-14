import java.util.Scanner;
public class Game {
    static boolean isGameFinished=false;


    private static Bathroom bathroom1=new Bathroom("Ванная комната","Обычный совмещенный санузел");
    private static Bedroom bedroom1=new Bedroom("Спальня","Просторная спальня с двуспальной кроватью");
    private static Kitchen kitchen1=new Kitchen("Кухня","Большая кухня с совмещенной столовой");

    private static Room[] rooms={bathroom1,bedroom1,kitchen1};

    public static int showMenu(){
        System.out.println("2. Показать инвентарь;");
        System.out.println("1. Перейти в другую комнату;");
        System.out.println("0. Выход.");

        Scanner num=new Scanner(System.in);

        return num.nextInt();
    }
    public static int showRooms(){
        System.out.println("Все комнаты: ");
        for(int i=0;i<rooms.length;i++){

            System.out.printf("%d. %s; ",i,rooms[i].name);

        }
        Scanner num=new Scanner(System.in);

        return num.nextInt();

    }

    public static void main(String[] args) {
        System.out.println("Для начала тебе нужно ввести твое имя игрока. Имя игрока: ");

        Scanner name = new Scanner(System.in);

        Player player1=new Player(name.next());

        System.out.println(player1.name);

        do{
            switch (showMenu()){
                case 0:
                    System. exit(0);
                    break;
                case 1:
                    player1.setCurrentRoom(rooms[showRooms()]);
                    break;
                case 2:
                    player1.showItems();
                    break;
            }
        }while (!isGameFinished);

        if(isGameFinished){
            System.out.println("Поздравляем, вы победили!");
        }

    }
}
