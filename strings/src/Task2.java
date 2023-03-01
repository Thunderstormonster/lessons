import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сообщение: ");

        String str=in.next();

        System.out.println("Введите число: ");

        int num=in.nextInt();
        char[] arrayChar=str.toCharArray();

        for(int i=0;i<arrayChar.length;i++){
            arrayChar[i]+=num;
        }

        String str2=String.valueOf(arrayChar);

        System.out.printf("Исходное сообщение: %s, зашифрованное сообщение: %s, шифр: %d",str,str2,num);
    }
}
