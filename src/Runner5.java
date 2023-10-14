import java.util.Scanner;

public class Runner5 {
    public static void main(String[] args) {
        //5. Написать консольное приложение, переводящее градусы Фаренгейта в градусы
        //Цельсия.
        //Температура по шкале Фаренгейта связана с температурой
        //по шкале Цельсия (t °С) соотношением t °С = 5/9 (t °F - 32)

        final int VAL = 32;
        double fareng = 0.0;
        double celsium = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в Фаренгейтах");
        fareng = scanner.nextDouble();

        celsium = (double) 5 / 9 *(fareng - VAL);

        System.out.println("Температура в Цельсиях: " +celsium);


    }
}
