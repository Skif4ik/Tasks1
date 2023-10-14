import java.util.Scanner;

public class Runner6 {
    public static void main(String[] args) {
        //6. Разработать приложение, вычисляющее величину скидки за покупку, если сумма
        //покупки от 0 рублей до 50, то скидка не предоставляется, если от 50 рублей до 100,
        //то скидка 1%, если более 100 рублей, то скидка 3%


        double sale = 0.0;
        double price = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму покупки");
        price = scanner.nextDouble();
        while (price < 0) {
            System.out.println("Некорректный ввод, попробуйте еще раз");
            price = scanner.nextDouble();
        }

        //1 вариант
        if (price < 50) {
            System.out.println("Недостаточная сумма для скидки");
        } else {
            if (price > 50 && price < 100) {
                sale = price * 1 / 100;
                System.out.println("Скидка 1%, составляет:" + sale);
            } else {
                sale = price * 3 / 100;
                System.out.println("Скидка 3%, составляет:" + sale);
            }
        }

        //2 вариант
        sale = (price < 50) ? 0 : (price > 50 && price < 100 ? price * 0.01 : price * 0.03);
        System.out.println("Скидка: " + sale);
    }
}