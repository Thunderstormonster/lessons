import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileUtil {
    private static final String csvFile = "F:/docs/products.csv";
    private static final String csvLog="F:/docs/logs.csv";
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ArrayList<Product> readProduct() throws FileNotFoundException {
        String line = "";
        Scanner scanner=null;
        int index=0;
        ArrayList<Product> products=new ArrayList<>();
        Date date=null;

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
                        prod.setPrice(BigDecimal.valueOf(Long.parseLong(data)));
                    else if(index==3)
                        prod.setType(Categories.valueOf(data));
                    else if(index==4) {
                        date=sdf.parse(data);
                        prod.setDate(sdf.format(date));
                    }
                    else
                        System.out.println("Incorrect data "+data);
                    index++;
                }
                index=0;
                products.add(prod);
            }
        } catch (IOException | ParseException e) {
            System.out.println("Please, check your file and parameters");
            e.printStackTrace();
        }
        return products;
    }

    public void saveProducts(ArrayList<Product> products){
        try(PrintWriter pw=new PrintWriter(csvFile);){
            for(int i=0;i<products.size();i++) {
                Product prod=new Product(products.get(i).getName(),products.get(i).getDescription(),products.get(i).getPrice(),products.get(i).getType(),products.get(i).getDate());
                pw.println(prod.toString());
            }
            pw.flush();
            pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void saveLogs(ArrayList<LogEntry> logs) {
        try(PrintWriter pw=new PrintWriter(csvLog);) {
            for (int i = 0; i < logs.size(); i++) {
                LogEntry log = new LogEntry(logs.get(i).getNameProd(), logs.get(i).getPriceProd(), logs.get(i).getTypeProd(), logs.get(i).getDateSell());
                pw.println(log.toString());
                pw.flush();
                pw.close();
            }
        }catch(IOException e) {
                e.printStackTrace();
            }
    }
    public ArrayList<LogEntry> readLogs() throws FileNotFoundException {
        String line = "";
        Scanner scanner=null;
        int index=0;
        ArrayList<LogEntry> logs=new ArrayList<>();
        Date date=null;

        try (BufferedReader br=new BufferedReader(new FileReader(csvLog))){
            while ((line = br.readLine()) != null) {
                LogEntry log=new LogEntry();
                scanner =new Scanner(line);
                scanner.useDelimiter(",");
                while (scanner.hasNext()){
                    String data=scanner.next();
                    if(index==0)
                        log.setNameProd(data);
                     else if(index==1)
                        log.setPriceProd(BigDecimal.valueOf(Long.parseLong(data)));
                    else if(index==2)
                        log.setTypeProd(Categories.valueOf(data));
                    else if(index==3) {
                        date=sdf.parse(data);
                        log.setDateSell(sdf.format(date));
                    }
                    else
                        System.out.println("Incorrect data "+data);
                    index++;
                }
                index=0;
                logs.add(log);
            }
        } catch (IOException | ParseException e) {
            System.out.println("Please, check your file and parameters");
            e.printStackTrace();
        }
        return logs;
    }
    public void buyProduct(){
        Scanner in =new Scanner(System.in);

        Application.showProduct();

        int id;
        Product boughtProd=null;

        System.out.println("Enter number of a product that you wanna buy: ");
        id=in.nextInt();

        for(int i=0;i<Application.stock.size();i++){
            if(id==i){
                boughtProd=Application.stock.get(i);
                Application.stock.remove(boughtProd);
            }
        }

        Application.file.saveProducts(Application.stock);

        Date date = new Date();
        ArrayList<LogEntry> logg=new ArrayList<>();
        LogEntry logToAdd=new LogEntry(boughtProd.getName(),boughtProd.getPrice(),boughtProd.getType(),sdf.format(date));

        logg.add(logToAdd);
        Application.file.saveLogs(logg);
        }


}
