public class Key extends Item implements Collectible, Usable {
    public Key(String name,String description){
        super(name,description);
    }

    public void use(){
        if(name.equals("Старинный ключ")){
            Game.isGameFinished=true;
        }else{
            System.out.println("Ничего не произошло");
        }
    }

}
