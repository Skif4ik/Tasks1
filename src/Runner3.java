import java.util.Scanner;

public class Runner3 {
    public static void main(String[] args) {
        //3. Создать консольное приложение, вычисляющее процент от заданного числа

        double person = 0;
        double res = 0.0;
        final int HUNDRED = 100; //делитель
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        person = scanner.nextInt();

        res = person / HUNDRED;

        System.out.println("1 процент от заданного числа : " + res);

    }
}
