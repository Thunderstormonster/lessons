import java.util.Scanner;
public class Game {
    static boolean isGameFinished=false;


    private static Bathroom bathroom1=new Bathroom("Ванная комната","Обычный совмещенный санузел");
    private static Bedroom bedroom1=new Bedroom("Спальня","Просторная спальня с двуспальной кроватью");
    private static Kitchen kitchen1=new Kitchen("Кухня","Большая кухня с совмещенной столовой");

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру House, твоя цель - найти выход из дома");

        System.out.println("Для начала тебе нужно ввести твое имя игрока. Имя игрока: ");

        Scanner name = new Scanner(System.in);

        Player player1=new Player(name.next());

        System.out.println(player1.name);

        System.out.println("Введите комнату или ее описание: ");

        Scanner in=new Scanner(System.in);

        switch(in.nextLine()){
            case "Ванная комната":{
                System.out.println("Описание комнаты: "+bathroom1.description);
                break;
            }
            case "Спальня":{
                System.out.println("Опсание комнаты: "+bedroom1.description);
                break;
            }
            case "Кухня":{
                System.out.println("Описание комнаты: "+kitchen1.description);
                break;
            }
            case "Обычный совмещенный санузел":{
                System.out.println("Название комнаты: "+bathroom1.name);
                break;
            }
            case "Просторная спальня с двуспальной кроватью":{
                System.out.println("Название комнаты: "+bedroom1.name);
                break;
            }
            case "Большая кухня с совмещенной столовой":{
                System.out.println("Название комнаты: "+kitchen1.name);
                break;
            }
        }

    }
}
