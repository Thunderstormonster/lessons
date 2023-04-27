import builder.Director;
import factory.Order;
import factory.Smartphone;
import builder.SmartphoneBuilder;
import factory.SmartphoneFactory;
import observe.Observer;
import smartphoneType.Status;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Application implements Observer {
    static SmartphoneFactory smartphoneFactory1=new SmartphoneFactory();
    public static File file=new File("F:\\lessons\\smartphone-factory\\orders.txt");
    public static Order order;
    String name;

    public Application(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDate = LocalDateTime.now().format(formatter);
        try{
            if(!file.exists())
                file.createNewFile();

            PrintWriter pw=new PrintWriter(file);
            pw.println(name+": complete order;\n");
            pw.println("==============================================\n");
            pw.println("factory.Order from " + order.getTimeAndDateOfOrder() + " in amount of " + order.getAmount() + " completed " + currentDate+"\n");
            pw.println(order.getSmartphone().toString());

            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Smartphone chooseYourPrice(){
        Director director=new Director();
        SmartphoneBuilder builder=new SmartphoneBuilder();
        Smartphone newSmartphone=null;
        String s="";

        Scanner in=new Scanner(System.in);

        System.out.println("What type of the phone do you choose?(Cheap,Middle,High)");
        switch (in.nextLine()){
            case "Cheap":
                System.out.println("You can choose where it come from: China or India");
                s=in.next();
                if(s.equals("China")){
                    director.constructNoNameChinaSmartphone(builder);
                    newSmartphone=builder.getResult();
                }else if(s.equals("India")){
                   director.constructNoNameIndiaSmartphone(builder);
                   newSmartphone=builder.getResult();
                }
                break;
            case "Middle":
                director.constructTaiwanSmartphone(builder);
                newSmartphone=builder.getResult();
                break;
            case "High":
                System.out.println("You can choose where it come from: USA or Korea");
                s=in.next();
                if(s.equals("USA")){
                   director.constructTopUsaSmartphone(builder);
                   newSmartphone=builder.getResult();
                }else if(s.equals("Korea")){
                   director.constructTopKoreaSmartphone(builder);
                   newSmartphone=builder.getResult();
                }
                break;
        }
        return newSmartphone;
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
                        Smartphone smartphone = chooseYourPrice();
                        String timeAndDateOfOrder = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                        order = new Order(timeAndDateOfOrder, Status.INPROCESS, smartphone, amount);
                        smartphoneFactory1.addOrder(order);
                        smartphoneFactory1.addObserver(new Application("Name"));

                        break;
            }

        }while(true);
    }
}
