import java.util.Scanner;

public class Menu {
    public int showMenu(){
        System.out.println("2. Create a product");
        System.out.println("1. Show all products");
        System.out.println("0. Exit");

        Scanner num=new Scanner(System.in);

        return num.nextInt();
    }
    public Product createProduct(){
        Scanner in=new Scanner(System.in);

        String name;
        String description;
        Double price;
        Product created = null;

        System.out.println("1. Enter product name: ");
        name=in.nextLine();
        System.out.println("2. Enter product description: ");
        description=in.nextLine();
        System.out.println("3. Enter the price of the product: ");
        price=in.nextDouble();
        System.out.println("4. Enter product category(Electronics,Furniture,Accessories): ");

        switch (in.next()){
            case "Electronics": created=new Product(name,description,price,Categories.Electronics);
            break;
            case "Furniture": created=new Product(name,description,price,Categories.Furniture);
            break;
            case "Accessories": created=new Product(name,description,price,Categories.Accessories);
            break;
            default: System.out.println("Нет такой категории");
            break;
        }

        return created;

    }

}
