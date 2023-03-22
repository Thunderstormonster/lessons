import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtil {
    private static final String csvFile = "F:/docs/products.csv";

    public ArrayList<Product> readProduct() throws FileNotFoundException {
        String line = "";
        Scanner scanner=null;
        int index=0;
        ArrayList<Product> products=new ArrayList<>();

        try (BufferedReader br=new BufferedReader(new FileReader(csvFile))){
            while ((line = br.readLine()) != null) {
                Product prod=new Product();
                scanner =new Scanner(line);
                scanner.useDelimiter(",");
                while (scanner.hasNext()){
                    String data=scanner.next();
                    if(index==0)
                        prod.setName(data);
                    else if(index==1)
                        prod.setDescription(data);
                    else if(index==2)
                        prod.setPrice(Integer.parseInt(data));
                    else if(index==3)
                        prod.setType(Categories.valueOf(data));
                    else
                        System.out.println("Incorrect data "+data);
                    index++;
                }
                index=0;
                products.add(prod);
            }
        } catch (IOException e) {
            System.out.println("Please, check your file and parameters");
            e.printStackTrace();
        }
        return products;
    }

    public void saveProducts(ArrayList<Product> products){
        try{
            FileWriter fw=new FileWriter(csvFile,true);
            PrintWriter pw=new PrintWriter(fw);
            for(int i=0;i<products.size();i++) {
                Product prod=new Product(products.get(i).getName(),products.get(i).getDescription(),products.get(i).getPrice(),products.get(i).getType());
                pw.println(prod.toString());
            }
            pw.flush();
            pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


}
