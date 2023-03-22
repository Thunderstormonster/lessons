import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static FileUtil file=new FileUtil();
    public static ArrayList<Product> stock;

    static {
        try {
            stock = file.readProduct();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

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

        ArrayList<Product> newStock=new ArrayList<>();
        Product product= null;

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
           }
       }
    }
}
