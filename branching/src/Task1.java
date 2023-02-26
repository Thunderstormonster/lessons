import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int mark=101;

        if(mark>=1&&mark<=25){
            System.out.println("Плохо");
        }
        else if(mark>=26&&mark<=50){
            System.out.println("Ниже среднего");
        }
        else if(mark>=51&&mark<=75){
            System.out.println("Выше стреднего");
        }
        else if(mark>=76&&mark<=100){
            System.out.println("Отлично");
        }
        else if(mark>=101){
            System.out.println("Ошибка");
        }
        else if(mark<=0){
            System.out.println("Ошибка");
        }
    }
}
