import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {

    static SmartphoneFactory smartphoneFactory1=new SmartphoneFactory();

    public static Smartphone createSmartphone(){
        Scanner in=new Scanner(System.in);

        String name;
        String model;

        System.out.println("What is the name of your smartphone?");
        name=in.nextLine();
        System.out.println("What is the model of your smartphone?");
        model=in.nextLine();

        Smartphone smartphone=new Smartphone(name,model);

        return smartphone;
    }
    public static Smartphone chooseYourPrice(){
        Smartphone smartphone=createSmartphone();

        Smartphone newSmartphone=null;
        Scanner in=new Scanner(System.in);

        String c=null;
        String s=null;

        System.out.println("What type of the phone do you choose?(Cheap,Middle,High)");
        switch (in.nextLine()){
            case "Cheap":
                System.out.println("You can choose where it come from: China or India");
                s=in.next();
                if(s.equals("China")){
                    c="NoNameChinaSmartphone";
                }else if(s.equals("India")){
                    c="NoNameIndiaSmartphone";
                }
                newSmartphone=cooseYourType(c,smartphone);
                break;
            case "Middle":
                c="TaiwanSmartphone";
                newSmartphone=cooseYourType(c,smartphone);
                break;
            case "High":
                System.out.println("You can choose where it come from: USA or Korea");
                s=in.next();
                if(s.equals("USA")){
                    c="TopUsaSmartphone";
                }else if(s.equals("Korea")){
                    c="TopKoreaSmartphone";
                }
                newSmartphone=cooseYourType(c,smartphone);
                break;
        }
        return newSmartphone;
    }

    public static Smartphone cooseYourType(String type,Smartphone smartphone){

        Class aClass=null;

        if(type.equals("NoNameChinaSmartphone")){
            aClass=NoNameChinaSmartphone.class;
        }else if(type.equals("NoNameIndiaSmartphone")){
            aClass=NoNameIndiaSmartphone.class;
        }else if(type.equals("TaiwanSmartphone")){
            aClass=TaiwanSmartphone.class;
        }else if(type.equals("TopKoreaSmartphone")){
            aClass=TopKoreaSmartphone.class;
        }else if(type.equals("TopUsaSmartphone")){
            aClass=TopUsaSmartphone.class;
        }

        Annotation[] annotations = aClass.getAnnotations();


        for (Annotation annotation : annotations) {
            if(annotation instanceof BudgetSmartphone) {
                BudgetSmartphone bAnnotation = (BudgetSmartphone) annotation;
               smartphone.setMemoryCapacity(bAnnotation.memoryCapacity());
               smartphone.setScreenSize(bAnnotation.screenSize());
            }else if(annotation instanceof MidTierSmartphone){
                MidTierSmartphone mAnnotation = (MidTierSmartphone) annotation;
                smartphone.setMemoryCapacity(mAnnotation.memoryCapacity());
                smartphone.setScreenSize(mAnnotation.screenSize());
            }else if(annotation instanceof FlagshipSmartphone){
                FlagshipSmartphone fAnnotation=(FlagshipSmartphone) annotation;
                smartphone.setMemoryCapacity(fAnnotation.memoryCapacity());
                smartphone.setScreenSize(fAnnotation.screenSize());
            }

        }
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
                        Smartphone smartphone = chooseYourPrice();
                        String timeAndDateOfOrder = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                        Order order = new Order(timeAndDateOfOrder, Status.INPROCESS, smartphone, amount);
                        SmartphoneFactory.addOrder(order);
                        break;
                case 2:
                    Smartphone smartphone1=chooseYourPrice();
                    System.out.println(smartphone1.toString());


            }

        }while(true);
    }
}
