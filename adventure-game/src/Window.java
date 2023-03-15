public class Window extends Item implements Usable {
    String text;

    public Window(String name,String description){
        super(name,description);
    }

    public Window(String name,String description,String text){
        super(name,description);
        this.text=text;
    }

    public void use(){
        System.out.println(text);
    }
}
