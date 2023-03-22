public class Product {
    private String name;
    private String description;
    private int price;
    private Categories type;

    public Product(String name, String description, int price,Categories type){
        this.name=name;
        this.description=description;
        this.price=price;
        this.type=type;
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

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public Categories getType(){
        return type;
    }

    public void setType(Categories type){
        this.type=type;
    }

    @Override
    public String toString(){
        return getName()+","+getDescription()+","+getPrice()+","+getType();
    }

}
