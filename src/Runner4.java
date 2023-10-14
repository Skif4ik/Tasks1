import java.util.Scanner;

public class Runner4 {
    public static void main(String[] args) {
        //4. Создать консольное приложение, запрашивающее ввод имени пользователя и
        //выводящее на экран приветствие в виде «Hello, <введённое имя пользователя> !!!»

        String name = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        name = scanner.nextLine();

        System.out.println("Hello, " + name + "!!!");
    }
}
