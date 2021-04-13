import java.util.Scanner;

public class Homework2_rainbow {
    public static void main(String[] args) {
        Scanner linenumber = new Scanner(System.in);
        System.out.println("Введите номер цвета радуги");

        int color = linenumber.nextInt();

        switch (color){
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Цвета с таким номером в радуге нет.");

        }
    }
}
