import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public int showMenu(){
        System.out.println("4. Show logs");
        System.out.println("3. Buy product");
        System.out.println("2. Create a product");
        System.out.println("1. Show all products");
        System.out.println("0. Exit");

        Scanner num=new Scanner(System.in);

        return num.nextInt();
    }
    public Product createProduct() throws ParseException {
        Scanner in=new Scanner(System.in);

        String name;
        String description;
        BigDecimal price;
        Product created = null;
        String date;
        Date nowDate=new Date();
        DateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        date=sdf.format(nowDate);


        System.out.println("1. Enter product name: ");
        name=in.nextLine();
        System.out.println("2. Enter product description: ");
        description=in.nextLine();
        System.out.println("3. Enter the price of the product: ");
        price= BigDecimal.valueOf(in.nextInt());
        System.out.println("4. Enter product category(Electronics,Furniture,Accessories): ");

        switch (in.next()){
            case "Electronics": created=new Product(name,description,price,Categories.Electronics,date);
            break;
            case "Furniture": created=new Product(name,description,price,Categories.Furniture,date);
            break;
            case "Accessories": created=new Product(name,description,price,Categories.Accessories,date);
            break;
            default: System.out.println("Нет такой категории");
            break;
        }

        return created;

    }


}
