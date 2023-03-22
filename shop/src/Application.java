import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static FileUtil file=new FileUtil();
    public static ArrayList<Product> stock=file.readProduct();

    /*public static Product[] stock={new Product("Smartphone","Xiaomi 12T Pro 12GB/256GB",2150,Categories.Electronics),
                                    new Product("Settee Sofa","A settee has a wooden frame with a firm, straight back.",14900,Categories.Furniture),
                                    new Product("Headphones","Sony WH-1000XM4",560,Categories.Accessories),
                                    new Product("trash","",22,Categories.Accessories)};*/

    public static void showProduct(){
        System.out.println("All available products: \n");
        for(int i=0;i<stock.size();i++){
            System.out.printf("Name: %s;\n",stock.get(i).getName());
            System.out.printf("Description: %s;\n",stock.get(i).getDescription());
            System.out.printf("Price: %d;\n",stock.get(i).getPrice());
            System.out.printf("Category: %s;\n",stock.get(i).getType());
            System.out.println("------------------------------------------\n");
        }
    }
    public static void main(String[] args){
        Menu shopMenu=new Menu();

        Scanner choice=new Scanner(System.in);

        Product trashStock=null;

       while (true){
           switch (shopMenu.showMenu()){
               case 0:
                   System.exit(0);
                   break;
               case 1:
                   showProduct();
                   break;
               case 2:
                   trashStock=shopMenu.createProduct();
                   stock.add(trashStock);
                   break;
           }
       }
    }
}
