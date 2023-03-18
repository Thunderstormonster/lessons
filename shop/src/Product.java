public class Product {
    private String name;
    private String description;
    private Double price;
    private Categories type;

    public Product(String name, String description, Double price,Categories type){
        this.name=name;
        this.description=description;
        this.price=price;
        this.type=type;
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

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price=price;
    }

    public Categories getType(){
        return type;
    }

    public void setType(Categories type){
        this.type=type;
    }

}
