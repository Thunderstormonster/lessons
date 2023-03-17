import java.util.Scanner;

public class Application {

    public static Product[] stock={new Product("Smartphone","Xiaomi 12T Pro 12GB/256GB",2150.00,Categories.Electronics),
                                    new Product("Sofa","a piece of furniture that a few people can comfortably sit on together",14900.00,Categories.Furniture),
                                    new Product("Headphones","a hardware device that can be plugged into a computer, laptop, smartphone, mp3 player or other device to privately listen to audio without disturbing anyone in the vicinity",560.00,Categories.Accessories),
                                    new Product("trash","",22.00,Categories.Accessories)};

    public static void showProduct(){
        System.out.println("All available products: \n");
        for(int i=0;i<stock.length;i++){
            System.out.printf("Name: %s;\n",stock[i].name);
            System.out.printf("Description: %s;\n",stock[i].description);
            System.out.printf("Price: %f;\n",stock[i].price);
            System.out.printf("Category: %s;\n",stock[i].type);
            System.out.println("------------------------------------------\n");
        }
    }
    public static void main(String[] args) {
        Menu shopMenu=new Menu();

        Scanner choice=new Scanner(System.in);

        Product[] trashStock=new Product[2];

       while (true){
           switch (shopMenu.showMenu()){
               case 0:
                   System.exit(0);
                   break;
               case 1:
                   showProduct();
                   break;
               case 2:
                   trashStock[0]=shopMenu.createProduct();
                   System.arraycopy(trashStock,0,stock,3,1);
           }
       }


    }
}
