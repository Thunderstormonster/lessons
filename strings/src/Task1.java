import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 5 цифр: ");

        int[] array=new int[5];

        for(int i=0;i<5;i++) {
            array[i]=in.nextInt();
            if(array[i]%2==0){
                System.out.println("Число " +array[i]+ " - четное");
            }
            else{
                System.out.println("Число " +array[i]+ " - нечетное");
            }
        }

    }
}
