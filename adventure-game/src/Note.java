public class Note extends Item implements Collectible, Usable {
    String text;

    public Note(String name,String description){
        super(name,description);
    }

    public Note(String name,String description,String text){
        super(name,description);
        this.text=text;
    }

    public void use(){
        System.out.printf("Текст записки: '%s'\n",text);
    }

}
