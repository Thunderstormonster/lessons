public class Task1 {
    public static void main(String[] args) {
        String[] names= new String[] {"John", "Bob", "Mary", "Peter", "Sarah"};

        //for
        for(int i=0;i<5;i++){
            if(names[i].length()<4){
                System.out.println("Ваше имя короче 4 букв - "+names[i]);
            }
            else if(names[i].length()>4){
                System.out.println("Ваше имя длиннее 4 букв - "+ names[i]);
            }
            else {
                System.out.println("Ваше имя состоит из 4 букв - "+names[i]);
            }
        }

        int i=0;
        //while
        while(i<=4){
            if(names[i].length()<4){
                System.out.println("Ваше имя короче 4 букв - "+names[i]);
            }
            else if(names[i].length()>4){
                System.out.println("Ваше имя длиннее 4 букв - "+ names[i]);
            }
            else {
                System.out.println("Ваше имя состоит из 4 букв - "+names[i]);
            }
            i++;
        }
        int j=0;
        //do-while
        do{
            if(names[j].length()<4){
                System.out.println("Ваше имя короче 4 букв - "+names[j]);
            }
            else if(names[j].length()>4){
                System.out.println("Ваше имя длиннее 4 букв - "+ names[j]);
            }
            else {
                System.out.println("Ваше имя состоит из 4 букв - "+names[j]);
            }
            j++;
        }while(j<=4);
    }
}
