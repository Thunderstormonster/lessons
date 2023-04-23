import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Application {

    static SmartphoneFactory smartphoneFactory1=new SmartphoneFactory();

    public static Smartphone createSmartphone(){
        Scanner in=new Scanner(System.in);

        String name;
        String model;
        int memoryCapacity;
        int screenSize;

        System.out.println("What is the name of your smartphone?");
        name=in.nextLine();
        System.out.println("What is the model of your smartphone?");
        model=in.nextLine();
        System.out.println("What is your smartphone memory capacity?");
        memoryCapacity=in.nextInt();
        System.out.println("What is your smartphone screen size?");
        screenSize=in.nextInt();

        Smartphone smartphone=new Smartphone(name,model,memoryCapacity,screenSize);

        return smartphone;
    }
    public static int showMenu(){
        System.out.println("1. Make an order;");
        System.out.println("0. Exit;");

        Scanner in=new Scanner(System.in);

        return in.nextInt();
    }
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        do{
            switch (showMenu()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                        System.out.println("How many smartphones do you want?");
                        int amount = in.nextInt();
                        Smartphone smartphone = createSmartphone();
                        String timeAndDateOfOrder = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                        Order order = new Order(timeAndDateOfOrder, Status.INPROCESS, smartphone, amount);
                        SmartphoneFactory.addOrder(order);
                        break;

            }

        }while(true);
    }
}
