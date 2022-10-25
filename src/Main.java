import java.util.Scanner;

/**
 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.

 === Ввод текста вместо числа не должно приводить к падению приложения,

 === вместо этого, необходимо повторно запросить у пользователя ввод данных.


 */

public class Main {
    public static void main(String[] args) {
        float f;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter float: ");
            try{
                f = sc.nextFloat();
                break;
            } catch (Exception ignored){
                System.out.println("Entered value isn't float!");
                sc = new Scanner(System.in);
            }
        }
        System.out.println("Entered number: " + f);
    }
}