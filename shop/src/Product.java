import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private String name;
    private String description;
    private BigDecimal price;
    private Categories type;
    private String date;

    public Product(String name, String description, BigDecimal price,Categories type,String date){
        this.name=name;
        this.description=description;
        this.price=price;
        this.type=type;
        this.date=date;
    }

    public Product() {

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setPrice(BigDecimal price){
        this.price=price;
    }

    public Categories getType(){
        return type;
    }

    public void setType(Categories type){
        this.type=type;
    }

    public void setDate(String date){this.date=date;}

    public String getDate(){return date;}
    @Override
    public String toString(){
        return getName()+","+getDescription()+","+getPrice()+","+getType()+","+getDate();
    }

}
