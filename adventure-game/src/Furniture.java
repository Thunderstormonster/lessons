public class Furniture extends Item implements Usable {
    String text;

    public Furniture(String name,String description){
        super(name,description);
    }

    public Furniture(String name,String description,String text){
        super(name,description);
        this.text=text;
    }


    public void use(){
        System.out.println(text);
    }
}
