import java.io.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static FileUtil file=new FileUtil();
    public static ArrayList<Product> stock;
    public static ArrayList<LogEntry> logs;

    static {
        try {
            stock = file.readProduct();
            logs=file.readLogs();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void showProduct() {
        System.out.println("All available products: \n");
        for (int i = 0; i < stock.size(); i++) {
            System.out.printf("%d.Name: %s;\n",i, stock.get(i).getName());
            System.out.printf("Description: %s;\n", stock.get(i).getDescription());
            System.out.println("Price: " + stock.get(i).getPrice() + ";" + "\n");
            System.out.printf("Category: %s;\n", stock.get(i).getType());
            System.out.printf("Date: " + stock.get(i).getDate() + ";" + "\n");
            System.out.println("------------------------------------------\n");
        }
    }
        public static void showLog(){
            System.out.println("Products: \n");
            for (int i = 0; i < logs.size(); i++) {
                System.out.printf("%d.Name: %s;\n",i, logs.get(i).getNameProd());
                System.out.println("Price: " + logs.get(i).getPriceProd() + ";" + "\n");
                System.out.printf("Category: %s;\n", logs.get(i).getTypeProd());
                System.out.printf("Date: " + logs.get(i).getDateSell() + ";" + "\n");
                System.out.println("------------------------------------------\n");
            }
        }

    public static void main(String[] args) throws ParseException {
        Menu shopMenu=new Menu();

        //Scanner choice=new Scanner(System.in);

        ArrayList<Product> newStock=new ArrayList<>();
        Product product= null;
        LogEntry log=null;

      while (true){
           switch (shopMenu.showMenu()){
               case 0:
                   System.exit(0);
                   break;
               case 1:
                   showProduct();
                   break;
               case 2:
                   product=shopMenu.createProduct();
                   newStock.add(product);
                   file.saveProducts(newStock);
                   break;
               case 3:
                   file.buyProduct();
                   break;
               case 4:
                   showLog();
                   break;
           }
       }
    }
}
